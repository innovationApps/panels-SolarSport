package com.example.panels_solar_sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.checkerframework.common.subtyping.qual.Bottom;

public class Dasboard extends AppCompatActivity {

    ImageButton imageHome1;
    Button button_management;
    Button button_production;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);

        imageHome1 = findViewById(R.id.imageHome1);
        button_management = findViewById(R.id.button_management);
        button_production = findViewById(R.id.button_production);

        imageHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dasboard.this, PrincipalActivity2.class);
                startActivity(intent);

            }
        });

        button_management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Dasboard.this, TableBoard.class);
                startActivity(intent);

            }
        });

        button_production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Dasboard.this, Graph.class);
                startActivity(intent);

            }
        });

    }
}