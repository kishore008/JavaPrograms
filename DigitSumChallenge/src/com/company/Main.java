package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
        System.out.println("The sum of the digits in number 9999 is " + sumDigits(9999));
    }

    public static int sumDigits(int number){
        if(number<=9){
            return -1;
        }

        int lastNumber=0;
        int extractedNumber = 0;

        while(number!=0){
            lastNumber = number % 10;
            extractedNumber += lastNumber;
            number = number/10;

            if(extractedNumber>9){
                extractedNumber %= 9;
            }
        }
        return extractedNumber;
    }
}
