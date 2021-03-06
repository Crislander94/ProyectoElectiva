package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.DatePickerDialog;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.nio.channels.Channel;
import java.util.Calendar;

public class CreateCitPaciente extends AppCompatActivity {
    EditText TXT_US,TXT_PASS, TXT_EMAIL, TXT_PHONE;
    Button BTN_REGIS;
    RadioButton RDFemenino, RDMasculino;
    Calendar calendar;
    EditText dateinicio, datexp;
    private final static String CHANNEL_ID ="Notificaion";
    private final static int Notificacion_ID=0;

    ConexionSQLiteDB csb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cita_paciente);
        csb = new ConexionSQLiteDB(getApplicationContext(),"Registro",null,1);
        Spinner services = findViewById(R.id.spservices);
        Spinner proffesionals =  findViewById(R.id.spprofessional);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_professionals, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.service_odontologia, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        proffesionals.setAdapter(adapter);
        services.setAdapter(adapter1);
        dateinicio = findViewById(R.id.datefechainicio);
        calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        //Obtener la fecha del datePicker Seleccionada
        dateinicio.setOnClickListener(v ->{
            createNotiificaion();
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    CreateCitPaciente.this, (view, year1, month1, dayOfMonth) -> {
                month1 = month1 +1;
                String date_fecha_agendamiento = dayOfMonth+"/"+ month1 +"/"+ year1;
                dateinicio.setText(date_fecha_agendamiento);
            },year, month, day);
            datePickerDialog.show();
        });

        datexp = findViewById(R.id.datefechaexp);
        calendar = Calendar.getInstance();
        final int year2 = calendar.get(Calendar.YEAR);
        final int month3 = calendar.get(Calendar.MONTH);
        final int day2 = calendar.get(Calendar.DAY_OF_MONTH);
        //Obtener la fecha del datePicker Seleccionada
        datexp.setOnClickListener(v ->{
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    CreateCitPaciente.this, (view, year3, month2, dayOfMonth) -> {
                month2 = month2 +1;
                String date_exp = dayOfMonth+"/"+ month2 +"/"+ year3;
                datexp.setText(date_exp);
            },year2, month3, day2);
            datePickerDialog.show();
        });
    }
    public void GoMainActivityPaciente(View view){
        Intent i = new Intent(this, MainActivityPaciente.class);
        startActivity(i);
    }

    public void createNotiificaion(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),CHANNEL_ID );
        builder.setSmallIcon(R.drawable.circle);
        builder.setContentTitle("notificacion de registro");
        builder.setContentText("notificacion");
        builder.setColor(Color.BLUE);
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setLights(Color.MAGENTA, 1000,1000);
        builder.setVibrate(new long[]{1000,1000,1000,1000,1000});
        builder.setDefaults(Notification.DEFAULT_SOUND);

        NotificationManagerCompat notificationManagerCompat=  NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(Notificacion_ID,builder.build());


    }
}