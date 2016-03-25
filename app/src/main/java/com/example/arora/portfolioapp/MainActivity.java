package com.example.arora.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void sendMessage1(View view) {
          Context context = getApplicationContext();
          CharSequence text = "This button will launch Spotify Streamer!";
          int duration = Toast.LENGTH_SHORT;

          Toast toast = Toast.makeText(context, text, duration);
          toast.show();

    }
    public void sendMessage2(View view) {
          Context context = getApplicationContext();
          CharSequence text = "This button will launch Scores App!";
          int duration = Toast.LENGTH_SHORT;

          Toast toast = Toast.makeText(context, text, duration);
          toast.show();

    }
    public void sendMessage3(View view) {
          Context context = getApplicationContext();
          CharSequence text = "This button will launch Library App!";
          int duration = Toast.LENGTH_SHORT;

          Toast toast = Toast.makeText(context, text, duration);
          toast.show();

    }
    public void sendMessage4(View view) {
          Context context = getApplicationContext();
          CharSequence text = "Build it Bigger!";
          int duration = Toast.LENGTH_SHORT;

          Toast toast = Toast.makeText(context, text, duration);
          toast.show();

    }
    public void sendMessage5(View view) {
          Context context = getApplicationContext();
          CharSequence text = "This button will launch XYZ Reader!";
          int duration = Toast.LENGTH_SHORT;

          Toast toast = Toast.makeText(context, text, duration);
          toast.show();
    }
    public void sendMessage6(View view) {
           Context context = getApplicationContext();
           CharSequence text = "This button will launch my Capstone Project!";
           int duration = Toast.LENGTH_SHORT;

           Toast toast = Toast.makeText(context, text, duration);
           toast.show();

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
}
