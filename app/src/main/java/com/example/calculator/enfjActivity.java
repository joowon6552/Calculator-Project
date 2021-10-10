package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enfjActivity extends AppCompatActivity {
    private Button btn_before_enfj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfj);
        btn_before_enfj = findViewById(R.id.btn_before_enfj);
        btn_before_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfjActivity.this, mbtiList.class);
                startActivity(intent);
            }
        });
    }
}