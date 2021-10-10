package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intjActivity extends AppCompatActivity {

    private Button btn_before_intj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intj);

        btn_before_intj = findViewById(R.id.btn_before_intj);
        btn_before_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intjActivity.this, mbtiList3.class);
                startActivity(intent);
            }
        });
    }
}