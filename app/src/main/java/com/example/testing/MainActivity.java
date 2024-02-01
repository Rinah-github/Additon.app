package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText  num1, num2;
 TextView answer;
 Button add;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);
        num1= findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        add= findViewById(R.id.add);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              testing();
              Toast.makeText(MainActivity.this, "Answer", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void testing(){
        int num_1 = Integer.parseInt(num1.getText().toString());
        int num_2 = Integer.parseInt(num2.getText().toString());
        int sum = num_1 + num_2;
        String ans = String.valueOf(sum);
        answer.setText(ans);
    }

}