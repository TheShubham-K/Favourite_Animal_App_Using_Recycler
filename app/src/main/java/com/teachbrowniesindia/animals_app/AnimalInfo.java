package com.teachbrowniesindia.animals_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class AnimalInfo extends AppCompatActivity {

    ImageView img;
    TextView txt;
    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);
        
        img = findViewById(R.id.imgCircled);
        txt = findViewById(R.id.animal_name);

        Intent intent = getIntent();
        
        img.setImageResource(intent.getIntExtra("image",R.drawable.ic_launcher_foreground));
        txt.setText(intent.getStringExtra("name"));

        mIntent = getIntent();
        if (mIntent != null) {
            setupActionBar();
        }
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }

}