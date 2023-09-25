package com.jonnycatano.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView tvFecha, tvCedula, tvNombre,tvBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNombre = findViewById(R.id.tvnombre);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        tvNombre.setText(nombre);

    }
}