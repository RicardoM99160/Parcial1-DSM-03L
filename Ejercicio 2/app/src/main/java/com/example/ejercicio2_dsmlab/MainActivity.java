package com.example.ejercicio2_dsmlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etIngresoVotos;
    private TextView tvC1;
    private TextView tvC2;
    private TextView tvC3;
    private TextView tvC4;
    private TextView tvNulos;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIngresoVotos=(EditText)findViewById(R.id.etVotos);
        tvC1=(TextView)findViewById(R.id.tvC1);
        tvC2=(TextView)findViewById(R.id.tvC2);
        tvC3=(TextView)findViewById(R.id.tvC3);
        tvC4=(TextView)findViewById(R.id.tvC4);
        tvNulos=(TextView)findViewById(R.id.tvNulos);
        tvTotal=(TextView)findViewById(R.id.tvTotal);
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

        //Esto solo es para debug en este caso
        String vc1 = String.valueOf(porcenajeC1);
        String vc2 = String.valueOf(porcenajeC2);
        String vc3 = String.valueOf(porcenajeC3);
        String vc4 = String.valueOf(porcenajeC4);
        String vNulos = String.valueOf(porcenajeNulos);
        String total = String.valueOf(cantidadVotos);

        //Estas impresiones a un TextView tambien son para debug que haga bien los calculos
        tvTotal.setText(total);

        tvC1.setText(vc1);
        tvC2.setText(vc2);
        tvC3.setText(vc3);
        tvC4.setText(vc4);
        tvNulos.setText(vNulos);
    }
}