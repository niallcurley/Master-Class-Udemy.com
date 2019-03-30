package com.company;

public class Car extends Vehicle {

    String mp3Player;
    String blueTooth;
    String powerSteering;
    String electricMirrors;
    String electricWindow;

    public Car(String name, String model, int yearOfRegistration, String colour, int engineSize, int noOfDoors,
               String fuelType, String mp3Player, String blueTooth, String powerSteering, String electricMirrors,
               String electricWindow) {
        super(name, model, yearOfRegistration, colour, engineSize, noOfDoors, fuelType);
        this.mp3Player = mp3Player;
        this.blueTooth = blueTooth;
        this.powerSteering = powerSteering;
        this.electricMirrors = electricMirrors;
        this.electricWindow = electricWindow;
    }

    public String getMp3Player() {
        return mp3Player;
    }

    public void setMp3Player(String mp3Player) {
        this.mp3Player = mp3Player;
    }

    public String getBlueTooth() {
        return blueTooth;
    }

    public void setBlueTooth(String blueTooth) {
        this.blueTooth = blueTooth;
    }

    public String getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(String powerSteering) {
        this.powerSteering = powerSteering;
    }

    public String getElectricMirrors() {
        return electricMirrors;
    }

    public void setElectricMirrors(String electricMirrors) {
        this.electricMirrors = electricMirrors;
    }

    public String getElectricWindow() {
        return electricWindow;
    }

    public void setElectricWindow(String electricWindow) {
        this.electricWindow = electricWindow;
    }
}
