package com.example.exercicio_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText valor1;
    EditText valor2;
    EditText resultado;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        valor1 = (EditText)findViewById(R.id.text_campvalor1);
        valor2 = (EditText)findViewById(R.id.text_segundoValor);
        resultado = (EditText)findViewById(R.id.text_resultado);
        btn1 = (Button)findViewById(R.id.somar);
        btn2 = (Button)findViewById(R.id.subt);
        btn3 = (Button)findViewById(R.id.multiplic);
        btn4 = (Button)findViewById(R.id.divisao);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value1;
                Double value2;
                Double result;

                value1 = Double.parseDouble(valor1.getText().toString());
                value2 = Double.parseDouble(valor2.getText().toString());
                result = value1 + value2;
                resultado.setText(result.toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value1;
                Double value2;
                Double result;

                value1 = Double.parseDouble(valor1.getText().toString());
                value2 = Double.parseDouble(valor2.getText().toString());
                result = value1 - value2;
                resultado.setText(result.toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value1;
                Double value2;
                Double result;

                value1 = Double.parseDouble(valor1.getText().toString());
                value2 = Double.parseDouble(valor2.getText().toString());
                result = value1 * value2;
                resultado.setText(result.toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value1;
                Double value2;
                Double result;

                value1 = Double.parseDouble(valor1.getText().toString());
                value2 = Double.parseDouble(valor2.getText().toString());
                result = value1 / value2;
                resultado.setText(result.toString());
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}