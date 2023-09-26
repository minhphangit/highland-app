package com.example.highlandsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_Register1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        TextView textView1 =(TextView) findViewById(R.id.link_police1);
        textView1.setPaintFlags(textView1.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        TextView textView2 =(TextView) findViewById(R.id.link_police2);
        textView2.setPaintFlags(textView2.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        final ImageView imgView = findViewById(R.id.back_arrow);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Register1.this,MainActivity_Register.class);
                startActivity(intent);
            }
        });

        final AppCompatButton btn = findViewById(R.id.btn_continue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Register1.this,MainActivity_Register2.class);
                startActivity(intent);
            }
        });
    }
}