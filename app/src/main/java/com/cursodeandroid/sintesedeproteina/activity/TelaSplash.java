package com.cursodeandroid.sintesedeproteina.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cursodeandroid.sintesedeproteina.R;


public class TelaSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_SinteseDeProteina);
        setContentView(R.layout.activity_tela_splash);


        ImageView gif = findViewById(R.id.gife);

        //Glide.with(this).asGif().load(R.drawable.geifi).into(gif);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON);
        Glide.with(this).asGif().load(R.drawable.logoini).into(gif);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), TelaInicial.class));
                finish();
            }
        }, 3100);
    }
}