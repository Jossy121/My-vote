package com.example.myvote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login_vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_vote);
    }

    public void main(View view){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}