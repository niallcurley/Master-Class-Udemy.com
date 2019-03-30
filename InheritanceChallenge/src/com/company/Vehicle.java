package com.company;

public class Vehicle {
    private String name;
    private String model;
    private int yearOfRegistration;
    private String colour;
    private int engineSize;
    private int noOfDoors;
    private String fuelType;

    public Vehicle(String name, String model, int yearOfRegistration, String colour, int engineSize, int noOfDoors, String fuelType) {
        this.name = name;
        this.model = model;
        this.yearOfRegistration = yearOfRegistration;
        this.colour = colour;
        this.engineSize = engineSize;
        this.noOfDoors = noOfDoors;
        this.fuelType = fuelType;
    }


//    public void stop(){
//        System.out.println("Acceleration is stopped");
//    }
//
//    public void steering (){
//        System.out.println("Steering is on left hand side");
//    }
//
//    public void speed (int speed) {
//        if (speed <=0){
//          stop();
//
//        }else if((speed >=0 && <=10)){
//
//        }
//            System.out.println("Stop engine");
//        System.out.println("Changing Gears");
//    }
//
//    public void changeGear (int gears) {
//        if(gears <= ;
//
//        System.out.println("The car moves at speed " );
//    }

    //getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public String getColour() {
        return colour;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
