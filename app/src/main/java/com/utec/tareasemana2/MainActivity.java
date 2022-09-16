package com.utec.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.utec.tareasemana2.models.Person;

public class MainActivity extends AppCompatActivity {
    public final static String PERSON_KEY = "com.utec.tareasemana2.PERSON";

    EditText txtNombre, txtApellido, txtEdad;
    Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        btnMostrar = findViewById(R.id.btnMostrar);
    }

    public void sendUserData(View view) {
        String nombre = txtNombre.getText().toString();
        String apellido = txtApellido.getText().toString();
        String strEdad = txtEdad.getText().toString();
        int edad = Integer.parseInt(strEdad);
        Person newPerson = new Person(nombre, apellido, edad);

        Intent intent = new Intent(this, DisplayDataActivity.class);
        intent.putExtra(PERSON_KEY, newPerson);
        startActivity(intent);
    }

}