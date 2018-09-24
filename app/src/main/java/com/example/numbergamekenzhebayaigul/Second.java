package com.example.numbergamekenzhebayaigul;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Second extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView Score;
    Button lessButton;
    Button equalButton;
    Button biggerButton;
    int score = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initView();
        changeNumber();
        Score.setText("Result: " + Score);
        lessButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt((String) textView1.getText());
                int secondNumber = Integer.parseInt((String) textView2.getText());
                if(firstNumber < secondNumber){
                    score++;

                }else{
                    if(score != 0) score--; else score = 0;
                }
                Score.setText("Result: " + Score);
                changeNumber();
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt((String) textView1.getText());
                int secondNumber = Integer.parseInt((String) textView2.getText());
                if(firstNumber == secondNumber){
                    score++;
                }else{
                    if(score != 0) score--; else score = 0;
                }
                Score.setText("Result: " + score);
                changeNumber();
            }
        });
        biggerButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt((String) textView1.getText());
                int secondNumber = Integer.parseInt((String) textView2.getText());
                if(firstNumber > secondNumber){
                    score++;
                }else{
                    if(score != 0) score--; else score = 0;
                }
                Score.setText("Result: " + score);
                changeNumber();
            }
        });

    }
    public void initView(){
        this.textView1 = findViewById(R.id.firstnum);
        this.textView2 = findViewById(R.id.secondnum);
        this.lessButton = findViewById(R.id.less);
        this.equalButton = findViewById(R.id.equal);
        this.biggerButton = findViewById(R.id.bigger);
        this.Score = findViewById(R.id.Score);
    }
    @SuppressLint("SetTextI18n")
    public void changeNumber(){
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        System.out.println("Numbers are -> " + a + " " + b);
        textView1.setText(a + "");
        textView2.setText(b + "");
    }
}
