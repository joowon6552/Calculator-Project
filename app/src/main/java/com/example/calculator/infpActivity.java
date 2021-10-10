package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infpActivity extends AppCompatActivity {

    private Button btn_before_infp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infp);

        btn_before_infp = findViewById(R.id.btn_before_infp);
        btn_before_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infpActivity.this, mbtiList3.class);
                startActivity(intent);
            }
        });
    }
}