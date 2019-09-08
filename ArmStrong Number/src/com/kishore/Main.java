package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check if its Armstrong number");
        int input = scn.nextInt();

        //variables
        int numberOfDigits = 0;
        int temp = input;
        int remainder = 0;
        int sum = 0;
        int toCheck = input;

        //to get number of digits in the input
        while (temp != 0) {
            numberOfDigits++;
            temp = temp / 10;
        }

        //to get remainder and remove the last digit
        while (input != 0) {
            remainder = input % 10;
            sum = sum + powerCalculator(remainder, numberOfDigits);
            input = input / 10;
        }

        if (sum == toCheck) {
            System.out.println("The number " + toCheck + " is an Armstrong number");
        } else {
            System.out.println("The number " + toCheck + " isn't an Armstrong number");
        }

    }


    //function to compute the Armstrong Math
    public static int powerCalculator(int number, int toThePowerOf) {
        int temp1 = 1;
        int temp2 = 1;

        for (temp1 = 1; temp1 <= toThePowerOf; temp1++) {
            temp2 = temp2 * number;
        }
        return temp2;
    }
}
