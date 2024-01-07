package com.example.myvote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Signup_vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_vote);
    }

    public void gologin(View view){
        Intent intent =new Intent(this, Login_vote.class);
        startActivity(intent);
    }

}