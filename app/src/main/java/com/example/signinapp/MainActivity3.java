package com.example.signinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));

    }
    public void lastActivity(View v){
        Toast.makeText(this, "Working in progress...!", Toast.LENGTH_SHORT).show();
    }
    public void img1(View v){
        Toast.makeText(this, "Its starts in future...", Toast.LENGTH_SHORT).show();
    }

}