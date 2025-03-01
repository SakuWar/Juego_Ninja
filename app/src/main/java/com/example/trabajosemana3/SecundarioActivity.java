package com.example.trabajosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import modelos.Contenidos;
import modelos.Pagina;

public class SecundarioActivity extends AppCompatActivity {

    private String mNombre;
    private Contenidos mContenidos = new Contenidos();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mOpcion1;
    private Button mOpcion2;
    private Pagina mPaginaActiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundario);

        Intent intent = getIntent();
        mNombre = intent.getStringExtra("Nombre");  // Corrección de sintaxis

        mImageView = findViewById(R.id.contenidoImageView);
        mTextView = findViewById(R.id.contenidoTextView);
        mOpcion1 = findViewById(R.id.opcionButton1);
        mOpcion2 = findViewById(R.id.opcionButton2);

        loadPage(0);
    }

    private void loadPage(int i) {
        mPaginaActiva = mContenidos.getPage(i);
        Drawable drawable = getResources().getDrawable(mPaginaActiva.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = mPaginaActiva.getText();
        pageText = String.format(pageText, mNombre);

        mTextView.setText(pageText);

        if (mPaginaActiva.isFinal()) {
            mOpcion1.setVisibility(View.INVISIBLE);
            mOpcion2.setText("INTENTARLO DE NUEVO");
            mOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        } else {
            mOpcion1.setText(mPaginaActiva.getOpcion1().getText());
            mOpcion2.setText(mPaginaActiva.getOpcion2().getText());

            mOpcion1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPaginaActiva.getOpcion1().getNextPage();
                    loadPage(nextPage);
                }
            });

            mOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPaginaActiva.getOpcion2().getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }
}

