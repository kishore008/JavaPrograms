package com.kishore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        for(int i = 1; i<=inputNumber; i++){

            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }

            for(int j = i*2; j<inputNumber*2; j++){
                System.out.print(" ");
            }

            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}


//                //ends when i=j, that is, it doesnt run for 12,23,34,45
//               if(i>=j){
//                   System.out.print(j);
//               }
//
//               if((inputNumber*2-2*j)<=(2*inputNumber)){
//                   System.out.print(" ");
//               }
//
//                if(j>inputNumber){
//                    if(i+j>=(inputNumber*2+1)){
//                        System.out.print(tempI);
//                        tempI--;
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//
//                }