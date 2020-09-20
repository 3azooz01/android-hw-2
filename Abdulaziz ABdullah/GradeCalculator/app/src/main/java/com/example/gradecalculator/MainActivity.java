package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText q = findViewById(R.id.quizEt);
        final EditText h = findViewById(R.id.hwEt);
        final EditText m = findViewById(R.id.midTermEt);
        final EditText f = findViewById(R.id.finalEt)  ;
        final Button cal = findViewById(R.id.calBtn);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int qz = Integer.parseInt(q.getText().toString());
                int hw = Integer.parseInt(h.getText().toString());
                int mt = Integer.parseInt(m.getText().toString());
                int fin = Integer.parseInt(f.getText().toString());
                int res = qz + hw + mt + fin;

                Toast.makeText(MainActivity.this, res + "%", Toast.LENGTH_SHORT).show();


            }
        });

    }
}