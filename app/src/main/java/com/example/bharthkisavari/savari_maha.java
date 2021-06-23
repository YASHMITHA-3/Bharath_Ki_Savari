package com.example.bharthkisavari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class savari_maha extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savari_maha);
        b1=(Button) findViewById(R.id.video);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(savari_maha.this,Savari.class);
                startActivity(intent);
            }
        });
        b2=(Button) findViewById(R.id.map);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(savari_maha.this,maha_map.class);
                startActivity(intent);
            }
        });
        b3=(Button) findViewById(R.id.gallery);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(savari_maha.this,maha_gallery.class);
                startActivity(intent);
            }
        });
    }
}