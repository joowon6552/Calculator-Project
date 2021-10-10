package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enfpActivity extends AppCompatActivity {
    private Button btn_before_enfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfp);

        btn_before_enfp = findViewById(R.id.btn_before_enfp);
        btn_before_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enfpActivity.this, mbtiList.class);
                startActivity(intent);
            }
        });
    }
}