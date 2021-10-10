package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mbtiList2 extends AppCompatActivity {

    private ImageButton imgbtn_esfj;
    private ImageButton imgbtn_esfp;
    private ImageButton imgbtn_estj;
    private ImageButton imgbtn_estp;

    private Button btn_gotocalculator2;
    private Button btn_next2;
    private Button btn_before2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_list2);

        btn_gotocalculator2 = findViewById(R.id.btn_gotocalculator2);
        btn_next2 = findViewById(R.id.btn_next2);
        btn_before2 = findViewById(R.id.btn_before2);

        imgbtn_esfj = findViewById(R.id.imgbtn_esfj);
        imgbtn_esfp = findViewById(R.id.imgbtn_esfp);
        imgbtn_estj = findViewById(R.id.imgbtn_estj);
        imgbtn_estp = findViewById(R.id.imgbtn_estp);

        imgbtn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, esfjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, esfpActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, estjActiviy.class);
                startActivity(intent);
            }
        });

        imgbtn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, estpActivity.class);
                startActivity(intent);
            }
        });


        btn_gotocalculator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, mbtiList3.class);
                startActivity(intent);
            }
        });

        btn_before2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList2.this, mbtiList.class);
                startActivity(intent);
            }
        });
    }
}