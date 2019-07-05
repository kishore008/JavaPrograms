package com.company;

public class Vehicle {

    private String color;
    private int engine;

    public Vehicle(String color, int engine){
        this.color = color;
        this.engine = engine;
    }

    public void move(){
        System.out.println("Vehilce.move() called");
    }
    public void start(){
        System.out.println("com.company.Vehicle.start() called");
    }
    public void stop(){
        System.out.println("com.company.Vehicle.stop() called");
    }
}
