package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter < 11) {
            System.out.println("Enter the number " + counter + ":");
            boolean hasNextInt = scn.hasNextInt();
            if (hasNextInt) {
                int input = scn.nextInt();
                sum += input;
                counter++;
            }
            else{
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("The sum of All the 10 numbers entered is " + sum);
        scn.close();
    }
}
