package com.jonnycatano.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvFecha, tvCedula, tvNombre,tvBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNombre = findViewById(R.id.tvnombre);
        tvCedula = findViewById(R.id.tvcedula);
        tvFecha = findViewById(R.id.tvfecha);
        tvBoton = findViewById(R.id.tvboton);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String cedula = intent.getStringExtra("cedula");
        String fecha = intent.getStringExtra("fecha");
        String boton = intent.getStringExtra("boton");

        tvNombre.setText(nombre);
        tvCedula.setText(cedula);
        tvFecha.setText(fecha);
        tvBoton.setText(boton);

    }
}
