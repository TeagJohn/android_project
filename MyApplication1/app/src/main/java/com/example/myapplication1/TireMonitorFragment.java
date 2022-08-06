package com.example.myapplication1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class TireMonitorFragment extends Fragment {

    private static TireMonitorFragment monitor = null;

    private TextView apsuatlopsaubentrai;
    private TextView apsuatlopsaubenphai;
    private TextView apsuatloptruocbentrai;
    private TextView apsuatloptruocbenphai;

    private TextView nhietdolopsaubentrai;
    private TextView nhietdolopsaubenphai;
    private TextView nhietdoloptruocbentrai;
    private TextView nhietdoloptruocbenphai;

    private String presRuler = "Bar";
    private String tempatureRuler = "\u2109C";

    public static TireMonitorFragment getMonitor() {
        if (monitor == null) {
            monitor = new TireMonitorFragment();
//            monitor.reset();
        }
        System.out.println("---------------1");
        return monitor;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tire_monitor, container, false);
        apsuatloptruocbentrai = view.findViewById(R.id.apsuatlopsaubentrai);
        apsuatloptruocbenphai = view.findViewById(R.id.apsuatloptruocbenphai);
        apsuatlopsaubentrai = view.findViewById(R.id.apsuatlopsaubentrai);
        apsuatlopsaubenphai = view.findViewById(R.id.apsuatlopsaubenphai);

        nhietdoloptruocbentrai = view.findViewById(R.id.nhietdoloptruocbentrai);
        nhietdoloptruocbenphai = view.findViewById(R.id.nhietdoloptruocbenphai);
        nhietdolopsaubentrai = view.findViewById(R.id.nhietdolopsaubentrai);
        nhietdolopsaubenphai = view.findViewById(R.id.nhietdolopsaubenphai);
        System.out.println("-------------2");

        return view;
    }

    public void reset() {
        apsuatlopsaubentrai.setText("0.0 Bar");
        apsuatlopsaubenphai.setText("0.0 Bar");
        apsuatloptruocbenphai.setText("0.0 Bar");
        apsuatloptruocbentrai.setText("0.0 Bar");

        nhietdolopsaubenphai.setText("-49 \u2109C");
        nhietdolopsaubentrai.setText("-49 \u2109C");
        nhietdoloptruocbenphai.setText("-49 \u2109C");
        nhietdoloptruocbentrai.setText("-49 \u2109C");
    }
}
