package com.gla.thread;

import java.time.LocalTime;

class SmartDevice implements Runnable {

    private String deviceName;
    private int interval;

    public SmartDevice(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    @Override
    public void run() {

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Device: " + deviceName +
                            " | Cycle: " + i +
                            " | Priority: " + t.getPriority() +
                            " | Time: " + LocalTime.now()
            );

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(deviceName + " has completed its work.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        SmartDevice temperature = new SmartDevice("Temperature Sensor", 5000);
        SmartDevice security = new SmartDevice("Security Camera", 3000);
        SmartDevice light = new SmartDevice("Light Controller", 4000);
        SmartDevice door = new SmartDevice("Door Lock Monitor", 6000);

        Thread t1 = new Thread(temperature);
        Thread t2 = new Thread(security);
        Thread t3 = new Thread(light);
        Thread t4 = new Thread(door);

        // Setting priorities
        t2.setPriority(10); // Security
        t1.setPriority(7);  // Temperature
        t3.setPriority(5);  // Light
        t4.setPriority(5);  // Door

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}