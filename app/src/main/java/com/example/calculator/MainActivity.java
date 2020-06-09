package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView, answerView;
    private Button button0, button1, button2, button3,
            button4, button5, button6, button7, button8,
            button9, button00, buttonPlus, buttonMinus,
            buttonMultiply, buttonDivision, buttonPoint,
            buttonEqual, buttonC, buttonCE;
    private String input1 = "", input2 = "", operation = "";
    private Boolean isFirst = true;
    private double input1DoubleForm, input2DoubleForm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        answerView = findViewById(R.id.answerView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button00 = findViewById(R.id.button00);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiplication);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonC = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttonEqual = findViewById(R.id.buttonEqual);

        textView.setText("");
        answerView.setText("");


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                //restricting user to type unwanted zeros
                    if( !input1.equals("0") ) {
                        input1 += "0";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //restricting user to type unwanted zeros
                    if(!input2.equals("0")){
                        input2 += "0";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="1";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "1";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="1";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "1";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="2";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "2";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="2";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "2";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="3";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "3";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="3";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "3";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="4";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "4";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="4";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "4";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="5";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "5";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="5";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "5";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="6";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "6";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="6";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "6";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="7";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "7";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="7";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "7";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="8";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "8";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="8";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "8";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //removing unwanted zeros
                    if( input1.equals("0")) {
                        input1="9";
                        textView.setText(input1);
                    }
                    else {
                        input1 += "9";
                        //printing the given input
                        textView.setText(input1);
                    }
                } else {
                    //removing unwanted zeros
                    if( input2.equals("0")) {
                        input2="9";
                        textView.setText(input1 + operation + input2);
                    }
                    else {
                        input2 += "9";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //restricting user to type unwanted zeros
                    if (input1.length() > 0 && input1 != "0") {
                        input1 += "00";
                        //printing the given input
                        textView.setText(input1);
                    } else {
                        textView.setText("0");
                    }
                } else {
                    //restricting user to type unwanted zeros
                    if (input2.length() > 0 && input2 != "0") {
                        input2 += "00";
                        //printing the given inputs
                        textView.setText(input1 + operation + input2);
                    } else {
                        //making sure that user can't type unwanted zeros
                        input2="0";
                        textView.setText(input1 + operation + input2);
                    }
                }
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "+";
                textView.setText(input1 + operation);
                isFirst = false;
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "-";
                textView.setText(input1 + operation);
                isFirst = false;
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "x";
                textView.setText(input1 + operation);
                isFirst = false;
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "/";
                textView.setText(input1 + operation);
                isFirst = false;
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    input1 += ".";
                    //printing the given input
                    textView.setText(input1);
                } else {
                    input2 += ".";
                    //printing the given inputs
                    textView.setText(input1 + operation + input2);
                }
            }
        });


        buttonC.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = "";
                input2 = "";
                operation = "";
                isFirst = true;
                textView.setText("");
                answerView.setText("");
            }
        }));
        buttonCE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    //checking whether an input is there to erase
                    if (input1.length() > 0) {
                        //removing the last digit
                        input1 = input1.substring(0, input1.length() - 1);
                        textView.setText(input1);
                    }
                } else {
                    if (input2.length() > 0) {
                        input2 = input2.substring(0, input2.length() - 1);
                        textView.setText(input1 + operation + input2);
                    } else {
                        operation = "";
                        //removing the operator from the text view
                        textView.setText(input1);
                        //so user can change the input1
                        isFirst = true;
                    }
                }
            }
        }));

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // changing string inputs to double
                input1DoubleForm = Double.parseDouble(input1);
                input2DoubleForm = Double.parseDouble(input2);
                //performing operations
                switch (operation) {
                    case "+":
                        answerView.setText(input1DoubleForm + input2DoubleForm + "");
                        break;
                    case "-":
                        answerView.setText(input1DoubleForm - input2DoubleForm + "");
                        break;
                    case "x":
                        answerView.setText(input1DoubleForm * input2DoubleForm + "");
                        break;
                    case "/":
                        answerView.setText(input1DoubleForm / input2DoubleForm + "");
                        break;
                    // default:
                    //answerView.setText("");
                }
            }
        });
    }
}