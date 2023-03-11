package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText W,H,inch;
        TextView T;
        Button bt;
        RelativeLayout relat;

        inch = findViewById(R.id.inch);
        W = findViewById(R.id.wtext1);
        H = findViewById(R.id.htext2);
        T = findViewById(R.id.Rtext3);
        bt = findViewById(R.id.btn1);
        relat= findViewById(R.id.relat);

       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int w = Integer.parseInt(W.getText().toString());
               int h = Integer.parseInt(H.getText().toString());
               int in= Integer.parseInt(inch.getText().toString());


               int totalin = h*12+in;

               double totacn = totalin*2.53;
               double totalh = totacn/100;
               double bmi = w/(totalh*totalh);

               if(bmi>25){
                   T.setText("you are overweight");
                   relat.setBackgroundColor(getResources().getColor(R.color.under));

               }else if (bmi<10){
                   T.setText("you are underweight");
                   relat.setBackgroundColor(getResources().getColor(R.color.healthy));

               }else{
                   T.setText("you are healthy");
                   relat.setBackgroundColor(getResources().getColor(R.color.over));
               }

           }
       });
    }
}