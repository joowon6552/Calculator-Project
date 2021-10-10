package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isfjActivity extends AppCompatActivity {

    private Button btn_before_isfj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isfj);

        btn_before_isfj = findViewById(R.id.btn_before_isfj);
        btn_before_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfjActivity.this, mbtiList4.class);
                startActivity(intent);
            }
        });
    }
}