package com.example.chinmay.androidtestingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSimple;
    Button btnSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSimple = findViewById(R.id.text_simple);
        btnSimple =findViewById(R.id.button_simple);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtSimple.setText(R.string.espressoText);
               btnSimple.setText("clicked");
               btnSimple.setClickable(false);
            }
        });
    }
}
