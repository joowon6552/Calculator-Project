package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entjActivity extends AppCompatActivity {
    private Button btn_before_entj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entj);

        setContentView(R.layout.activity_entj);
        btn_before_entj = findViewById(R.id.btn_before_entj);
        btn_before_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(entjActivity.this, mbtiList.class);
                startActivity(intent);
            }
        });
    }
}