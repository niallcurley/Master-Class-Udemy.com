package com.company;

public class Frog {

    private String name;
    private int id;

    public Frog(int id, String name){
        this.name = name;
        this.id = id;
    }



    public String toString (){

//        return String.format("%-3d: %s",id,name);//use the String.format for returning a string.

        //return String.format("%4d: %s",id,name);//this allow the formatting the string


        //return id + ": " + name;
        //each time you put a plus sign between int and string you are creating more string.

        //more efficient way to do this is to make only one string object.
        StringBuilder stringBuilder = new StringBuilder();//special kind of object for keeping one string together
        stringBuilder.append(id).append(": ").append(name);//one string object
        return stringBuilder.toString();
    }
}
