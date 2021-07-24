package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity2_Doctor extends AppCompatActivity {

    TextView miTextoView1, miTextoView2, miTextoView3, miTextoView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_doctor);

        miTextoView1 = (TextView) findViewById(R.id.txt_descriptivo);
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
    //Evento click cuando un item del menu es seleccionado
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.cerrarsesion:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Descripcion(View view){
        Intent descripcion = new Intent(this,MainActivity_descripcion_doc.class);
        descripcion.putExtra("pasardatos",miTextoView1.getText().toString());
        startActivity(descripcion);
    }

    public void Descripcion2(View view){
        Intent descripcion2 = new Intent(this,MainActivity_descripcion_doc.class);
        descripcion2.putExtra("pasardatos2","Paciente: Juan Raul Macillo\n" +
                "Fecha: 16/05/2021\n" +
                "Hora: 16:00");
        startActivity(descripcion2);
    }

    public void Descripcion3(View view){
        Intent descripcion3 = new Intent(this,MainActivity_descripcion_doc.class);
        descripcion3.putExtra("pasardatos3","Paciente: Jaime Ecker Mosquez\\n\" +\n" +
                "                \"Fecha:17/05/2021\\n\" +\n" +
                "                \"Hora: 12:10");
        startActivity(descripcion3);
    }
    public void Descripcion4(View view){
        Intent descripcion4 = new Intent(this,MainActivity_descripcion_doc.class);
        descripcion4.putExtra("pasardatos4","Paciente: Michael Castillo Espinoza\\n\" +\n" +
                "                \"Fecha:15/05/2021\\n\" +\n" +
                "                \"Hora: 15:15");
        startActivity(descripcion4);
    }

    public void CerrarSesion(View view){
        Intent cerrarsesion = new Intent(this,MainActivity.class);
        startActivity(cerrarsesion);

    }
}