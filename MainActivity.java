package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable awakeAnimation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.animationdog);
        awakeAnimation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        awakeAnimation.start();
    }
}