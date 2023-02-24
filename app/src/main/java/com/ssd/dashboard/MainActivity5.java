package com.ssd.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{
    //Variables
    Button botonRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //Casting
        botonRegresar=(Button)findViewById(R.id.button2);
        botonRegresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intencion = new Intent(this, MainActivity.class);
        startActivity(intencion);

    }
}