package com.example.customswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import com.ebanx.swipebtn.OnStateChangeListener;

import com.ebanx.swipebtn.SwipeButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SwipeButton swipeButton = findViewById(R.id.swipebt);

        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {

            @Override

            public void onStateChange(boolean active) {

                Intent intent = new Intent(MainActivity.this,SuccessActivity.class);

                startActivity(intent);

            }

        });
    }
}