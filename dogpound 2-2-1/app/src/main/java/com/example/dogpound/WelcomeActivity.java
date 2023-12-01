package com.example.dogpound;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity 
{
    private static final long DELAY_TIME = 2000; //displays welcome page for 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome); //sets welcome page layout

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            //goes to StartActivity when 2 seconds are finished
            {
                //declare intent to switch to StartActivity
                Intent startIntent = new Intent(WelcomeActivity.this, StartActivity.class);
                
                startActivity(startIntent); //start StartActivity
                finish();
            }
        }, DELAY_TIME);
    }
}
