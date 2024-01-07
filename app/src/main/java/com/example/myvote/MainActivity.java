package com.example.myvote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
         //************   bar   *******************
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //*************   Fragment use *************


                if (savedInstanceState == null) {
                    // Create an instance of the main fragment
                    HomeFragment mainFragment = new HomeFragment();


                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.framelayout, mainFragment)
                            .commit();
                }


    }
    public void Welcome(View view){
        Intent intent =new Intent(this, Welcome_vote.class);
        startActivity(intent);

    }



    public void candidateBack(View view){

        HomeFragment mainFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout, mainFragment)
                .commit();
    }

    public void candidatebtn(View view){

            CandidatesFragment mainFragment = new CandidatesFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout, mainFragment)
                    .commit();
        }
    public void Settingbtn(View view){

        SettingsFragment mainFragment = new SettingsFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout, mainFragment)
                .commit();
    }

    public void help(View view){

        HelpFragment mainFragment = new  HelpFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout, mainFragment)
                .commit();
    }
    public void schedule(View view){

        ScheduleFragment mainFragment = new  ScheduleFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout, mainFragment)
                .commit();
    }

    public void ballot(View view){

        BallotFragment mainFragment = new BallotFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout, mainFragment)
                .commit();
    }

}
