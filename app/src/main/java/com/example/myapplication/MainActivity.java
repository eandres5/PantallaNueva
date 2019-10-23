package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.txt);
    }

    public void siguiente(View v){
        Intent sig = new Intent(this,siguiente.class);
        sig.putExtra("nombre",et1.getText().toString());
        startActivity(sig);
    }

    public void irUrl(View v){
        Intent sig = new Intent(this,navegador.class);
        sig.putExtra("url", et1.getText().toString());
        startActivity(sig);
    }


}
