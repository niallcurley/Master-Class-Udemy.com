package com.company;

class Movie {

    //base class or superclass
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot () {
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");// all initialized using constructor
    }


    public String plot() {
        return "A shark eats lots of people";
    }
}

class independenceDay extends Movie {
    public independenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids run in race for life";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "A science fiction film for kids";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgetable");
    }

    //no plot
}
public class Main {

    public static void main(String[] args) {
     //for loop created to determine extent of random number
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();    //creating a variable called 'movie'.
            System.out.println("Movie # " + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");

        }
    }

    public static Movie randomMovie (){
        int randomNumber = (int) (Math.random() * 5) *1;// code for creating a random number
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws ();

            case 2:
                return new independenceDay();

            case 3:
            return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

//default;
            //return null;
        }
        return null;
    }
}
