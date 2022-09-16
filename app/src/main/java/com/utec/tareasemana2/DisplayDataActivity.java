package com.utec.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.utec.tareasemana2.models.Person;

public class DisplayDataActivity extends AppCompatActivity {
    TextView txtDisplayNombre, txtDisplayApellido, txtDisplayEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        txtDisplayNombre = findViewById(R.id.txtDisplayNombre);
        txtDisplayApellido = findViewById(R.id.txtDisplayApellido);
        txtDisplayEdad = findViewById(R.id.txtDisplayEdad);

        showData();
    }

    public void showData() {
        Intent intent = getIntent();
        Person receivedPerson = (Person) intent.getSerializableExtra(MainActivity.PERSON_KEY);
        if (receivedPerson != null) {
            txtDisplayNombre.setText(receivedPerson.getNombre());
            txtDisplayApellido.setText(receivedPerson.getApellido());
            txtDisplayEdad.setText(receivedPerson.getEdad().toString());
        }
    }
}