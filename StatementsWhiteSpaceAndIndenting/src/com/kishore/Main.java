package com.kishore;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("this is a test");

        System.out.println("This is " +
                "another " +
                "still more");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("this is another one");
    }
}
