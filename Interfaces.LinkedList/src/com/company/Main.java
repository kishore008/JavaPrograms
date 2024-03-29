package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("Hold on",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can't do it right",6.23);
        album.addSong("High ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock", "Ac/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I Put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil Walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new Vector<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed King", playList); //Does not exist, test case.
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); //THere is no track 24, test case.

        play(playList);
    }


    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " +listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("we have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - Delete current song from playlist");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }


}
