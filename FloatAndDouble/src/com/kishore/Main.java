package com.kishore;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5/2;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double poundValue = 50d;
        double onePoundInKg = 0.453_592_37d;

        double convertedKg = poundValue * onePoundInKg;
        System.out.println("The number of Kilograms equivalent to " + poundValue +" when converted is " + convertedKg);
    }
}
