package com.example.android.basketballgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int scoreHomeTeam = 0;
    private int scoreAwayTeam = 0;
    public static final int THREE_POINTS = 3;
    public static final int TWO_POINTS = 2;
    public static final int FREE_THROW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.Game_Over);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreAwayTeam > scoreHomeTeam) {
                    Toast.makeText(MainActivity.this, "Winner: Away Team", Toast.LENGTH_SHORT).show();
                } else if (scoreAwayTeam < scoreHomeTeam) {
                    Toast.makeText(MainActivity.this, "Winner: Home Team", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Draw", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void displayScoreForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForHomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + THREE_POINTS;
        displayScoreForHomeTeam(scoreHomeTeam);
    }

    public void twoPointsForHomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + TWO_POINTS;
        displayScoreForHomeTeam(scoreHomeTeam);
    }

    public void freeThrowForHomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + FREE_THROW;
        displayScoreForHomeTeam(scoreHomeTeam);
    }

    public void displayScoreForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForAwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + THREE_POINTS;
        displayScoreForAwayTeam(scoreAwayTeam);
    }

    public void twoPointsForAwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + TWO_POINTS;
        displayScoreForAwayTeam(scoreAwayTeam);
    }

    public void freeThrowForAwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + FREE_THROW;
        displayScoreForAwayTeam(scoreAwayTeam);
    }

    public void resetScore(View v) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;

        displayScoreForHomeTeam(scoreHomeTeam);
        displayScoreForAwayTeam(scoreAwayTeam);

    }
}
