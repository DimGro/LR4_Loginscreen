package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.net.URI;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.keanu2);
    }
}
