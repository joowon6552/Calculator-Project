package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intpActivity extends AppCompatActivity {

    private Button btn_before_intp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intp);

        btn_before_intp = findViewById(R.id.btn_before_intp);
        btn_before_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intpActivity.this, mbtiList3.class);
                startActivity(intent);
            }
        });
    }
}