package com.example.myappfelipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actividadDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
    }


    public void atras(View atras) {

        Intent andres = new Intent(actividadDos.this,MainActivity.class);
        startActivity(andres);

    }
}