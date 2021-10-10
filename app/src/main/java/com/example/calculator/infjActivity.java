package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infjActivity extends AppCompatActivity {

    private Button btn_before_infj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infj);

        btn_before_infj = findViewById(R.id.btn_before_infj);
        btn_before_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(infjActivity.this, mbtiList3.class);
                startActivity(intent);
            }
        });
    }
}