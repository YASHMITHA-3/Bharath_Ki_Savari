package com.example.bharthkisavari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class maha_gallery extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maha_gallery);
        b1=(Button) findViewById(R.id.vr_video);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.360cities.net/image/gateway-of-india-mumbai/vr ";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);

            }
        });
        b2=(Button) findViewById(R.id.images);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maha_gallery.this,images_maha.class);
                startActivity(intent);
            }
        });
        b3=(Button) findViewById(R.id.upload);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maha_gallery.this,maha_upload.class);
                startActivity(intent);
            }
        });
    }}