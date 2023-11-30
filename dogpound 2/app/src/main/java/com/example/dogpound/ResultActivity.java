package com.example.dogpound;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity implements OnClickListener
{   //declare restart button and score variables
    private Button button_restart;
    private TextView textView_highScore, textView_score;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    //launches result page with components
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result); //sets result page layout

        //retrieve score and high score from MainActivity
        Bundle bundle = getIntent().getExtras();
        int highScore = bundle.getInt("HIGH_SCORE");
        int score = bundle.getInt("SCORE");

        //display score and high score
        textView_score = findViewById(R.id.score);
        textView_score.setText("Score: " + score); //displays score
        textView_highScore = findViewById(R.id.highscore);
        textView_highScore.setText("High Score: " + highScore); //displays high score

        //set up restart button function
        button_restart = findViewById(R.id.restart);
        button_restart.setOnClickListener(this);
    }

    @Override
    public void onClick(View again)
    {   //go to StartActivity page when restart button is clicked
        Intent StartActivity = new Intent(ResultActivity.this, StartActivity.class);
        startActivity(StartActivity); //start StartActivity
    }
}
