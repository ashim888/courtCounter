package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreCardA;
    TextView scoreCardB;
    Button threePointsA;
    Button threePointsB;
    Button twoPointsA;
    Button twoPointsB;
    Button onePointsA;
    Button onePointsB;
    Button resetScore;
    int scoreA=0;
    int scoreB=0;
    int totalScoreA=0;
    int totalScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreCardA =(TextView)findViewById(R.id.scoreCardA);
        scoreCardB =(TextView)findViewById(R.id.scoreCardB);
        threePointsA=(Button)findViewById(R.id.threePointsA);
        threePointsB=(Button)findViewById(R.id.threePointsB);
        twoPointsA=(Button)findViewById(R.id.twoPointsA);
        twoPointsB=(Button)findViewById(R.id.twoPointsB);
        onePointsA=(Button)findViewById(R.id.onePointsA);
        onePointsB=(Button)findViewById(R.id.onePointsB);
        resetScore=(Button)findViewById(R.id.threePointsA);

        threePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreA=totalScoreA+3;
                displayScoreA(totalScoreA);

            }
        });
        threePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreB=totalScoreB+3;
                displayScoreB(totalScoreB);
            }
        });
        twoPointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreA=totalScoreA+2;
                displayScoreA(totalScoreA);
            }
        });
        twoPointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreB=totalScoreB+2;
                displayScoreB(totalScoreB);
            }
        });
        onePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreA=totalScoreA+1;
                displayScoreA(totalScoreA);
            }
        });
        onePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreB=totalScoreB+1;
                displayScoreB(totalScoreB);
            }
        });
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

    public void displayScoreA(int number){
        scoreCardA.setText(Integer.toString(number));
    }
    public void displayScoreB(int number){
        scoreCardB.setText(Integer.toString(number));
    }
    public void resetScore(View view){
        totalScoreA=totalScoreB=0;
        scoreCardA.setText(Integer.toString(totalScoreA));
        scoreCardB.setText(Integer.toString(totalScoreB));
    }
}
