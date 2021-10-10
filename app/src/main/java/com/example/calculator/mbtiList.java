package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mbtiList extends AppCompatActivity {

    private ImageButton imgbtn_enfj;
    private ImageButton imgbtn_enfp;
    private ImageButton imgbtn_entj;
    private ImageButton imgbtn_entp;

    private Button btn_gotocalculator1;
    private Button btn_next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_list);
        btn_gotocalculator1 = findViewById(R.id.btn_gotocalculator1);
        btn_next1 = findViewById(R.id.btn_next1);

        imgbtn_enfj = findViewById(R.id.imgbtn_enfj);
        imgbtn_enfp = findViewById(R.id.imgbtn_enfp);
        imgbtn_entj = findViewById(R.id.imgbtn_entj);
        imgbtn_entp = findViewById(R.id.imgbtn_entp);

        imgbtn_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, enfjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, enfpActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, entjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, entpActivity.class);
                startActivity(intent);
            }
        });


        btn_gotocalculator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList.this, mbtiList2.class);
                startActivity(intent);
            }
        });

    }
}