package com.company;

public class Car extends Vehicle {

    private int door;
    private int wheels;

    public Car(String color, int engine, int door, int wheels){
        super(color, engine);
        this.door = door;
        this.wheels = wheels;
    }

    @Override
    public void move(){
        System.out.println("Car.move() is called");
    }

    @Override
    public void start(){
        System.out.println("car.start() called");
    }

    @Override
    public void stop(){
        System.out.println("Car.stop() called");
        super.stop();
    }
}
