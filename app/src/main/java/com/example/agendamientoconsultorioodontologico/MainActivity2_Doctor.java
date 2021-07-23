package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity2_Doctor extends AppCompatActivity {

    TextView miTextoView1, miTextoView2, miTextoView3, miTextoView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_doctor);

        miTextoView1 = (TextView) findViewById(R.id.txt_descripcion4);
        miTextoView2 = (TextView) findViewById(R.id.txt_descripcion2);
        miTextoView3 = (TextView) findViewById(R.id.txt_descripcion3);
        miTextoView4 = (TextView) findViewById(R.id.txt_descripcion4);

        miTextoView1.setText("Paciente: Jose Maria Lee\n" +
                "Fecha:15/05/2021\n" +
                "Hora: 15:15");
        miTextoView1.setTextColor(Color.WHITE);


        miTextoView2.setText("Paciente: Juan Raul Macillo\n" +
                "Fecha: 16/05/2021\n" +
                "Hora: 16:00");
        miTextoView2.setTextColor(Color.WHITE);

        miTextoView3.setText("Paciente: Jaime Ecker Mosquez\n" +
                "Fecha:17/05/2021\n" +
                "Hora: 12:10");
        miTextoView3.setTextColor(Color.WHITE);

        miTextoView4.setText("Paciente: Michael Castillo Espinoza\n" +
                "Fecha:15/05/2021\n" +
                "Hora: 15:15");
        miTextoView4.setTextColor(Color.WHITE);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu,mimenu);

        return true;
    }

    public void Descripcion(View view){
        Intent descripcion = new Intent(this,MainActivity_descripcion_doc.class);
        descripcion.putExtra("pasardatos","Paciente: Jose Maria Lee\\n\" +\n" +
                "                \"Fecha:15/05/2021\\n\" +\n" +
                "                \"Hora: 15:15");
        startActivity(descripcion);
    }


}