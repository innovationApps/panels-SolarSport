package com.example.panels_solar_sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity2 extends AppCompatActivity {
    Button buttonStatic;
    Button buttonTip;
    TextView textlink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);
        buttonStatic = findViewById(R.id.buttonStatic);
        buttonTip = findViewById(R.id.buttonTip);
        textlink = findViewById(R.id.textlink);

        buttonStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity2.this,Dasboard.class);
                startActivity(intent);
            }
        });

        buttonTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        textlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity2.this, Login.class);
                startActivity(intent);
            }
        });
    }

    // Métodos botones
    public void categories (View view) {
        Intent categories =new Intent(this,CategoriesActivity.class);
        startActivity(categories);

    }


}