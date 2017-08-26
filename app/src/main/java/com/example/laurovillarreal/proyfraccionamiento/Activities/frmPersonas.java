package com.example.laurovillarreal.proyfraccionamiento.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.laurovillarreal.proyfraccionamiento.R;

public class frmPersonas extends AppCompatActivity {

    Button btGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_personas);

        btGuardar = (Button)findViewById(R.id.btGuardar);
        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(frmPersonas.this, "Información Guardada Correctamente...", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
