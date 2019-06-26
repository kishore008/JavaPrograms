package com.kishore;

public class Main {

    public static void main(String[] args) {
//	    int newScore = calculateScore("Kishore", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(200);
//        calculateScore();

        calcFeetAndInchesToCentimeters(157);
    }

//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " Points");
//        return score*1000;
//    }
//
//    public static int calculateScore(int score){
//        System.out.println("Unnamed Player " + " scored " + score + " Points");
//        return score*1000;
//    }
//
//    public static int calculateScore(){
//        System.out.println("No Player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0) || ((inches<0) || (inches>12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return  centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches<0){
            return -1;
        }
        double feetInInches = (int) inches/12;
        double remaingInches = (int) inches % 12;
        System.out.println(inches  + " inches is eqaul to " + feetInInches + " feet and " + remaingInches + " inches");
        return calcFeetAndInchesToCentimeters(feetInInches, remaingInches);
    }
}
