package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class siguiente extends AppCompatActivity {

    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);
        tv1 = (TextView) findViewById(R.id.txt2);

        Bundle bundle = getIntent().getExtras();
        tv1.setText(bundle.getString("nombre"));
    }

    public void cerrar (View v){
        finish();
    }
}
