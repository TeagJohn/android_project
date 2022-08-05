package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.net.PlatformVpnProfile;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tGiamSat;
    TextView tKhopLop;
    TextView tDaoLop;
    TextView tCaiDat;
    TextView tAmThanh;

    @SuppressLint({"ResourceAsColor", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tGiamSat = findViewById(R.id.tvGiamSat);
//        tGiamSat.setBackgroundColor(R.color.teal_200);
        tKhopLop = findViewById(R.id.tvKhopLop);
        tDaoLop = findViewById(R.id.tbDaoLop);
        tCaiDat = findViewById(R.id.tbCaiDat);
        tAmThanh = findViewById(R.id.tbAmThanh);

        tGiamSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked1");
                resetColor();
                tGiamSat.setBackgroundColor(R.color.onclick);
            }
        });


        tKhopLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked2");
                tKhopLop.setBackgroundColor(R.color.onclick);
            }
        });
        tDaoLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked3");
                tDaoLop.setBackgroundColor(R.color.teal_200);
            }
        });
        tCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked4");
                tCaiDat.setBackgroundColor(R.color.onclick);
            }
        });
        tAmThanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked5");
                tAmThanh.setBackgroundColor(R.color.onclick);
            }
        });

    }

    @SuppressLint("ResourceAsColor")
    public void resetColor() {
        tGiamSat.setBackgroundResource(R.color.defaultColor);
        tGiamSat.setBackgroundResource(R.color.defaultColor);
        tKhopLop.setBackgroundResource(R.color.defaultColor);
        tDaoLop.setBackgroundResource(R.color.defaultColor);
        tCaiDat.setBackgroundResource(R.color.defaultColor);
        tAmThanh.setBackgroundResource(R.color.defaultColor);
    }

}