package com.example.imagerecognition77229152;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.imagerecognition77229152.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

public class  MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());



}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.logout:
                Toast.makeText(this, "Signing off", Toast.LENGTH_SHORT).show();
                auth.signOut();
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);

                break;
            case R.id.profile:
                Toast.makeText(this, "Under construction", Toast.LENGTH_SHORT).show();




                break;
        }
        return super.onOptionsItemSelected(item);
    }
}