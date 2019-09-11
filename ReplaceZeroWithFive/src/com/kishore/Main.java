package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int givenNumber = input.nextInt();
        int temp = givenNumber;
        String stringVar = "";

        while(temp!=0){
            int temp1 = temp%10;
            temp/=10;

            if(temp1 == 0){
                temp1 = 5;
                stringVar+=temp1;
            }
            else{
                stringVar+=temp1;
            }

        }
//        System.out.println(stringVar);
        System.out.println(reverseString(stringVar));
    }

    public static String reverseString(String stringVar){
        char[] charArray = stringVar.toCharArray();
//        for(char x : charArray){
//            System.out.println(x);
//        }

//        char temp;
//        for(int i=0; i<=stringVar.length()-1; i++){
//            temp = charArray[i];
//            charArray[i] = charArray[stringVar.length()-1];
//            charArray[stringVar.length()-1] = temp;
//            stringVar.length();
//        }

        int begin = 0;
        int end = charArray.length-1;
        char temp;

        while(end>begin){
            temp=charArray[begin];
            charArray[begin] = charArray[end];
            charArray[end] = temp;
            end--;
            begin++;
        }
        return new String(charArray);
    }
}
