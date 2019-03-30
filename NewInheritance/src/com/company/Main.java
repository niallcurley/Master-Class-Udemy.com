package com.company;

public class Main {

    public static void main(String[] args) {

        //because i have created a class called machine i can then create objects from the class.
        // i can create a variable of the type machine
        //Machine machine; -- this is a variable of type 'machine'
        //new Machine();  -- this creates memory form my new machine object.
	// write your code here


        //or you can combine them together
        Machine machine = new Machine();
        machine.start();
        machine.stop();

        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.wipeWindShield();
        car1.showInfo();
    }
}
