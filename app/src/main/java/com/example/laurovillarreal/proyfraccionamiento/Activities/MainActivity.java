package com.example.laurovillarreal.proyfraccionamiento.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.laurovillarreal.proyfraccionamiento.R;

public class MainActivity extends AppCompatActivity {

    Button btHola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btHola = (Button) findViewById(R.id.btHola);

        btHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(this.getBaseContext(), "Hola mundo desde toas.", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Hola mundo", Toast.LENGTH_LONG).show();
            }
        });
    }
}
