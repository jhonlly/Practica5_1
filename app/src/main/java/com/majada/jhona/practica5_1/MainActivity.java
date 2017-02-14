package com.majada.jhona.practica5_1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Buscar de donde viene "ANIM"
    public void onClickImatgeAnimal(View v) {
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.girar);
        v.startAnimation(animacion);


        MediaPlayer so = null;
        switch (v.getId()) {
            case R.id.pato:
                so = MediaPlayer.create(this, R.raw.anec);
                break;
            case R.id.gato:
                so = MediaPlayer.create(this, R.raw.gat);
                break;
            case R.id.caballo:
                so = MediaPlayer.create(this, R.raw.cavall);
                break;
            case R.id.perro:
                so = MediaPlayer.create(this, R.raw.gos);
                break;
            case R.id.porc:
                so = MediaPlayer.create(this, R.raw.porc);
                break;
            case R.id.vaca:
                so = MediaPlayer.create(this, R.raw.vaca);
                break;
        }

        so.start();

        // Alliberar el MediaPlayer quan acabi de reproduir la pista d'àudio
        so.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}