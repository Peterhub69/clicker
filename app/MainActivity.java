package com.example.clickerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private boolean increment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counterTextView = findViewById(R.id.counter);
        Button incrementButton = findViewById(R.id.increment_button);
        Button resetButton = findViewById(R.id.reset_button);
        Button toggleButton = findViewById(R.id.toggle_button);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = increment ? counter + 1 : counter - 1;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment = !increment;
                toggleButton.setText(increment ? "Zmień na dekrementację" : "Zmień na inkrementację");
            }
        });
    }
}
