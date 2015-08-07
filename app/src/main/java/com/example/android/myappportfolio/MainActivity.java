package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void spotifyStreamer(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my Spotify Streamer App";
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void scoresApp(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my Scores App";
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void libraryApp(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my Library App";
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void buildItBigger(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my Build It Bigger App";
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void xyzReader(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my XYZ Reader App";
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void myOwnApp(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        //String buttonText = (String) button.getText();
        String buttonText = "This button will launch my Capstone App";
        Context context = getApplicationContext();
        //test message for git commit
        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
