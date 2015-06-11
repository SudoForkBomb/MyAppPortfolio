package com.example.crtaylor123.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Layout initializations

        Button spotifyButton = (Button) findViewById(R.id.spotifyStreamerButton);
        Button scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        Button libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        Button readerAppButton = (Button) findViewById(R.id.readerAppButton);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);


        //Toast instructions.

        final Context context = getApplicationContext();
        final CharSequence[] text = new CharSequence[6];
        final int duration = Toast.LENGTH_SHORT;
        text[0] = "This button will launch my Spotify App.";
        text[1] = "This button will launch my Scores App.";
        text[2] = "This button will launch my Library App.";
        text[3] = "This button will launch my Build It Bigger App.";
        text[4] = "This button will launch my XYZ Reader App.";
        text[5] = "This button will launch my Capstone App.";


        //Button onClickListeners

        View.OnClickListener spotifyListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[0], duration);
                toast.show();
            }
        };

        View.OnClickListener scoresAppListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[1], duration);
                toast.show();
            }
        };

        View.OnClickListener libraryAppListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[2], duration);
                toast.show();
            }
        };

        View.OnClickListener buildItBiggerListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[3], duration);
                toast.show();
            }
        };

        View.OnClickListener readerAppListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[4], duration);
                toast.show();
            }
        };

        View.OnClickListener capstoneListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text[5], duration);
                toast.show();
            }
        };

        //Setting each Button with its Listener.
         spotifyButton.setOnClickListener(spotifyListener);
         scoresAppButton.setOnClickListener(scoresAppListener);
         libraryAppButton.setOnClickListener(libraryAppListener);
         buildItBiggerButton.setOnClickListener(buildItBiggerListener);
         readerAppButton.setOnClickListener(readerAppListener);
         capstoneButton.setOnClickListener(capstoneListener);


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
