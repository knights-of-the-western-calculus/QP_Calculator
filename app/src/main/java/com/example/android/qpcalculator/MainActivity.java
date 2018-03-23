package com.example.android.qpcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score1 = 1026;
    int score2 = 1056;
    int result1 = 24;
    int result2 = 20;

    // Display for result
    public void quantity(double score) {
        TextView scoreView = (TextView) findViewById(R.id.result_text_view);
        scoreView.setText(String.valueOf(score));
    }

    // Set button behaviour
    public void resultClick(View view) {

        double finalResult = qpEquation();
        quantity(finalResult);
    }

    // QP equation
    public double qpEquation() {
        double finalFlash =
                (score1 * (0.1+((result1 - result2)/40)/10))-(score2*(0.1+((result2-result1)/40)/10));
        return finalFlash;
    }





}
