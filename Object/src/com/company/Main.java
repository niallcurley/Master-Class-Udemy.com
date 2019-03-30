package com.company;



public class Main {

    public static void main(String[] args) {

        Frog frog = new Frog(7, "Paul");
        Frog frog1 = new Frog(122, "Henry");
        Frog frog2 = new Frog(566, "John");
        //frog.toString();


        System.out.println(frog);
        System.out.println(frog1);
        System.out.println(frog2);


        //if you run your program with system.out.println(frog), and have no methods in your object then,
        // you just get the hash code which is just the unique identifier for the class object that you created.

    }
}
