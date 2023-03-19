package com.example.drumpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    MediaPlayer n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5 = findViewById(R.id.imageButton5);
        b6 = findViewById(R.id.imageButton6);
        b7 = findViewById(R.id.imageButton7);
        b8 = findViewById(R.id.imageButton8);
        b9 = findViewById(R.id.imageButton9);
        b10 = findViewById(R.id.imageButton10);
        b11 = findViewById(R.id.imageButton11);
        b12 = findViewById(R.id.imageButton12);

        n1 = MediaPlayer.create(this,R.raw.one);
        n2 = MediaPlayer.create(this,R.raw.two);
        n3 = MediaPlayer.create(this,R.raw.three);
        n4 = MediaPlayer.create(this,R.raw.four);
        n5 = MediaPlayer.create(this,R.raw.fv);
        n6 = MediaPlayer.create(this,R.raw.sixth);
        n7 = MediaPlayer.create(this,R.raw.seventh);
        n8 = MediaPlayer.create(this,R.raw.eighth);
        n9 = MediaPlayer.create(this,R.raw.nine);
        n10 = MediaPlayer.create(this,R.raw.ten);
        n11 = MediaPlayer.create(this,R.raw.ele);
        n12 = MediaPlayer.create(this,R.raw.three);



        b1.setOnClickListener(v -> n1.start());

        b2.setOnClickListener(v -> n2.start());

        b3.setOnClickListener(v -> n3.start());

        b4.setOnClickListener(v -> n4.start());

        b5.setOnClickListener(v -> n5.start());

        b6.setOnClickListener(v -> n6.start());

        b7.setOnClickListener(v -> n7.start());

        b8.setOnClickListener(v -> n8.start());

        b9.setOnClickListener(v -> n9.start());

        b10.setOnClickListener(v -> n10.start());

        b11.setOnClickListener(v -> n11.start());

        b12.setOnClickListener(v -> n12.start());
    }
}