package com.example.a30dayenglish;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String eng = getIntent().getStringExtra("english");
        TextView textView= findViewById(R.id.textView);
        textView.setText(eng);



}}

//sjfnifieorfe