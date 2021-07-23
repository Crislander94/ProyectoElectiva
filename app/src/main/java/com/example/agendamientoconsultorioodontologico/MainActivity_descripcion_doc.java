package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity_descripcion_doc extends AppCompatActivity {

    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_descripcion_doc);
        datos=getIntent().getExtras();
        String datosobtenidos = datos.getString("pasardatos\n" +
                "consulta medica de caries ");
        TextView mostrardatos= (TextView) findViewById(R.id.txt_des1);
        mostrardatos.setText(datosobtenidos);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu2,mimenu);

        return true;
    }
}