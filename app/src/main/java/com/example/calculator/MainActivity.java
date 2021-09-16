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

        results = findViewById(R.id.text_results);

        bAdd = findViewById(R.id.button_add);
        bSub = findViewById(R.id.button_subtract);
        bMult = findViewById(R.id.button_multiply);
        bDivide = findViewById(R.id.button_divide);

        bEquals = findViewById(R.id.button_equals);
        bDelete = findViewById(R.id.button_delete);


    }

}