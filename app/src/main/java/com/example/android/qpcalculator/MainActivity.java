package com.example.android.qpcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score1;
    int score2;
    int result1;
    int result2;
    int questionNumber = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Display for result
    public void result(double score) {
        TextView scoreView = (TextView) findViewById(R.id.result_text_view);
        scoreView.setText(String.valueOf(score));
    }

    // Display for number of questions
    public void questionNumberDisplay(int number) {
        TextView questionView = (TextView) findViewById(R.id.question_text_view);
        questionView.setText(String.valueOf(number));
    }

    // Set behaviour for increment and decrement
    public void decrementClick(View view) {
        if (questionNumber > 1) {
            questionNumber = questionNumber - 1;
            questionNumberDisplay(questionNumber);
        } else {
            return;
        }
    }

    public void incrementClick(View view) {
        questionNumber = questionNumber + 1;
        questionNumberDisplay(questionNumber);
    }

    // Set button behaviour for result click
    public void resultClick(View view) {
        double finalResult = qpEquation();
        result(finalResult);
    }

    // QP equation
    public double qpEquation() {
        EditText score1edit = (EditText) findViewById(R.id.score1_edit_view);
        int a = Integer.parseInt(score1edit.getText().toString());
        score1 = a;

        EditText score2edit = (EditText) findViewById(R.id.score2_edit_view);
        int b = Integer.parseInt(score2edit.getText().toString());
        score2 = b;

        EditText result1edit = (EditText) findViewById(R.id.result1_edit_view);
        int c = Integer.parseInt(result1edit.getText().toString());
        result1 = c;

        EditText result2edit = (EditText) findViewById(R.id.result2_edit_view);
        int d = Integer.parseInt(result2edit.getText().toString());
        result2 = d;

        double finalFlash = (score1 * (0.1+(((result1 - result2)/questionNumber)/10)))-(score2*(0.1+(((result2-result1)/questionNumber)/10)));

        return finalFlash;
    }
}
