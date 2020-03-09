package com.view.appdaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etTempCelsius;
    Button btConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTempCelsius = (EditText) findViewById(R.id.etTempCelsius);
        btConverter = (Button) findViewById(R.id.btConverter);
        btConverter.setOnClickListener(trataEvento);

        Log.d("Log1", "onCreate");

    }

    View.OnClickListener trataEvento = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(etTempCelsius.getText().length() != 0){
                Intent intent = new Intent(MainActivity.this, MainActivityConversao.class);
                intent.putExtra("Celsius", String.valueOf(etTempCelsius.getText()));
                etTempCelsius.setText("");
                startActivity(intent);
            }else{
                Toast.makeText(MainActivity.this, "Informe uma temperatura para converter!", Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Log1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log1", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log1", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Log1", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log1", "onDestroy");
    }
}
