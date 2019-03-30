package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double[] myPrice = getIntArray(10);

        for (int i = 0; i < myPrice.length; i++) {
            System.out.println("The price of " + i + " sandwiches = " + myPrice [i]);
        }


    }

    public static double [] getIntArray(int intValues) {
        System.out.println("Enter Sandwich Type price. " + intValues);


        double[] sandwichValues = new double[intValues];

        for (int i = 0; i < sandwichValues.length; i++) {

            sandwichValues [i] = scanner.nextDouble();

        }


        return sandwichValues;
    }
}
