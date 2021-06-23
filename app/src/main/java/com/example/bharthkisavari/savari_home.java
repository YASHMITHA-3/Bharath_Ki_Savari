package com.example.bharthkisavari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class savari_home extends AppCompatActivity {

        Button b01;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_savari_home);
            b01 = (Button) findViewById(R.id.b1);


            b01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(savari_home.this, savari_maha.class);
                    startActivity(intent);

                }
            });
        }}