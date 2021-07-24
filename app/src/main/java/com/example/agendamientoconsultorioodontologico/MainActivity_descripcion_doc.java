package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity_descripcion_doc extends AppCompatActivity {


    private TextView tv1;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_descripcion_doc);

        tv1 = (TextView)findViewById(R.id.txt_descriptivo);

        String dato = getIntent().getStringExtra("pasardatos");
        tv1.setText("consulta medica de caries \n" +
                "Limpieza bucal \n" +
                "Historial: se mando al paciente un antiflamatorio benzocaina\n"+ dato);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu2,mimenu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.salir:
                Intent intent = new Intent(this, MainActivity2_Doctor.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Salir(View view){
        Intent salir= new Intent(this,MainActivity2_Doctor.class);
        startActivity(salir);
    }
}