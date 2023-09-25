package com.jonnycatano.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, cedula, fecha;
    String nom, ced, fec;

    Button a, b, c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        cedula = findViewById(R.id.cedula);
        fecha = findViewById(R.id.fechadenacimiento);
        a = findViewById(R.id.btnA);
        b = findViewById(R.id.btnB);
        c = findViewById(R.id.btnC);

        Intent enviarDatos = new Intent(MainActivity.this, ResultadoActivity.class);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nom = nombre.getText(). toString();
                ced = cedula.getText().toString();
                fec = fecha.getText().toString();
                enviarDatos.putExtra("nombre", nom);
                enviarDatos.putExtra("cedula", ced);
                enviarDatos.putExtra("fecha", fec);
                enviarDatos.putExtra("boton", "A");
                startActivity(enviarDatos);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nom = nombre.getText(). toString();
                ced = cedula.getText().toString();
                fec = fecha.getText().toString();
                enviarDatos.putExtra("nombre", nom);
                enviarDatos.putExtra("cedula", ced);
                enviarDatos.putExtra("fecha", fec);
                enviarDatos.putExtra("boton", "B");
                startActivity(enviarDatos);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nom = nombre.getText(). toString();
                ced = cedula.getText().toString();
                fec = fecha.getText().toString();
                enviarDatos.putExtra("nombre", nom);
                enviarDatos.putExtra("cedula", ced);
                enviarDatos.putExtra("fecha", fec);
                enviarDatos.putExtra("boton", "C");
                startActivity(enviarDatos);
            }
        });




    }
}