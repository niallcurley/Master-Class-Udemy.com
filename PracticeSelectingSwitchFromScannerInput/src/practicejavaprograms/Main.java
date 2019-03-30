package practicejavaprograms;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);



    static int getSelection(){
        int choice = 0;//set to zero
        boolean ok = false;// boolean rule
        do {
            System.out.print("Enter choice: ");

            try {// try condition - block
                choice = input.nextInt();//input for user
                ok = true;
            }//end of try
            catch(Exception ex){//catch statement maintains normal flow of program
                System.out.println("Error - Try Again!");
                input.nextLine();//Clear data for next command
            }//end of catch
        }//end of do while loop
        while(ok == false);
        return choice;
    }//end of getSelection method

    public static void main(String[] args) {

        boolean quit = false;//boolean set to false

        do {


        System.out.println("Choose Your T.V channel - Stations 1 to 4");


        int channel = getSelection();
        switch (channel){

            case 1:
                System.out.println("Welcome to BBC 1");
                break;

            case 2:
                System.out.println("Welcome to BBC 2");
                break;

            case 3:
                System.out.println("Welcome to ITV");
                break;

            case 4:
                System.out.println("Welcome to Channel 4");
                break;

                default:
                    System.out.println("Choose on of the four channels please");
        }//switch


    }//do - while
        while(quit != true);//end of quit

    }//main

}//class
