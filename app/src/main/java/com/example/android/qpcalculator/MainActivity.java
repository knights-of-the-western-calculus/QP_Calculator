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

    int partA = 1;
    int partB = 1;
    int partC = 1;
    int partD = 1;

    // Display for result
    public void quantity(int score) {
        TextView scoreView = (TextView) findViewById(R.id.result_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void resultClick(View view) {
        int finalFlash = partA + partB + partC + partD;
        quantity(finalFlash);
    }




}
