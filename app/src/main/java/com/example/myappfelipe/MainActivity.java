package com.example.myappfelipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private EditText passwordd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario= (EditText)findViewById(R.id.users);
        passwordd=(EditText)findViewById(R.id.password);
    }
    public void Loguearse(View list){
        String usuarioparseado=usuario.getText().toString();
        String passwordparseado=passwordd.getText().toString();

        if(usuarioparseado.isEmpty() || passwordparseado.isEmpty() ){
            Toast toast = Toast.makeText(this, "Campo vacio", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(usuarioparseado.equals("student") && passwordparseado.equals("123456"))
        {
            Intent andres = new Intent(MainActivity.this,actividadDos.class);
            startActivity(andres); //pasar a la siguiente actividad
        }
        if(usuarioparseado!=("student") || passwordparseado!=("123456")){
            Toast toast = Toast.makeText(this, "las credenciales no coinciden", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}