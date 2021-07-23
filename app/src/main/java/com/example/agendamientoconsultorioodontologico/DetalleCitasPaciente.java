package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetalleCitasPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_citas_paciente);
    }
    public void GoListCitasPaciente(View view){
        Intent i = new Intent(this, ListCitasPaciente.class);
        startActivity(i);
    }
}