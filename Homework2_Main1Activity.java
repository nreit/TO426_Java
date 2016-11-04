package com.example.nickreitnour.hw3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button buttonProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonProceed = (Button) findViewById(R.id.buttonProceed);

        buttonProceed.setOnClickListener(this);
        /*http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio*/
        /*buttonProceed.setOnClickListener(new View.OnClickListener() {*/
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
}