package com.company;

public class ParametrePractice {

    public void speak (String text){
        System.out.println(text);

    }

    public void jumping (String name, int height){
        System.out.println(name + " can jump " + height + " feet");
    }

    public void employeeId (String name, String address, String postcode, String telephoneNumber, int age, double height){
        System.out.println("My name is " + name + " and my address is "+ address + " and my postcode is " + postcode + " and my " +
                "telephone number is " + telephoneNumber + ". My age is " + age + " and my height is " + height);
    }


}
