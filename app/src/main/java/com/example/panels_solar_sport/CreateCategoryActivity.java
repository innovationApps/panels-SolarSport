 package com.example.panels_solar_sport;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Toast;

 import androidx.annotation.NonNull;
 import androidx.appcompat.app.AppCompatActivity;

 import com.google.android.gms.tasks.OnFailureListener;
 import com.google.android.gms.tasks.OnSuccessListener;
 import com.google.firebase.firestore.DocumentReference;
 import com.google.firebase.firestore.FirebaseFirestore;

 import java.util.HashMap;
 import java.util.Map;


 public class CreateCategoryActivity extends AppCompatActivity {

     private FirebaseFirestore mfirestore;

     Button button_add;
     EditText name, location, panels, power, energy, co2, life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_category);

        mfirestore = FirebaseFirestore.getInstance();

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
                Float powercategory = Float.parseFloat(power.getText().toString().trim());
                Float energycategory = Float.parseFloat(energy.getText().toString().trim());
                Float co2category = Float.parseFloat(co2.getText().toString().trim());
                Integer lifecategory = Integer.parseInt(life.getText().toString().trim());

                if (namecategory.isEmpty() && locationcategory.isEmpty() ){
                    Toast.makeText(getApplicationContext(),"Ingresa los datos",Toast.LENGTH_SHORT).show();
                }else {
                    postCategory(namecategory,locationcategory, panelscategory, powercategory, energycategory, co2category, lifecategory);
                }
            }
        });

        


    }

     private void postCategory(String namecategory, String locationcategory, Integer panelscategory, Float powercategory, Float energycategory, Float co2category, Integer lifecategory) {

         Map<String, Object> map = new HashMap<>();
         map.put("name", namecategory);
         map.put("location",locationcategory);
         map.put("panels", panelscategory);
         map.put("power", powercategory);
         map.put("energy", energycategory);
         map.put("co2", co2category);
         map.put("life", lifecategory);

        mfirestore.collection("category").add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getApplicationContext(), "Creado exitosamente",Toast.LENGTH_SHORT).show();
                finish();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Error al ingresar datos",Toast.LENGTH_SHORT).show();
            }
        });
     }


 }

