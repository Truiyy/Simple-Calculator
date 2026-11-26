package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText fNum, sNum;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button div = (Button) findViewById(R.id.div);
        Button mul = (Button) findViewById(R.id.mul);
        fNum = findViewById(R.id.fNum);
        sNum = findViewById(R.id.sNum);
        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fNumber = fNum.getText().toString();
                String sNumber = sNum.getText().toString();

                if(fNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter First Number", Toast.LENGTH_SHORT).show();
                } else if (sNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Second Number", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(fNum.getText().toString());
                    int num2 = Integer.parseInt(sNum.getText().toString());
                    int sum = Math.addExact(num1, num2);
                    result.setText(num1 + " + " + num2 + " = " + sum);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fNumber = fNum.getText().toString();
                String sNumber = sNum.getText().toString();

                if(fNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter First Number", Toast.LENGTH_SHORT).show();
                } else if (sNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Second Number", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(fNum.getText().toString());
                    int num2 = Integer.parseInt(sNum.getText().toString());
                    int sum = Math.subtractExact(num1, num2);
                    result.setText(num1 + " - " + num2 + " = " + sum);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fNumber = fNum.getText().toString();
                String sNumber = sNum.getText().toString();

                if(fNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter First Number", Toast.LENGTH_SHORT).show();
                } else if (sNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Second Number", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(fNum.getText().toString());
                    int num2 = Integer.parseInt(sNum.getText().toString());
                    int sum = Math.divideExact(num1, num2);
                    result.setText(num1 + " / " + num2 + " = " + sum);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fNumber = fNum.getText().toString();
                String sNumber = sNum.getText().toString();

                if(fNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter First Number", Toast.LENGTH_SHORT).show();
                } else if (sNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Second Number", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(fNum.getText().toString());
                    int num2 = Integer.parseInt(sNum.getText().toString());
                    int sum = Math.multiplyExact(num1, num2);
                    result.setText(num1 + " * " + num2 + " = " + sum);
                }
            }
        });
    }
}