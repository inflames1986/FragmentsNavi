package com.inflames1986.fragmentsnavi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.container, new FirstFragment(), "FirstFragment")
                        .add(R.id.container, new FirstFragment(), "FirstFragment")
//                        .addToBackStack(null)
                        .commit();
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.container, new SecondFragment(), "SecondFragment")
                        .add(R.id.container, new SecondFragment(), "SecondFragment")
//                        .addToBackStack(null)
                        .commit();
            }
        });

        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.container, new ThirdFragment(), "ThirdFragment")
                        .add(R.id.container, new ThirdFragment(), "ThirdFragment")
//                        .addToBackStack(null)
                        .commit();
            }
        });

        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.container, new FourthFragment(), "FourthFragment")
                        .add(R.id.container, new FourthFragment(), "FourthFragment")
                        .commit();
            }
        });
    }
}