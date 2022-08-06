package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

    private int rightScreenID = R.id.right_screen;


    @SuppressLint({"ResourceAsColor", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tGiamSat = findViewById(R.id.tvGiamSat);
        tGiamSat.setBackgroundColor(R.color.onclick);
        tKhopLop = findViewById(R.id.tvKhopLop);
        tDaoLop = findViewById(R.id.tbDaoLop);
        tCaiDat = findViewById(R.id.tbCaiDat);
        tAmThanh = findViewById(R.id.tbAmThanh);

        setActionButtonLeftBar();

        setRightSreen(TireMonitorFragment.getMonitor());

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

    public void setActionButtonLeftBar() {
        tGiamSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked1");
                resetColor();
                tGiamSat.setBackgroundResource(R.color.onclick);
                setRightSreen(TireMonitorFragment.getMonitor());
            }
        });


        tKhopLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked2");
                tKhopLop.setBackgroundResource(R.color.onclick);
                setRightSreen(TireJointFragment.getJointFragment());
            }
        });
        tDaoLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked3");
                tDaoLop.setBackgroundResource(R.color.onclick);
                setRightSreen(TireRotationFragment.getRotationFragment());
            }
        });
        tCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked4");
                tCaiDat.setBackgroundResource(R.color.onclick);
                setRightSreen(TireSettingFragment.getSettingFragment());
            }
        });
        tAmThanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColor();
                System.out.println("clicked5");
                tAmThanh.setBackgroundResource(R.color.onclick);
            }
        });
    }

    public void setRightSreen(Fragment fragment) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(rightScreenID, fragment);
        transaction.commit();
    }

}