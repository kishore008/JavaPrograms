package com.kishore;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(-1);
	    printDayOfTheWeek(0);
	    printDayOfTheWeek(1);
	    printDayOfTheWeek(2);
	    printDayOfTheWeek(3);
	    printDayOfTheWeek(4);
	    printDayOfTheWeek(5);
	    printDayOfTheWeek(6);
	    printDayOfTheWeek(7);

        printDayOfTheWeekIfElse(-1);
        printDayOfTheWeekIfElse(0);
        printDayOfTheWeekIfElse(1);
        printDayOfTheWeekIfElse(2);
        printDayOfTheWeekIfElse(3);
        printDayOfTheWeekIfElse(4);
        printDayOfTheWeekIfElse(5);
        printDayOfTheWeekIfElse(6);
        printDayOfTheWeekIfElse(7);
    }
    public static void printDayOfTheWeek(int dayNumber){
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
    public static void printDayOfTheWeekIfElse(int dayNumber){
        if(dayNumber == 1){
            System.out.println("Sunday");
        }else if(dayNumber == 2){
            System.out.println("Monday");
        }else if(dayNumber == 3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        }else if(dayNumber == 5){
            System.out.println("Thursday");
        }else if(dayNumber == 6){
            System.out.println("Friday");
        }else if(dayNumber == 7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Day");
        }
    }

}
