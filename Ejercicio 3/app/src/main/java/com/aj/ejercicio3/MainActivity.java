package com.aj.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner cargoEmpleado1= (Spinner) findViewById(R.id.spinner1);
        Spinner cargoEmpleado2= (Spinner) findViewById(R.id.spinner2);
        Spinner cargoEmpleado3= (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cargos_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cargoEmpleado1.setAdapter(adapter);
        cargoEmpleado2.setAdapter(adapter);
        cargoEmpleado3.setAdapter(adapter);


    }
}