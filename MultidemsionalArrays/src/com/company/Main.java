package com.company;

public class Main {

    public static void main(String[] args) {

        int [][] myIntegers = {
            {3,6,9,12,37},
            {9,8,3,777,2235},
            {6,9,22,11}

        };

        System.out.println(myIntegers [0] [2]);
        System.out.println(myIntegers [0] [3]);
        System.out.println(myIntegers [1] [2]);
        System.out.println(myIntegers [2] [2]);


        String [] [] myStoryBook = new String[3][3];

        myStoryBook [0][2] = "In the beginning God created the heavens and the earth.";


        System.out.println(myStoryBook [0][2]);








    }
}
