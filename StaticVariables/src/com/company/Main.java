package com.company;

public class Main {

    public static void main(String[] args) {

        Thing.description = "I am describing a static variable,one that doesnt need an instance.";// no instance required
        System.out.println(Thing.description);

        Thing thing1 = new Thing();///describes an instance of class

        thing1.setName("David");

        System.out.println(thing1.getName());

        Thing.showInfo();//you do not have to create an instance just call the actual class and method

        Thing.description = "What are you doing ";

        thing1.secondShowTime();

        System.out.println(Math.PI);// PI is a constant value that doesnt change in a program - constants can be set for programs using final

        System.out.println(Thing.LUCKYNUMBER);//constant static value in upper case - no instance created







    }
}
