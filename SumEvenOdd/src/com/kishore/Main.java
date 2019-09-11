package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to add its even and odd digits separately");
	    int number = input.nextInt();
	    int temp=number;
	    int evenSum = 0;
        int oddSum = 0;

	    while(number!=0){
	        int temp1 = number%10;
	        number/=10;
	        if(temp1%2==0){
	            evenSum+=temp1;
            }
	        else{
	            oddSum+=temp1;
            }
        }

        System.out.println("The sum of even digits in " + number + " is : " + evenSum + " and sum of odd digits in " + number + " is : " + oddSum);
    }
}
