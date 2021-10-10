package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isfpActivity extends AppCompatActivity {

    private Button btn_before_isfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isfp);

        btn_before_isfp = findViewById(R.id.btn_before_isfp);
        btn_before_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(isfpActivity.this, mbtiList4.class);
                startActivity(intent);
            }
        });
    }
}