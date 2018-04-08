package com.example.user.trip;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceSteate){
        super.onCreate(savedInstanceSteate);

        try{
            Thread.sleep(4000);

        }
        catch (InterruptedException e){
            e.printStackTrace();

        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
