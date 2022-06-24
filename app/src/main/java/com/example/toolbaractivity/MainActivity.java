package com.example.toolbaractivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_200)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.share) {

            Toast.makeText(getApplicationContext(), "You click share", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.about) {

            Toast.makeText(getApplicationContext(), "You click about", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.exit) {

            Toast.makeText(getApplicationContext(), "You click exit", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.search) {

            Toast.makeText(getApplicationContext(), "You click search", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.setting) {

            Toast.makeText(getApplicationContext(), "You click setting", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

}