package com.example.agendamientoconsultorioodontologico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.agendamientoconsultorioodontologico.repo;

public class ConexionSQLiteDB extends SQLiteOpenHelper {

    public ConexionSQLiteDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);


    }

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


