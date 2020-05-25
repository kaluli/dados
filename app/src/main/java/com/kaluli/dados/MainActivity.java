package com.kaluli.dados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int maxDices = 6;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tirarDados;
        tirarDados = findViewById(R.id.tirarDados);
        final ImageView imagen_dado1 = (ImageView) findViewById(R.id.dado1);
        final ImageView imagen_dado2 = (ImageView) findViewById(R.id.dado2);
        final ImageView imagen_dado3 = (ImageView) findViewById(R.id.dado3);
        final ImageView imagen_dado4 = (ImageView) findViewById(R.id.dado4);
        final ImageView imagen_dado5 = (ImageView) findViewById(R.id.dado5);

        final int[] dadosArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        tirarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                imagen_dado1.setImageResource(dadosArray[number]);
                number = randomNumberGenerator.nextInt(maxDices);
                imagen_dado2.setImageResource(dadosArray[number]);
                number = randomNumberGenerator.nextInt(maxDices);
                imagen_dado3.setImageResource(dadosArray[number]);
                number = randomNumberGenerator.nextInt(maxDices);
                imagen_dado4.setImageResource(dadosArray[number]);
                number = randomNumberGenerator.nextInt(maxDices);
                imagen_dado5.setImageResource(dadosArray[number]);
            }
        });
    }
}
