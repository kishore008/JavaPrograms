package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min = 0;
        int max = 0;

        boolean first = true;

        while (true) {
            System.out.println("Enter Number");
            boolean hasNextInt = scn.hasNextInt();

            if (hasNextInt) {

                int number = scn.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("The entered minimum number is " + min + " and maximum number is " + max);
    }
}
