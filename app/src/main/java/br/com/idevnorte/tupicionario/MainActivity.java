package br.com.idevnorte.tupicionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bichos
        TextView tvBichos = (TextView) findViewById(R.id.tvBichos);
        tvBichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BichosActivity.class);
                startActivity(i);
            }
        });

        //Culinaria
        TextView tvCulinaria = (TextView) findViewById(R.id.tvCulinaria);
        tvCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CulinariaActivity.class);
                startActivity(i);
            }
        });

        //Plantas
        TextView tvPlantas = (TextView) findViewById(R.id.tvPlantas);
        tvPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PantasActivity.class);
                startActivity(i);
            }
        });

        //Povos Nativos
        TextView tvPovosNativos = (TextView) findViewById(R.id.tvPovosNativos);
        tvPovosNativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PovosNativosActivity.class);
                startActivity(i);
            }
        });
    }
}
