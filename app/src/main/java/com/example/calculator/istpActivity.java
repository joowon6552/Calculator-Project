package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class istpActivity extends AppCompatActivity {

    private Button btn_before_istp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istp);

        btn_before_istp = findViewById(R.id.btn_before_istp);
        btn_before_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istpActivity.this, mbtiList4.class);
                startActivity(intent);
            }
        });


    }
}