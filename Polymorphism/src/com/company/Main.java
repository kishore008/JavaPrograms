package com.company;


class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eats all humans";
    }
}

class IndependanceDay extends Movie{

    public IndependanceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens try to take over earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Mazerunner");
    }

    public String plot(){
        return "kids try to escape a maze";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over universe";
    }
}


class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
}


public class Main {

    public static void main(String[] args) {
	    for(int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumeber = (int) (Math.random() * 5) + 1;
        System.out.println("Random numebr generated was: " + randomNumeber);

        switch (randomNumeber){
            case 1: return new Jaws();
            case 2: return new IndependanceDay();
            case 3: return new MazeRunner();
            case 4: return new StarWars();
            case 5: return new Forgetable();
        }

        return null;
    }
}
