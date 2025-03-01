package com.example.trabajosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mCampoNombre;
    private Button mBotonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCampoNombre = findViewById(R.id.nombreediText);
        mBotonInicio = findViewById(R.id.inicioButton);
        mBotonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre =mCampoNombre.getText().toString();
                starStory(nombre);
            }
        });

    }

    private void starStory(String nombre){
        Intent intent = new Intent(this, SecundarioActivity.class);
        intent.putExtra("Nombre", nombre);
        startActivity(intent);

    }
}