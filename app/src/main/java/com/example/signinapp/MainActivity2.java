package com.example.signinapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {
TextInputEditText loginEmail, loginPassword;
Button buttonReg;
FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        mAuth = FirebaseAuth.getInstance();
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));
//        loginEmail = findViewById(R.id.loginEmail);
//        loginPassword = findViewById(R.id.pass);
//        buttonReg = findViewById(R.id.blogin);
    }
    public void openActivity3(View v){
        Toast.makeText(this, "Redirecting to Log-in form", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }
    public void signActivity(View v) {
        Toast.makeText(this, "wait for a sec", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);

    }
}