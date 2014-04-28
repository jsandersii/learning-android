package com.example.testapp.testapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ToggleButton;


public class prob3activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob3activity);
    }

    // Create Toggle Event Listener
    public void togglebtns (View view){
        boolean on = ((ToggleButton)view).isChecked();

        switch (view.getId())
        {
            case R.id.toggle_red:
                if (on)
                    (findViewById(R.id.toggle_text)).setBackgroundColor(Color.RED);

                else{
                    findViewById(R.id.toggle_text).setBackgroundColor(Color.BLACK);
                }

                break;

            case R.id.toggle_yellow:
                if (on)
                    (findViewById(R.id.toggle_text)).setBackgroundColor(Color.YELLOW);

                else{
                    findViewById(R.id.toggle_text).setBackgroundColor(Color.BLACK);
                }

                break;

            case R.id.toggle_blue:
                if (on)
                    (findViewById(R.id.toggle_text)).setBackgroundColor(Color.BLUE);

                else{
                    findViewById(R.id.toggle_text).setBackgroundColor(Color.BLACK);
                }

                break;

        }

        }

    // Create Next Button Listener
    public void nextprob3(View view) {
        Intent intent = new Intent(this,prob4activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prob3activity, menu);
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
