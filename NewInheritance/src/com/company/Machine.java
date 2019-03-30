package com.company;

public class Machine {
    //private
    //protected
    String name = "Machine no 1";
    //private means that name can only be accessed with this class. If you take it out you can access it from any class.
    //protected means that you can access this class and its methods

    public void start () {
        System.out.println("Start up");
    }

    public void stop (){

        System.out.println("Stop");
    }


}
