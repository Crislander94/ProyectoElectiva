package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity_descripcion_doc extends AppCompatActivity {

//    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_descripcion_doc);



//        datos=getIntent().getExtras();
//        String datosobtenidos = datos.getString("pasardatos\n" +
//                "consulta medica de caries \n" +
//                "Limpieza bucal \n" +
//                "Historial: se mando al paciente un antiflamatorio benzocaina");
//        TextView mostrardatos= (TextView) findViewById(R.id.txt_des1);
//        mostrardatos.setText(datosobtenidos);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu2,mimenu);

        return true;
    }

    public void Salir(View view){
        Intent salir= new Intent(this,MainActivity2_Doctor.class);
        startActivity(salir);
    }
}