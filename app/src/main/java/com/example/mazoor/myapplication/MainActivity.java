package com.example.mazoor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button a, b, c, d, e;
    String n1, n2;
    TextView num3;

    int a1,b1,c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.n1);
        num2 = (EditText) findViewById(R.id.n2);
        num3 = (TextView) findViewById(R.id.res);

        a = (Button) findViewById(R.id.b1);
        b = (Button) findViewById(R.id.b2);
        c = (Button) findViewById(R.id.b3);
        d = (Button) findViewById(R.id.b4);

       // n1 = num1.getText().toString();
      //  n2 = num2.getText().toString();



        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1 = Integer.parseInt(num1.getText().toString());
                b1 = Integer.parseInt(num2.getText().toString());
                c1=a1+b1;
                num3.setText(String.valueOf(c1));

            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1 = Integer.parseInt(num1.getText().toString());
                b1 = Integer.parseInt(num2.getText().toString());
                c1=a1-b1;
                num3.setText(String.valueOf(c1));

            }
        });



        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1 = Integer.parseInt(num1.getText().toString());
                b1 = Integer.parseInt(num2.getText().toString());
                c1=a1*b1;
                num3.setText(String.valueOf(c1));

            }
        });


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1 = Integer.parseInt(num1.getText().toString());
                b1 = Integer.parseInt(num2.getText().toString());
                 c1=a1/b1;
                num3.setText(String.valueOf(c1));

            }
        });


    }


}