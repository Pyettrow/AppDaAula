package com.view.appdaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityConversao extends AppCompatActivity {
    TextView tvTempFahreinheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_conversao);

        tvTempFahreinheit = (TextView) findViewById(R.id.tvTempFahreinheit);

        Log.d("Log2", "onCreate");

        Intent intent = getIntent();
        float valor = Float.parseFloat(intent.getStringExtra("Celsius"));

        valor = ((valor*9)/5)+32;

        String cosia = Float.toString(valor);
        tvTempFahreinheit.setText("Temperatura em Fahreinheit: "+cosia);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Log2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log2", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log2", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Log2", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log2", "onDestroy");
    }
}