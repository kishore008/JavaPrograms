package com.kishore;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count == 5) {
                break;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The numbers that can be divided by both 3 and 5 are " + i);
                sum += i;
                count++;
            }
        }
        System.out.println("The sum of numbers which were both divided by 3 and 5 are " + sum);
    }
}
