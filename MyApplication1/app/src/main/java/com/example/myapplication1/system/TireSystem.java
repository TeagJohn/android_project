package com.example.myapplication1.system;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.example.myapplication1.MainActivity;

import java.util.List;

public class TireSystem {

    private static TireSystem instance = null;

    private SensorManager sensorManager;
    private Sensor sensor;

    public static TireSystem getInstance() {
        if (instance == null) {
            instance = new TireSystem();
        }
        return instance;
    }

    public static void show(List<Sensor> list) {
        for (Sensor sensor : list) {
            System.out.println("sensor 1: ");
            System.out.println(sensor.getPower());
        }
    }

    public SensorManager getSensorManager() {
        return sensorManager;
    }

    public void setSensorManager(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
