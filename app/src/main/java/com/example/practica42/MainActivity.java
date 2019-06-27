package com.example.practica42;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    EditText text3;
    Button compilar;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();

    }

    private void loadComponents() {
        text1=(EditText) findViewById(R.id.text1);
        text2=(EditText)findViewById(R.id.text2);
        text3=(EditText)findViewById(R.id.text3);
        resultado=(TextView)findViewById(R.id.resultado);

        compilar=(Button)findViewById(R.id.buttonenviado);

        compilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String num1 = text1.getText().toString();
              String num2 = text2.getText().toString();
              String num3 = text3.getText().toString();

              mayor(num1, num2, num3);
            }
        });
    }

    private void mayor(String num1, String num2, String num3) {

        int a= Integer.parseInt(num1);
        int b= Integer.parseInt(num2);
        int c= Integer.parseInt(num3);

        if (b > a && b > c) //resultado.setText(b);
            resultado.setText(String.valueOf(b));
        else if (a > b && a > c) //resultado.setText(a);
            resultado.setText(String.valueOf(a));
        else if (c > a && c > b) //resultado.setText(c);
            resultado.setText(String.valueOf(c));
    }
}
