package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estpActivity extends AppCompatActivity {

    private Button btn_before_estp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estp);

        btn_before_estp = findViewById(R.id.btn_before_estp);
        btn_before_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estpActivity.this, mbtiList2.class);
                startActivity(intent);
            }
        });
    }
}