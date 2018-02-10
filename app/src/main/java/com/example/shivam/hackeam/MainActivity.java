package com.example.shivam.hackeam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btnclass1,btnclass2,btnclass3,btnclass4,btnclass5,btnclass6,btnclass7,btnclass8,btnclass9,btnclass10,btnclass11,btnclass12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclass1=findViewById(R.id.btnclass1);
        btnclass2=findViewById(R.id.btnclass2);
        btnclass3=findViewById(R.id.btnclass3);
        btnclass4=findViewById(R.id.btnclass4);
        btnclass5=findViewById(R.id.btnclass5);
        btnclass6=findViewById(R.id.btnclass6);
        btnclass7=findViewById(R.id.btnclass7);
        btnclass8=findViewById(R.id.btnclass8);
        btnclass9=findViewById(R.id.btnclass9);
        btnclass10=findViewById(R.id.btnclass10);
        btnclass11=findViewById(R.id.btnclass11);
        btnclass12=findViewById(R.id.btnclass12);


        btnclass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectMain2Activity.class);
                startActivity(i);
            }
        });


        btnclass11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectsActivity.class);
                startActivity(i);

            }
        });


        btnclass12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,subjectsActivity.class);
                startActivity(i);
            }
        });







    }
}
