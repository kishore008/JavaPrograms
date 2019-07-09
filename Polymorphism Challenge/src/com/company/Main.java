package com.company;


class Car{
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String car;

    public Car(boolean engine, int cylinder, int wheels, String car){
        this.engine = engine;
        this.cylinder = cylinder;
        this.wheels = wheels;
        this.car = car;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public String getCar() {
        return car;
    }

    public void startEngine(){
        System.out.println("The engine is starting");
    }

    public void accelerate(){
        System.out.println("The engine is accelerating");
    }

    public void brake(){
        System.out.println("The driver has applied brakes");
    }
}

class Audi extends Car{

    public Audi(){
        super(true, 8, 4, "Audi-the best car");
    }

    @Override
    public void startEngine(){
        System.out.println("The audi car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("The audi car has accelerated");
    }

    @Override
    public void brake() {
        System.out.println("The audi car has stopped");
    }
}

class BMW extends Car{

    public BMW(){
        super(true, 4, 5, "BWM car");
    }

    @Override
    public void startEngine(){
        System.out.println("The BMW car has started");
    }

    @Override
    public void accelerate(){
        System.out.println("The BMW car has accelerated");
    }

    @Override
    public void brake(){
        System.out.println("The BMW car has stopped");
    }
}

class Benz extends Car{
    public Benz(){
        super(true, 1, 2, "Benz car");
    }

    @Override
    public void startEngine() {
        System.out.println("Benz has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Benz accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Benz stopped");
    }
}




public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            Car car = randomCar();
            System.out.println("Car number " + i + " : " + " " + car.getCar());
        }

    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random()*2) + 1;
        System.out.println("The random number generated is " + randomNumber);

        switch(randomNumber){
            case 1: return new Audi();
            case 2: return new BMW();
            case 3: return new Benz();
        }
        return null;
    }

}
