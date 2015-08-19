package com.abdulazeez.skillup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_spotify, btn_scores, btn_library, btn_build, btn_reader, btn_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_spotify = (Button) findViewById(R.id.btn_spotify);
        btn_scores = (Button) findViewById(R.id.btn_scores);
        btn_library = (Button) findViewById(R.id.btn_library);
        btn_build = (Button) findViewById(R.id.btn_build);
        btn_reader = (Button) findViewById(R.id.btn_reader);
        btn_capstone= (Button) findViewById(R.id.btn_capstone);

        btn_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Spotify App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        btn_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Scores App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Library App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        btn_build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Build It Bigger App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        btn_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my XYZ Reader App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });


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
