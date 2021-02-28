package com.example.ejercicio2_dsmlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class conteoVotos extends AppCompatActivity {

    TextView txtN1,txtN2,txtN3,txtN4,txtNN,txtP1,txtP2,txtP3,txtP4,txtPN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo_votos);

        //Inicializando todos los txts
        txtN1 = (TextView) findViewById(R.id.txtN1);
        txtN2 = (TextView) findViewById(R.id.txtN2);
        txtN3 = (TextView) findViewById(R.id.txtN3);
        txtN4 = (TextView) findViewById(R.id.txtN4);
        txtNN = (TextView) findViewById(R.id.txtNN);
        txtP1 = (TextView) findViewById(R.id.txtP1);
        txtP2 = (TextView) findViewById(R.id.txtP2);
        txtP3 = (TextView) findViewById(R.id.txtP3);
        txtP4 = (TextView) findViewById(R.id.txtP4);
        txtPN = (TextView) findViewById(R.id.txtPN);

        //Obtengo los datos del intent
        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        //Asigno los valores que provienen del intent a los txts
        txtN1.setText(bundle.getString("N1"));
        txtN2.setText(bundle.getString("N2"));
        txtN3.setText(bundle.getString("N3"));
        txtN4.setText(bundle.getString("N4"));
        txtNN.setText(bundle.getString("NN"));
        txtP1.setText(bundle.getString("P1"));
        txtP2.setText(bundle.getString("P2"));
        txtP3.setText(bundle.getString("P3"));
        txtP4.setText(bundle.getString("P4"));
        txtPN.setText(bundle.getString("PN"));
    }

    public void regresar(View v){
        finish();
    }
}