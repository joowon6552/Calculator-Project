package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mbtiList3 extends AppCompatActivity {

    private ImageButton imgbtn_infj;
    private ImageButton imgbtn_infp;
    private ImageButton imgbtn_intj;
    private ImageButton imgbtn_intp;

    private Button btn_gotocalculator3;
    private Button btn_next3;
    private Button btn_before3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_list3);

        btn_gotocalculator3 = findViewById(R.id.btn_gotocalculator3);
        btn_next3 = findViewById(R.id.btn_next3);
        btn_before3 = findViewById(R.id.btn_before3);

        imgbtn_infj = findViewById(R.id.imgbtn_infj);
        imgbtn_infp = findViewById(R.id.imgbtn_infp);
        imgbtn_intj = findViewById(R.id.imgbtn_intj);
        imgbtn_intp = findViewById(R.id.imgbtn_intp);

        imgbtn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, infjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, infpActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, intjActivity.class);
                startActivity(intent);
            }
        });

        imgbtn_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, intpActivity.class);
                startActivity(intent);
            }
        });




        btn_gotocalculator3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, mbtiList4.class);
                startActivity(intent);
            }
        });

        btn_before3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mbtiList3.this, mbtiList2.class);
                startActivity(intent);
            }
        });
    }
}