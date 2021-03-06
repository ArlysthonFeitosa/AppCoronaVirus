package com.example.covid_19.consulta.perguntas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid_19.consulta.orientacoes.HospitalNotCovid;
import com.example.covid_19.consulta.orientacoes.IsolamentoRigido;
import com.example.covid_19.R;

public class NotDoresParaCansaco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_dores_para_cansaco);
    }

    public void clicouSim(View v){
        Intent intent = new Intent(getApplicationContext(), HospitalNotCovid.class);
        startActivity(intent);
        finish();
    }

    public void clicouNao(View v){
        Intent intent = new Intent(getApplicationContext(), IsolamentoRigido.class);
        startActivity(intent);
        finish();
    }
}
