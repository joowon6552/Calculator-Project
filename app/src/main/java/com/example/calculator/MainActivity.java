package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true;
    private Button btn_mbtinext;

    ScrollView scrollView;
    TextView resultTextView;

    ImageButton allClearButton;
    ImageButton clearEntryButton;
    ImageButton backSpaceButton;
    ImageButton decimalButton;

    Button[] numberButton = new Button[10];
    ImageButton[] operatorButton = new ImageButton[5];

    Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mbtinext = findViewById(R.id.btn_mbtinext);
        scrollView = findViewById(R.id.scroll_view);
        resultTextView = findViewById(R.id.result_text_view);

         allClearButton = findViewById(R.id.all_clear_button);
         clearEntryButton = findViewById(R.id.clear_entry_button);
         backSpaceButton = findViewById(R.id.back_space_button);
         decimalButton = findViewById(R.id.decimal_button);

        for (int i = 0; i < numberButton.length; i++) {
            numberButton[i] = findViewById(R.id.number_button_0 + i);
        }

        for (int i = 0; i < operatorButton.length; i++) {
            operatorButton[i] = findViewById(R.id.operator_button_0 + i);
        }



        for(Button button : numberButton) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    numberButtonClick(view);

                }
            });
        }

        for(ImageButton imageButton : operatorButton) {
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operatorButtonClick(view);

                }
            });
        }

        btn_mbtinext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mbtiList.class);
                startActivity(intent);
            }
        });

        allClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allClearButtonClick(view);

            }
        });

        clearEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearEntryButtonClick(view);

            }
        });

        backSpaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backSpaceButtonClick(view);

            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalButtonClick(view);

            }
        });
    }

    private void decimalButtonClick(View view) {
        if(isFirstInput) {
            resultTextView.setTextColor(0xFF000000);
            resultTextView.setText("0.");
            isFirstInput = false;

        }else {
            if(resultTextView.getText().toString().contains(".")) {
                Toast.makeText(getApplicationContext(), "이미 소수점이 존재합니다.", Toast.LENGTH_SHORT).show();
            }
            resultTextView.append(".");

        }
    }

    private void backSpaceButtonClick(View view) {
        if(resultTextView.getText().toString().length() > 1) {
            String getResultString = resultTextView.getText().toString().replace(",", "");
            String subString = getResultString.substring(0, getResultString.length() - 1);
            String decimalString = calculator.getDecimalString(subString);
            resultTextView.setText(decimalString);

        } else {
            clearText();
        }
    }

    private void clearEntryButtonClick(View view) {
        clearText();
    }

    private void allClearButtonClick(View view) {
        calculator.setAllClear();
        clearText();
    }

    private void clearText() {
        isFirstInput = true;
        resultTextView.setTextColor(0xFF666666);
        resultTextView.setText(calculator.getclearInputText());
    }

    private void operatorButtonClick(View view) {
        String getResultString = resultTextView.getText().toString();
        String operator = view.getTag().toString();
        String getResult = calculator.getResult(isFirstInput, getResultString, operator);
        resultTextView.setText(getResult);
        isFirstInput = true;
    }

    private void numberButtonClick(View view) {
        if(isFirstInput){
            resultTextView.setText(view.getTag().toString());
            isFirstInput = false;
        }else {
            String getResultText = resultTextView.getText().toString().replace(",", "");
            getResultText = getResultText + view.getTag().toString();
            String getDecimalString = calculator.getDecimalString(getResultText);
            resultTextView.setText(getDecimalString);
        }


    }
}