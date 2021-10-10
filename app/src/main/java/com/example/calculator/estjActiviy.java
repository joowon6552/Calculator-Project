package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estjActiviy extends AppCompatActivity {

    private Button btn_before_estj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estj_activiy);

        setContentView(R.layout.activity_estj_activiy);
        btn_before_estj = findViewById(R.id.btn_before_estj);
        btn_before_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estjActiviy.this, mbtiList2.class);
                startActivity(intent);
            }
        });
    }
}