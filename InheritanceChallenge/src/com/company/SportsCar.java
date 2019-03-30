package com.company;

public class SportsCar extends Car{


    String lowProfileTyres;
    String sportsMirrors;
    String leatherInterior;

    public SportsCar(String name, String model, int yearOfRegistration, String colour, int engineSize, int noOfDoors,
                     String fuelType, String mp3Player, String blueTooth, String powerSteering, String electricMirrors,
                     String electricWindow, String lowProfileTyres, String sportsMirrors, String leatherInterior) {
        super(name, model, yearOfRegistration, colour, engineSize, noOfDoors, fuelType, mp3Player, blueTooth,
                powerSteering, electricMirrors, electricWindow);
        this.lowProfileTyres = lowProfileTyres;
        this.sportsMirrors = sportsMirrors;
        this.leatherInterior = leatherInterior;
    }

    public String getLowProfileTyres() {
        return lowProfileTyres;
    }

    public void setLowProfileTyres(String lowProfileTyres) {
        this.lowProfileTyres = lowProfileTyres;
    }

    public String getSportsMirrors() {
        return sportsMirrors;
    }

    public void setSportsMirrors(String sportsMirrors) {
        this.sportsMirrors = sportsMirrors;
    }

    public String getLeatherInterior() {
        return leatherInterior;
    }

    public void setLeatherInterior(String leatherInterior) {
        this.leatherInterior = leatherInterior;
    }
}
