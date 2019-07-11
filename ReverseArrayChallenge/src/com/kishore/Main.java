package com.kishore;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
	    reverse(array);
    }

    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        System.out.println(Arrays.toString(array));

        for(int i = 0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
