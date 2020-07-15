package com.kim9212.kkakkaotalktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class locationsaved extends AppCompatActivity {

    TextView texttest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationsaved);

        texttest =findViewById(R.id.texttest);

        Intent intent=getIntent();

        texttest.setText(G.address);
    }
}