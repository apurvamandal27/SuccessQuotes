package com.example.apurva.successquotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static  int count;
    Intent intent;
    Button[] btn1=new Button[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1[0]=findViewById(R.id.btn_1);
        btn1[1]=findViewById(R.id.btn_2);
        btn1[2]=findViewById(R.id.btn_3);
        btn1[3]=findViewById(R.id.btn_4);
        btn1[4]=findViewById(R.id.btn_5);
        btn1[5]=findViewById(R.id.btn_6);
        btn1[6]=findViewById(R.id.btn_7);
        btn1[7]=findViewById(R.id.btn_8);
        btn1[8]=findViewById(R.id.btn_9);
        btn1[9]=findViewById(R.id.btn_10);

        btn1[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=0;
            }
        });
        btn1[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=1;
            }
        });
        btn1[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=2;
            }
        });
        btn1[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=3;
            }
        });
        btn1[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=4;
            }
        });
        btn1[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=5;
            }
        });
        btn1[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=6;
            }
        });
        btn1[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=7;
            }
        });
        btn1[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=8;
            }
        });
        btn1[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                count=9;
            }
        });
    }
}
