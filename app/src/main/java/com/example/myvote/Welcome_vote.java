package com.example.myvote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome_vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_vote);
    }
    public void gosignup(View view){
        Intent intent =new Intent(this, Signup_vote.class);
        startActivity(intent);
    }


}