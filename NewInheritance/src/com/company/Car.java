package com.company;

public class Car extends Machine{//all the properties and methods of machine belong to car now

//    public void start () {
//        System.out.println("Car Starting up");
//    }


    @Override
    public void start() {
        System.out.println("Car starting up");
    }

    public void wipeWindShield (){
        System.out.println("Water Squirting");
    }

    public void showInfo (){
        System.out.println("Car name " + name);
    }

}
