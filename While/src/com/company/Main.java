package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 6;
//	    while(count!= 6){
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//
//	    for(int i = 6; i!=6; i++){
//            System.out.println("Count value is " + count);
//        }
//
//	    count = 6;
//	    do{
//            System.out.println("count value is " + count);
//            count++;
//
//            if(count >100){
//                break;
//           }
//        }while(count !=6);
//    }

        int number = 1;
        int finishNumber = 20;
        int evenCount = 0;

        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenCount++;
            System.out.println("Even number " + number);
            if(evenCount==5){
                break;
            }
        }
        System.out.println("Number of even numbers found " + evenCount);

    }

    public static boolean isEvenNumber(int number) {
        if
        (number % 2 == 0) {
            return true;
        }
        return false;
    }

}