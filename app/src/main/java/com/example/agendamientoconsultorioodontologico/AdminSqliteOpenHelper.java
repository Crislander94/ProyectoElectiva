package com.example.agendamientoconsultorioodontologico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;


public class AdminSqliteOpenHelper extends SQLiteOpenHelper {

    //private static final int DATABASE_VERSION =1;

    public AdminSqliteOpenHelper( Context context, String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //        String create_table = "CREATE TABLE users(" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "username TEXT, " +
//                "password TEXT, " +
//                "email TEXT, " +
//                "telefono TEXT, " +
//                "cedula TEXT, " +
//                "fecha_nac Text, " +
//                "ciudad Text, " +
//                "sexo TEXT )";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(repo.CREAR_TABLA_REGISTRO);
        db.execSQL(repo.CREAR_TABLA_RESERVACION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Registro");
        db.execSQL("DROP TABLE IF EXISTS Reservacion");
        onCreate(db);

    }
}