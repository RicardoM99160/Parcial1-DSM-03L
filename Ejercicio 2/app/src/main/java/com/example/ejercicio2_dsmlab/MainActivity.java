package com.example.ejercicio2_dsmlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etIngresoVotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIngresoVotos=(EditText)findViewById(R.id.etVotos);
    }

    public void contar(View view){
        String votosCrudos = etIngresoVotos.getText().toString();

        votosCrudos = votosCrudos.replace(" ", "");

        String[] votosArray = votosCrudos.split(",", -2);

        int cantidadVotos = votosArray.length;

        int votosCadidato1 = 0;
        int votosCadidato2 = 0;
        int votosCadidato3 = 0;
        int votosCadidato4 = 0;
        int votosNulos = 0 ;

        for (String votos: votosArray)
        {
            if(votos.equals("1")){
                votosCadidato1 += 1;
            }

            else if(votos.equals("2")){
                votosCadidato2 += 1;
            }

            else if(votos.equals("3")){
                votosCadidato3 += 1;
            }
            else if(votos.equals("4")){
                votosCadidato4 += 1;
            }
            else{
                votosNulos += 1;
            }
        }

        //Calculo de porcentajes para todos los candidatos y votos nulos
        int porcenajeC1 = (votosCadidato1*100)/cantidadVotos;
        int porcenajeC2 = (votosCadidato2*100)/cantidadVotos;
        int porcenajeC3 = (votosCadidato3*100)/cantidadVotos;
        int porcenajeC4 = (votosCadidato4*100)/cantidadVotos;
        int porcenajeNulos = (votosNulos*100)/cantidadVotos;

        //Enviando datos a la siguiente actividad
        Intent i = new Intent(this,conteoVotos.class);
        i.putExtra("N1", ""+votosCadidato1);
        i.putExtra("N2", ""+votosCadidato2);
        i.putExtra("N3", ""+votosCadidato3);
        i.putExtra("N4", ""+votosCadidato4);
        i.putExtra("NN", ""+votosNulos);
        i.putExtra("P1", ""+porcenajeC1);
        i.putExtra("P2", ""+porcenajeC2);
        i.putExtra("P3", ""+porcenajeC3);
        i.putExtra("P4", ""+porcenajeC4);
        i.putExtra("PN", ""+porcenajeNulos);

        startActivity(i);

    }
}