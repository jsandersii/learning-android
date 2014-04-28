package com.example.testapp.testapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;


public class prob2activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob2activity);
    }

    // Create RadioButton Click Event Listener
    public void radioclick(View view){
       boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId())
        {
            case R.id.redRadioButton:
                if (checked)
                (findViewById(R.id.radioTextColor)).setBackgroundColor(Color.RED);
                break;
            case R.id.yellowRadioButton:
                if (checked)
                (findViewById(R.id.radioTextColor)).setBackgroundColor(Color.YELLOW);
                break;
            case R.id.blueRadioButton:
                if (checked)
                (findViewById(R.id.radioTextColor)).setBackgroundColor(Color.BLUE);
                break;
        }
    }

    // Create Next Problem click event listener
    public void nextprob2(View view) {
        Intent intent = new Intent(this, prob3activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prob2activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
