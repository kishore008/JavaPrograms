package com.company;

public class Fan {
    private int speed;
    private String model;

    public Fan(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}
