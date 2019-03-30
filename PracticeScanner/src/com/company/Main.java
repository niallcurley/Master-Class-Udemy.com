package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word ");
        String word = input.nextLine();

        System.out.println("New word that you entered was " + word);


        Scanner inputInt = new Scanner(System.in);

        System.out.println("Enter an integer ");
        int value = input.nextInt();

        System.out.println("Your integer was " + value);
    }
}
