package com.example.testapp.testapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioGroup;


public class prob4activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob4activity);
    }
    // Create Radio Group listener method
    public void radiogroupchk (View v){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup2);

        int selectedbutton = radioGroup.getCheckedRadioButtonId();

        switch (selectedbutton)
        {
            case R.id.redRadioButton2:
                    (findViewById(R.id.radioTextColor2)).setBackgroundColor(Color.RED);
                break;
            case R.id.yellowRadioButton2:
                    (findViewById(R.id.radioTextColor2)).setBackgroundColor(Color.YELLOW);
                break;
            case R.id.blueRadioButton2:
                    (findViewById(R.id.radioTextColor2)).setBackgroundColor(Color.BLUE);
                break;
        }
    }

    // Create Project completion method

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prob4activity, menu);
        return true;
    }

   }
