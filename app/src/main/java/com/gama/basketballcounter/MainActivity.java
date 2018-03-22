package com.gama.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnreset;
    private TextView txtPointsA, txtPointsB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pA = pB = 0;
        btnA1 = (Button) findViewById(R.id.btnA1);
        btnA2 = (Button) findViewById(R.id.btnA2);
        btnA3 = (Button) findViewById(R.id.btnA3);
        btnB1 = (Button) findViewById(R.id.btnB1);
        btnB2 = (Button) findViewById(R.id.btnB2);
        btnB3 = (Button) findViewById(R.id.btnB3);
        btnreset = (Button) findViewById(R.id.reset);
        txtPointsA = (TextView) findViewById(R.id.pointsA);
        txtPointsB = (TextView) findViewById(R.id.pointsB);

        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addA(1);
                txtPointsA.setText(String.valueOf(pA));
            }
        });
        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addA(2);
                txtPointsA.setText(String.valueOf(pA));
            }
        });

        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addA(3);
                txtPointsA.setText(String.valueOf(pA));
            }
        });

        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addB(1);
                txtPointsB.setText(String.valueOf(pB));
            }
        });

        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addB(2);
                txtPointsB.setText(String.valueOf(pB));
            }
        });

        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addB(3);
                txtPointsB.setText(String.valueOf(pB));
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                txtPointsA.setText("0");
                txtPointsB.setText("0");
            }
        });
    }

    int pA = 0, pB = 0;
    void addA(int p){
        pA += p;
    }
    void addB(int p){
        pB += p;
    }
    void reset(){
        pA = pB = 0;
    }
}
