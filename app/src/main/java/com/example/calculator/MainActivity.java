package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;


    private Button bAdd;
    private Button bSub;
    private Button bMult;
    private Button bDivide;

    private Button bEquals;
    private Button bDelete;

    private TextView results;

    int firstValue = 0, secondValue = 0;

    boolean add, multiply, divide, subtract;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        {
            b1 = findViewById(R.id.button_1);
            b2 = findViewById(R.id.button_2);
            b3 = findViewById(R.id.button_3);
            b4 = findViewById(R.id.button_4);
            b5 = findViewById(R.id.button_5);
            b6 = findViewById(R.id.button_6);
            b7 = findViewById(R.id.button_7);
            b8 = findViewById(R.id.button_8);
            b9 = findViewById(R.id.button_9);
            b0 = findViewById(R.id.button_0);
        }

        results = findViewById(R.id.text_results);

        bAdd = findViewById(R.id.button_add);
        bSub = findViewById(R.id.button_subtract);
        bMult = findViewById(R.id.button_multiply);
        bDivide = findViewById(R.id.button_divide);

        bEquals = findViewById(R.id.button_equals);
        bDelete = findViewById(R.id.button_delete);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "1");
                System.out.println(secondValue);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "0");
            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                add = true;
            }
        });


        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                subtract = true;
            }
        });

        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                multiply = true;
            }
        });


        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                divide = true;
            }
        });


        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondValue = Integer.parseInt(results.getText() + "");


                if (add == true) {
                    results.setText(firstValue + secondValue + "    ");
                    add = false;
                }

                if (subtract == true) {
                    results.setText(firstValue - secondValue + "    ");
                    subtract = false;
                }


                if (multiply == true) {
                    results.setText(firstValue * secondValue + "    ");
                    multiply = false;
                }

                if (divide == true) {
                    results.setText(firstValue / secondValue + "    ");
                    divide = false;
                }

            }
        });


        bDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results.setText("");
                results.setHint("Enter text here.");
                firstValue = 0;
                secondValue = 0;
            }
        });


    }

}