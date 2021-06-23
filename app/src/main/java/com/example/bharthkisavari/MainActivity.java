package com.example.bharthkisavari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtFadeIn;
    Animation animFadeIn;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFadeIn=(TextView)findViewById(R.id.txt_fade_in);
        b1=(Button) findViewById(R.id.butn);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_in);
        txtFadeIn.startAnimation(animFadeIn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,homepage.class);
                startActivity(intent);
            }
        });

    }


}