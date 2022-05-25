package com.example.imagerecognition77229152;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {

    Thread splash;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        imageView=(ImageView)findViewById(R.id.imageview);
        //Animation animation= AnimationUtils.loadAnimation(this, com.google.android.material.R.anim.fade);
        // imageView.startAnimation(animation);
        splash=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent i =new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {

                    Toast.makeText(WelcomeScreen.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        };
        splash.start();
    }
}