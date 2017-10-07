package com.example.android.footballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    int scoreTeamA = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addPointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays number of fouls for Team A.
     */
    int foulsTeamA = 0;
    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }
    public void addFoulForTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }
    /**
     * Here comes team B.
     */
    int scoreTeamB = 0;
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addPointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays nunmber of fouls for Team B.
     */
    int foulsTeamB = 0;
    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }
    public void addFoulForTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }
    /**
     * Here comes the reset button.
     */
    public void setToZero(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        foulsTeamA = 0;
        displayFoulsForTeamA(foulsTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        foulsTeamB = 0;
        displayFoulsForTeamB(foulsTeamB);
    }
}
