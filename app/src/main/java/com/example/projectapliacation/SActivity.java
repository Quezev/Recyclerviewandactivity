package com.example.projectapliacation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SActivity extends AppCompatActivity {
    TextView txt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sactivity);

        txt = findViewById(R.id.tvsa);
        img = findViewById(R.id.imgsa);

        String nama = getIntent().getStringExtra("nama");
        int gambar = getIntent().getIntExtra("gam",R.drawable.ic_launcher_background);

        txt.setText(nama);
        img.setImageResource(gambar);
    }
}