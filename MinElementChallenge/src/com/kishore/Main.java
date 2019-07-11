package com.kishore;

import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array.");
        int count = scn.nextInt();
        int[] createdArray = readIntegers(count);
        System.out.println(findMin(createdArray));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " array values");
        int[] value = new int[count];
        for (int i = 0; i < value.length; i++) {
            int number = scn.nextInt();
            scn.nextLine();
            value[i] = number;
        }
        return value;
    }

    public static int findMin(int[] array) {
            int min = Integer.MAX_VALUE;

            for(int i = 0; i<array.length; i++){
                int value = array[i];
                if(value<min){
                    min=value;
                }
        }
        return min;
    }
}
