package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check if its trailing zeros in its factorial");
        int factorial = scn.nextInt();
        int counter = 0;
        int counter2=0;
        boolean quit = false;


        int factorialValue = factorialFunction(factorial);
        int temp=factorialValue;

        for(int i = 0; factorialValue>0;i++){
            factorialValue/=10;
            counter++;
        }

        System.out.println(counter);

        for(int j = 0; j<=counter; j++){
            if(temp/10==0){
                counter2++;
            }
        }
        System.out.println("The trailing zeros in " + factorial + " is " + counter2);



//        System.out.println(counter);

//        while(!quit){
//            if(factorialValue%10==0){
//                factorialValue %= 10;
//                counter++;
//            }
//            else{
//                quit=true;
//                System.out.println("The trailing zeros in " + factorial + " is " + counter);
//            }
//        }
//        System.out.println(counter);


    }



    public static int factorialFunction(int factorial){
        int sum = 1;
        while(factorial>=1){
            return factorial*factorialFunction(factorial-1);
        }
        return sum;
    }
}

//    public static int factorialFunction(int factorial) {
//        if (factorial == 1) {
//            return 1;
//        }
//        else{
//            return factorial * factorialFunction(factorial - 1);
//        }
//
//    }