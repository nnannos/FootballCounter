package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Button methods for  Team A Buttons
     */
    public void addGoalTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    public void addFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Button methods for  Team B Buttons
     */
    public void addGoalTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    public void addFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Reset Button method
     */
    public void resetScore(View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given goals and fouls for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goals and fouls for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}