package com.company;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player kishore = new Player("Kishore", 10, 15);
        System.out.println(kishore.toString());
        saveObject(kishore);

        kishore.setHitpoints(8);
        System.out.println(kishore);
        kishore.setWeapon("Stormbreaker");
        saveObject(kishore);
      //  loadObject(kishore);
        System.out.println(kishore);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a String\n" +
                "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to Storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
