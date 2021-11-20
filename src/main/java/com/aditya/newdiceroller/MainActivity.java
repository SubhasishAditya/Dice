package com.aditya.newdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private ImageView imageViewDice;
    private Random rng= new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageViewDice=findViewById(R.id.IV_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rollDice();
            }
        });

    }


    private void rollDice(){
        int randomNumber= rng.nextInt(6)+1;
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageViewDice.startAnimation(anim);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.sound);
        mediaPlayer.start();



        switch(randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6r);
                break;


        }
    }
}