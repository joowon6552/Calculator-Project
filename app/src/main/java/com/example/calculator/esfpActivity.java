package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class esfpActivity extends AppCompatActivity {

    private Button btn_before_esfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfp);

        btn_before_esfp = findViewById(R.id.btn_before_esfp);
        btn_before_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esfpActivity.this, mbtiList2.class);
                startActivity(intent);
            }
        });
    }
}