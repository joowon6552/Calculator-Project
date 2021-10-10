package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class istjActivity extends AppCompatActivity {

    private Button btn_before_istj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istj);

        btn_before_istj = findViewById(R.id.btn_before_istj);
        btn_before_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(istjActivity.this, mbtiList4.class);
                startActivity(intent);
            }
        });
    }
}