package com.example.laurovillarreal.proyfraccionamiento.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.laurovillarreal.proyfraccionamiento.R;

public class MainActivity extends AppCompatActivity {

    Button btHola;
    Button btLauro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btHola = (Button) findViewById(R.id.btHola);
        btLauro = (Button) findViewById(R.id.btLauro);

        btHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(this.getBaseContext(), "Hola mundo desde toas.", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Hola mundo", Toast.LENGTH_LONG).show();
            }
        });

        btLauro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,frmPersonas.class);
                startActivity(intent);
            }
        });

    }
}
