package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity2_Doctor extends AppCompatActivity {

    TextView miTextoView1, miTextoView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_doctor);

        miTextoView1 = (TextView) findViewById(R.id.txt_descripcion4);
        miTextoView2 = (TextView) findViewById(R.id.txt_descripcion2);

        miTextoView1.setText("Paciente: Jose Maria Lee\n" +
                "Fecha:15/05/2021\n" +
                "Hora: 15:15");
        miTextoView1.setTextColor(Color.WHITE);
        miTextoView2.setText("Paciente: Juan Raul Macillo\n" +
                "Fecha: 16/05/2021\n" +
                "Hora: 16:00");
        miTextoView2.setTextColor(Color.WHITE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu,mimenu);

        return true;
    }


}