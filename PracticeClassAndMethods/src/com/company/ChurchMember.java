package com.company;

public class ChurchMember {
    String name;
    String address;
    String postcode;
    int age;
    String martialStatus;
    int noOfDependents;


    public void calculateYearsToRetirement (){
        int retirementAge = 65 - age;
        System.out.println(retirementAge);
    }


    public void teach (){
        System.out.println("Jesus is the Lord");
    }

    public void drive (){
        for(int i=0; i<3; i++) {
            System.out.println("Put the boot down");
        }
    }

    public void sing () {
        System.out.println("Oh come let us adore him");
        System.out.println("Oh come let us adore him");
    }

    public void rota(){

    }

    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public int getNoOfDependents() {
        return noOfDependents;
    }
}
