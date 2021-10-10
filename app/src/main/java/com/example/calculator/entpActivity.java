package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entpActivity extends AppCompatActivity {
    private Button btn_before_entp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entp);

        btn_before_entp = findViewById(R.id.btn_before_entp);
        btn_before_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entpActivity.this, mbtiList.class);
                startActivity(intent);
            }
        });
    }
}