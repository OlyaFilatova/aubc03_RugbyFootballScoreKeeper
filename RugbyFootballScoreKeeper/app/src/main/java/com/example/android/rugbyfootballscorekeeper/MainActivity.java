package com.example.android.rugbyfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // a successful penalty kick or a drop goal each score 3 points


    // drop goal scores 3 points
    final int DROP_GOAL_POINTS = 3;
    final String DROP_GOAL_STORY = "Drop goal!";
    // penalty goal count for 3 points
    final int PENALTY_POINTS = 3;
    final String PENALTY_STORY = "Penalty!";
    // Conversion scores 2 points;
    final int CONVERSION_POINTS = 2;
    final String CONVERSION_STORY = "Conversion!";
    // Try is worth 5 points
    final int TRY_POINTS = 5;
    final String TRY_STORY = "Try!";

    int teamAScore = 0;
    int teamBScore = 0;

    String teamAStory = "";
    String teamBStory = "";

    TextView teamAScoreView;
    TextView teamBScoreView;

    TextView teamAStoryView;
    TextView teamBStoryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScoreView = (TextView) findViewById(R.id.team_a_score);
        teamBScoreView = (TextView) findViewById(R.id.team_b_score);
        teamAStoryView = (TextView) findViewById(R.id.team_a_story);
        teamBStoryView = (TextView) findViewById(R.id.team_b_story);
    }

    public void addTeamADropGoalPoints(View view) {
        teamAScore += DROP_GOAL_POINTS;
        teamAStory += " " + DROP_GOAL_STORY;
        displayTeamAScore(teamAScore);
        displayTeamAStory(teamAStory);
    }

    public void addTeamAPenaltyPoints(View view) {
        teamAScore += PENALTY_POINTS;
        teamAStory += " " + PENALTY_STORY;
        displayTeamAScore(teamAScore);
        displayTeamAStory(teamAStory);
    }

    public void addTeamATryPoints(View view) {
        teamAScore += TRY_POINTS;
        teamAStory += " " + TRY_STORY;
        displayTeamAScore(teamAScore);
        displayTeamAStory(teamAStory);
    }

    public void addTeamAConversionPoints(View view) {
        teamAScore += CONVERSION_POINTS;
        teamAStory += " " + CONVERSION_STORY;
        displayTeamAScore(teamAScore);
        displayTeamAStory(teamAStory);
    }

    public void addTeamBDropGoalPoints(View view) {
        teamBScore += DROP_GOAL_POINTS;
        teamBStory += " " + DROP_GOAL_STORY;
        displayTeamBScore(teamBScore);
        displayTeamBStory(teamBStory);
    }

    public void addTeamBPenaltyPoints(View view) {
        teamBScore += PENALTY_POINTS;
        teamBStory += " " + PENALTY_STORY;
        displayTeamBScore(teamBScore);
        displayTeamBStory(teamBStory);
    }

    public void addTeamBTryPoints(View view) {
        teamBScore += TRY_POINTS;
        teamBStory += " " + TRY_STORY;
        displayTeamBScore(teamBScore);
        displayTeamBStory(teamBStory);
    }

    public void addTeamBConversionPoints(View view) {
        teamBScore += CONVERSION_POINTS;
        teamBStory += " " + CONVERSION_STORY;
        displayTeamBScore(teamBScore);
        displayTeamBStory(teamBStory);
    }

    public void displayTeamAStory(String story) {
        teamAStoryView.setText(story.trim());
    }

    public void displayTeamBStory(String story) {
        teamBStoryView.setText(story.trim());
    }

    public void displayTeamAScore(int score) {
        teamAScoreView.setText("" + score);
    }

    public void displayTeamBScore(int score) {
        teamBScoreView.setText("" + score);
    }

    public void resetPoints(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);

        teamAStory = "";
        teamBStory = "";
        displayTeamAStory(teamAStory);
        displayTeamBStory(teamBStory);
    }
}
