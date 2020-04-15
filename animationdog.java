package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);//keep
        imageView.setBackgroundResource(R.drawable.animationdog);//keep
        AnimationDrawable AniDog = (AnimationDrawable) imageView.getBackground();//keep
        AniDog.start();//keep

    }
}
