package com.company;

public class Main {

    public static void main(String[] args) {
        Audi newAudi = new Audi("blue", 2, 4, 4, "Manual", "Hand Steering");
        newAudi.changingGear();
        newAudi.move();
        newAudi.start();
        newAudi.stop();
    }
}
