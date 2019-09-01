package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etnum1);
        num2 = (EditText) findViewById(R.id.etnum2);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        ans = (TextView) findViewById(R.id.tvans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 + n2;
                ans.setText(String.valueOf(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int diff = n1 - n2;
                ans.setText(String.valueOf(diff));
            }
        });


    }
}
