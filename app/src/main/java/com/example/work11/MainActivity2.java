package com.example.work11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void boris(View view) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
            finish();

    }

    public void moskov(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
        startActivity(intent);
        finish();

    }

    public void Voronez(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
        startActivity(intent);
        finish();
    }

    public void Bolgog(View view) {    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
        finish();
    }

    public void saratov(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
        startActivity(intent);
        finish();
    }

    public void tambov(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
        startActivity(intent);
        finish();
    }
}