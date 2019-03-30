package com.company;

public class Main {

    public static void main(String[] args) {


    //this is the typical if else statment for different outcomes.
//	int value = 3;
//	if (value == 1){
//        System.out.println("This is value for 1");
//    }else if(value ==2){
//        System.out.println("This is value for 2");
//    } else
//        System.out.println("Value was not 1 or 2");

         //switch statement is good for testing different values for same variable 'switchValue'


        int switchValue = 6;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3, was 4, was 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1,2,3,5 or 5");
                break;
        }

        char letter = 'f';

        switch (letter){
            case 'a':
                System.out.println("This is letter " + letter);
                break;

            case 'b':
                System.out.println("This is letter " + letter);
                break;

            case 'c':
                System.out.println("This is letter " + letter);
                break;

            case 'd':
                System.out.println("This is letter " + letter);
                break;

            case 'e':
                System.out.println("This is letter " + letter);
                break;

            default:
                System.out.println("This is neither a,b,c,d or e");
                break;
        }

        String month = "march";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("This month is " + month);
            break;

            case "february":
                System.out.println("This month is " + month);
                break;

            case "march":
                System.out.println("This month is " + month);
                break;

            case "april": case "may": case "june":
                System.out.println("This month is either april, may, june");
                break;

                default:
                    System.out.println("This is a month after June");
                    break;
        }

    }
}
