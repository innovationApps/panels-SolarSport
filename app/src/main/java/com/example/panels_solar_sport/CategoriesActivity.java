package com.example.panels_solar_sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    ImageButton btn_register;
    ImageButton imageButtonHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        btn_register = findViewById(R.id.btn_register);
        imageButtonHome = findViewById(R.id.imageButtonHome);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this,CreateCategoryActivity.class);
                startActivity(intent);

            }
        });

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this,PrincipalActivity2.class);
                startActivity(intent);

            }
        });




    }
}