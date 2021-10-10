package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class esfjActivity extends AppCompatActivity {

    private Button btn_before_esfj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfj);

        btn_before_esfj = findViewById(R.id.btn_before_esfj);
        btn_before_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfjActivity.this, mbtiList2.class);
                startActivity(intent);
            }
        });
    }
}