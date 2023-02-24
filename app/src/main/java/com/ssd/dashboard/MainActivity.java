package com.ssd.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables
        ImageButton boton1;
        ImageButton boton2;
        ImageButton boton3;
        ImageButton boton4;
        ImageButton boton5;
        ImageButton boton6;

        //Casting
        boton1 = (ImageButton) findViewById(R.id.imageButton1);
        boton1.setOnClickListener(this);
        boton2 = (ImageButton) findViewById(R.id.imageButton2);
        boton2.setOnClickListener(this::onClick2);
        boton3 = (ImageButton) findViewById(R.id.imageButton3);
        boton3.setOnClickListener(this::onClick3);
        boton4 = (ImageButton) findViewById(R.id.imageButton4);
        boton4.setOnClickListener(this::onClick4);
        boton5 = (ImageButton)findViewById(R.id.imageButton5);
        boton5.setOnClickListener(this::onClick5);
        boton6 = (ImageButton) findViewById(R.id.imageButton6);
        boton6.setOnClickListener(this::onClick6);


    }

    //Metodos
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Albert Einstein", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity2.class);
        startActivity(intencion);
    }

    public void onClick2(View view) {
        Toast.makeText(MainActivity.this, "Nicola Tesla", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity3.class);
        startActivity(intencion);
    }

    public void onClick3(View view) {
        Toast.makeText(MainActivity.this, "Isaac Newton", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity5.class);
        startActivity(intencion);

    }

    public void onClick4(View view) {
        Toast.makeText(MainActivity.this, "Galileo Galilei", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity4.class);
        startActivity(intencion);
    }

    public void onClick5(View view) {
        Toast.makeText(MainActivity.this, "Sigmund Freud", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity6.class);
        startActivity(intencion);
    }

    public void onClick6(View view) {
        Toast.makeText(MainActivity.this, "Charles Darwin", Toast.LENGTH_SHORT).show();
        Intent intencion = new Intent(this, MainActivity7.class);
        startActivity(intencion);
    }
}