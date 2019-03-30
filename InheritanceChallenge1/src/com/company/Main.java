package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle ("escort", "giant");
        //vehicle.getName();

        System.out.println("Vehicle name " + vehicle.getName());
        System.out.println("Vehicle size " + vehicle.getSize());





   Outlander outlander = new Outlander(36);
   outlander.steer(45);
   outlander.steer(15);
        outlander.steer(15);

        outlander.accelerate(30);
   outlander.accelerate(20);

//outlander.changeGear(2);
        System.out.println("Name of Vehicle " + outlander.getName());
        System.out.println("Size of Vehicle " + outlander.getSize());
        System.out.println("Number of Months "+ outlander.getRoadServiceMonths());
        System.out.println("Number Of Wheels " + outlander.getWheels());
        outlander.move(35, 10);
        //System.out.println("Name of Vehicle " + outlander.getName());

//outlander.getName();
//        outlander.setName("escort");
//        outlander.getName();


   //Car car = new Car ();


       // final String name = outlander.getName();
        //outlander.getSize();

   //vehicle.getName();


    }
}
