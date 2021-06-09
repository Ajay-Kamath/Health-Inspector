package com.example.healthinspector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class CategoriesActivity extends AppCompatActivity {

    Button nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        nextpage = (Button) findViewById(R.id.nextpage);

        nextpage.setOnClickListener(view -> {
            Intent intent = new Intent(CategoriesActivity.this, ClickpictureActivity.class);
            startActivity(intent);
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        finish();
    }
}