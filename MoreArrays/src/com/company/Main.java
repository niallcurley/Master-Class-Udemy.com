package com.company;

public class Main {

    public static void main(String[] args) {

        int [] myArray;
        myArray  = new int[5];

        myArray [0] = 78;
        myArray [1] = 178;
        myArray [2] = 758;
        myArray [3] = 278;
        myArray [4] = 978;

        System.out.println(myArray [0]);

        for (int i = 0; i<myArray.length; i++)
            System.out.println("Element " + i + " contains a value of "+ myArray [i]);










    }
}
