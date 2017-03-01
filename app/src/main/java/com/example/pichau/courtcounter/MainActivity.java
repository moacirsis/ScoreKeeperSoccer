package com.example.pichau.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int cardYellow = 0;
    int cardRed = 0;

    int goalTeamB = 0;
    int cardRedTeamB = 0;
    int cardYellowTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */
    public void addGoalForTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayForTeamA(goalTeamA);
    }

    /**
     * mark card red team A.
     */

    public void addCardRedForTeamA(View v) {
        cardRed = cardRed + 1;
        displayForTeamA(cardRed);
    }

    /**
     * mark card yellow team A.
     */
    public void addCardYellowForTeamA(View v) {
        cardYellow = cardYellow + 1;
        displayForTeamA(cardYellow);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCardRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.card_red_teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCardYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.card_yellow_teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 goal.
     */

    public void addGoalForTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayForTeamB(goalTeamB);
    }

    /**
     * mark card red team B.
     */

    public void addCardRedForTeamB(View v) {
        cardRedTeamB = cardRedTeamB + 1;
        displayForTeamB(cardRedTeamB);
    }
    /**
     * mark card yellow team B.
     */
    public void addCardYellowTeamB(View v) {
        cardYellowTeamB = cardYellowTeamB + 1;
        displayForTeamB(cardYellowTeamB);
    }

    public void displayCardRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.card_red_teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCardyellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.card_yellow_teamB);
        scoreView.setText(String.valueOf(score));
    }


    public void resetScore(View v) {
        int goalTeamA = 0;
        int cardYellow = 0;
        int cardRed = 0;
        int goalTeamB = 0;
        int cardRedTeamB = 0;
        int cardYellowTeamB = 0;
        displayForTeamA(goalTeamA);
        displayForTeamA(cardYellow);
        displayCardRedForTeamA(cardRed);
        displayCardYellowForTeamA(cardYellow);
        displayForTeamA(cardRed);
        displayForTeamB(goalTeamB);
        displayForTeamB(cardRedTeamB);
        displayCardRedForTeamB(cardRedTeamB);
        displayForTeamB(cardYellowTeamB);
        displayCardyellowForTeamB(cardYellowTeamB);
    }

}