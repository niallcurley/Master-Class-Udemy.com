package com.company;

public class Main {



    public static void main(String[] args) {


        //vehicle1 instance of an object
        Vehicle vehicle1 = new Vehicle ("Skoda","Octavia",2017,"Black",1599,5,"Diesel");

        System.out.println("Type of Vehicle: "+ vehicle1.getName ());
        System.out.println("Name of Model: "+ vehicle1.getModel ());
        System.out.println("Year Of Registration: "+ vehicle1.getYearOfRegistration ());
        System.out.println("Colour Of Vehicle: "+ vehicle1.getColour ());
        System.out.println("Size Of Engine: "+ vehicle1.getEngineSize ());
        System.out.println("Number Of Doors: "+ vehicle1.getNoOfDoors ());
        System.out.println("Fuel Type: "+ vehicle1.getFuelType ());
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("**************************************");

        //instance of object Car1
        Car car = new Car ("Ford","Feista",2015,"White", 1195,5,
                "Petrol","10 Gig","All Devices","Full", "Side Only",
                "Front");

        System.out.println("Type Of Vehicle " + car.getName());
        System.out.println("Model Type " + car.getModel());
        System.out.println("Year Of Registration " + car.getYearOfRegistration());
        System.out.println("Colour Of Vehicle " + car.getColour());
        System.out.println("Size Of Engine " + car.getEngineSize());
        System.out.println("Number Of Doors " + car.getNoOfDoors());
        System.out.println("Fuel Type " + car.getFuelType());
        System.out.println("Mp3 Capacity " + car.getMp3Player());
        System.out.println("Range of Blue Tooth " + car.getBlueTooth());
        System.out.println("Range of Power Steering " + car.getPowerSteering());
        System.out.println("Type of Electric Mirror " + car.getElectricMirrors());
        System.out.println("Electric mirrors in " + car.getElectricWindow());
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");


        SportsCar sportsCar = new SportsCar("Audi", "A8",2016,"Silver",
                2498, 2,"Petrol", "30 GB","Full Range","Full Range",
                "In Front", "Front & Back", "Sports", "Racing Driver", "Brown Leather");

        System.out.println("Type Of Vehicle " + sportsCar.getName());
        System.out.println("Model Type " + sportsCar.getModel());
        System.out.println("Year Of Registration " + sportsCar.getYearOfRegistration());
        System.out.println("Colour Of Vehicle " + sportsCar.getColour());
        System.out.println("Size Of Engine " + sportsCar.getEngineSize());
        System.out.println("Number Of Doors " + sportsCar.getNoOfDoors());
        System.out.println("Fuel Type " + sportsCar.getFuelType());
        System.out.println("Mp3 Capacity " + sportsCar.getMp3Player());
        System.out.println("Range of Blue Tooth " + sportsCar.getBlueTooth());
        System.out.println("Range of Power Steering " + sportsCar.getPowerSteering());
        System.out.println("Type of Electric Mirror " + sportsCar.getElectricMirrors());
        System.out.println("Electric Windows in " + sportsCar.getElectricWindow());
        System.out.println("Type Of Tyres " + sportsCar.getLowProfileTyres());
        System.out.println("Type Of Mirrors " + sportsCar.getSportsMirrors());
        System.out.println("Colour Of Leather Interior  " + sportsCar.getLeatherInterior());

        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");



    }
}
