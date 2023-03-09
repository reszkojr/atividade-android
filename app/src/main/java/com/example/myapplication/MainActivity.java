package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.calcs.calcenvioresult.CalcEnvioResult;
import com.example.myapplication.calcs.calcvoltatela.CalcVoltaTela;

public class MainActivity extends AppCompatActivity {
    Button btnCalcSimples;
    Button btnCalcEnvioResult;
    Button btnCalcVoltaTela;
    Button btnJogoMemoria;

    Button btnNovoProjeto;
    Button btnAbrirProjeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcSimples = findViewById(R.id.btnCalcSimples);
        btnCalcEnvioResult = findViewById(R.id.btnCalcEnvioResult);
        btnCalcVoltaTela = findViewById(R.id.btnCalcVoltaTela);
        btnJogoMemoria = findViewById(R.id.btnJogoMemoria);

        btnNovoProjeto = findViewById(R.id.btnNovoProjeto);
        btnAbrirProjeto = findViewById(R.id.btnAbrirProjeto);

        btnCalcSimples.setOnClickListener(view -> {
           Intent in = new Intent(MainActivity.this, CalcEnvioResult.class);
           startActivity(in);
        });

        btnCalcEnvioResult.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CalcEnvioResult.class);
            startActivity(in);
        });

        btnCalcVoltaTela.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CalcVoltaTela.class);
            startActivity(in);
        });

        btnJogoMemoria.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, JogoMemoria.class);
            startActivity(in);
        });

        btnAbrirProjeto.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, AbrirProjeto.class);
            startActivity(in);
        });

        btnNovoProjeto.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, NovoProjeto.class);
            startActivity(in);
        });
    }
}