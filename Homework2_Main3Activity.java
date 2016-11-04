package com.example.nickreitnour.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private Button trueButton2;
    private Button falseButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        trueButton2 = (Button) findViewById(R.id.trueButton);
        falseButton2 = (Button) findViewById(R.id.falseButton);

        trueButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        falseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}