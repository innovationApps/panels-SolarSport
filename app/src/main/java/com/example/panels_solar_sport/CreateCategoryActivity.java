 package com.example.panels_solar_sport;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

 import androidx.appcompat.app.AppCompatActivity;



 public class CreateCategoryActivity extends AppCompatActivity {

     Button button_add;
     EditText name, location, panels, power, energy, co2, life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_category);

        name = findViewById(R.id.name);
        location= findViewById(R.id.location);
        panels= findViewById(R.id.panels);
        power = findViewById(R.id.power);
        energy = findViewById(R.id.energy);
        co2 = findViewById(R.id.co2);
        life = findViewById(R.id.life);
        button_add = findViewById(R.id.button_add);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namecategory = name.getText().toString().trim();
                String locationcategory = location.getText().toString().trim();
                Integer panelscategory = Integer.parseInt(panels.getText().toString().trim());
                Double powercategory = Double.parseDouble(power.getText().toString().trim());
                Double energycategory = Double.parseDouble(energy.getText().toString().trim());
                Double co2category = Double.parseDouble(co2.getText().toString().trim());
                Integer lifecategory = Integer.parseInt(life.getText().toString().trim());
            }
        });


    }



 }

