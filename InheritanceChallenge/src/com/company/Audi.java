package com.company;

public class Audi extends Car{
    private String gearType;
    private String handSteering;

    public Audi(String color, int engine, int door, int wheels, String gearType, String handSteering){
        super(color, engine, door, wheels);
        this.gearType = gearType;
        this.handSteering = handSteering;
    }

    public void changingGear(){
        System.out.println("Audi.changingGear() and Manual");
    }

}
