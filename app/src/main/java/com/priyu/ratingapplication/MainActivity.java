package com.priyu.ratingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.text);

    }


    public void submit(View view) {
        float ratingvalue = ratingBar.getRating();

        if (ratingvalue < 2) {
            textView.setText("rating " + ratingvalue + "\nwe will try better next time");
        }
        else if (ratingvalue <3  && ratingvalue >=2) {
            textView.setText("rating " + ratingvalue + "\nwe will are constantly improving");
        }
        else if (ratingvalue <=4 && ratingvalue >=3) {
            textView.setText("rating " + ratingvalue + "\nhope you like it");
        }
        else if(ratingvalue <=5 && ratingvalue>4) {
            textView.setText("rating " + ratingvalue + "\nlove it");
        }

    }
}