package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        for(int i = 1; i<=inputNumber; i++){
            for(int j = inputNumber; j>=0; j--){
                int temp=inputNumber*2;
                System.out.println(j);
                while(inputNumber>temp){
                    System.out.println(" ");
                    temp--;
                }
                System.out.println(i);
            }
        }
    }
}
