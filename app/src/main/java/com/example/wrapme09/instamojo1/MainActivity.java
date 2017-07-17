package com.example.wrapme09.instamojo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.instamojo.android.Instamojo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Instamojo.initialize(this);
    }
}
