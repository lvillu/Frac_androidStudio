package com.example.laurovillarreal.proyfraccionamiento.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.laurovillarreal.proyfraccionamiento.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this.getBaseContext(), "Hola mundo desde toas.", Toast.LENGTH_SHORT).show();
    }
}
