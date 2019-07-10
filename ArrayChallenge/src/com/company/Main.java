package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] toBeSorted = getIntegers(5);
        //printArray(toBeSorted);

        printArray(sortIntegers(toBeSorted));

    }

    public static int[] getIntegers(int arraySize) {
        System.out.println("Enter the integers\r");
        int[] value = new int[arraySize];
        for (int i = 0; i < value.length; i++) {
            value[i] = scn.nextInt();
        }
        return value;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value of array at position " + i + " is : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i<array.length;i++){
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            // element 0    50
            // element 1    160
            // element 2    40
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
