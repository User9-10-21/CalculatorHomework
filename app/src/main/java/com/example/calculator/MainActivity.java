package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button digitOneButton;
    private Button digitTwoButton;
    private Button digitThreeButton;
    private Button digitFourButton;
    private Button digitFiveButton;
    private Button digitSixButton;
    private Button digitSevenButton;
    private Button digitEightButton;
    private Button digitNineButton;
    private Button digitZeroButton ;


    private Button addOperationButton ;
    private Button subtractOperationButton ;
    private Button multiplyOperationButton ;
    private Button divideOperationButton ;

    private Button calcResultTextView;
    private Button deleteOperationButton;

    private TextView results;

    int firstValue = 0, secondValue = 0;

    boolean add, multiply, divide, subtract;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        {
            digitOneButton = findViewById(R.id.digit_one_button);
            digitTwoButton = findViewById(R.id.digit_two_button);
            digitThreeButton = findViewById(R.id.digit_three_button);
            digitFourButton = findViewById(R.id.digit_four_button);
            digitFiveButton = findViewById(R.id.digit_five_button);
            digitSixButton = findViewById(R.id.digit_six_button);
            digitSevenButton = findViewById(R.id.digit_seven_button);
            digitEightButton = findViewById(R.id.digit_eight_button);
            digitNineButton = findViewById(R.id.digit_nine_button);
            digitZeroButton = findViewById(R.id.digit_zero_button);
        }

        results = findViewById(R.id.text_results);

        addOperationButton = findViewById(R.id.add_operation_button);
        subtractOperationButton = findViewById(R.id.subtract_operation_button);
        multiplyOperationButton = findViewById(R.id.multiply_operation_button);
        divideOperationButton = findViewById(R.id.divide_operation_button);

        calcResultTextView = findViewById(R.id.calc_result_textview);
        deleteOperationButton = findViewById(R.id.delete_operation_button);


        digitOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "1");
                System.out.println(secondValue);
            }
        });

        digitTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "2");
            }
        });

        digitThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "3");
            }
        });

        digitFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "4");
            }
        });

        digitFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "5");
            }
        });

        digitSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "6");
            }
        });

        digitSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "7");
            }
        });

        digitEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "8");
            }
        });

        digitNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "9");
            }
        });

        digitZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                results.setText(results.getText() + "0");
            }
        });


        addOperationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                add = true;
            }
        });


        subtractOperationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                subtract = true;
            }
        });

        multiplyOperationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                multiply = true;
            }
        });


        divideOperationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Integer.parseInt(results.getText() + "");
                results.setText(null);
                divide = true;
            }
        });


        calcResultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondValue = Integer.parseInt(results.getText() + "");


                if (add == true) {
                    results.setText(firstValue + secondValue + "");
                    add = false;
                }

                if (subtract == true) {
                    results.setText(firstValue - secondValue + "");
                    subtract = false;
                }


                if (multiply == true) {
                    results.setText(firstValue * secondValue + "");
                    multiply = false;
                }

                if (divide == true) {
                    results.setText(firstValue / secondValue + "");
                    divide = false;
                }


            }
        });


        deleteOperationButton.setOnClickListener(new View.OnClickListener() {
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