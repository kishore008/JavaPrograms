package com.kishore;

public class Main {

    public static void main(String[] args) {
//	    int value = 3;
//	    if(value == 1){
//            System.out.println("value was 1");
//        }else if(value == 2){
//            System.out.println("value was 2");
//        }else{
//            System.out.println("was not 1 or 2");
//        }

//        int switchValue = 6;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("was a 3 or a 4 or a 5");
//                break;
//
//            default:
//                System.out.println("was not 1, 2, 3, 4, 5");
//                break;
//        }

        char charValue = 'M';
        switch (charValue) {
            case 'K':
                System.out.println("Found K");
                break;
            case 'S':
                System.out.println("Found S");
                break;
            case 'M':
                System.out.println("Found M");
                break;
            default:
                System.out.println("didn't find " + charValue);
                break;
        }

        String month = "May";
        switch (month.toLowerCase()) {
            case "october":
                System.out.println("You found October");
                break;
            case "june":
                System.out.println("You found June");
                break;
            case "may":
                System.out.println("You found May");
                break;
            default:
                System.out.println("You didn't find " + month);
                break;
        }
    }
}
