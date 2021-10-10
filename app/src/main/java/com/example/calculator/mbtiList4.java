package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mbtiList4 extends AppCompatActivity {

    private ImageButton imgbtn_isfj;
    private ImageButton imgbtn_isfp;
    private ImageButton imgbtn_istj;
    private ImageButton imgbtn_istp;

    private Button btn_gotocalculator4;
    private Button btn_before4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_list4);

        btn_gotocalculator4 = findViewById(R.id.btn_gotocalculator4);
        btn_before4 = findViewById(R.id.btn_before4);

        imgbtn_isfj = findViewById(R.id.imgbtn_isfj);
        imgbtn_isfp = findViewById(R.id.imgbtn_isfp);
        imgbtn_istj = findViewById(R.id.imgbtn_istj);
        imgbtn_istp = findViewById(R.id.imgbtn_istp);

        imgbtn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, isfjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, isfpActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, istjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, istpActivity.class);
                startActivity(intent);
            }
        });


        btn_gotocalculator4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, MainActivity.class);
                startActivity(intent);
            }
        });


        btn_before4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList4.this, mbtiList3.class);
                startActivity(intent);
            }
        });
    }
}