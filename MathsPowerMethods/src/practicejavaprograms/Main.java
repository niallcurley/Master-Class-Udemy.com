package practicejavaprograms;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //built in maths classes
        //System.out.println(Math.abs(-33.4));//absolute value  - basically how much is this number away from zero.
        //System.out.println(Math.ceil(4.5));//ceiling - rounding a number up to a full number 5.0
        //System.out.println(Math.floor(5.5));  rounds a number down to nearest full number 5.0
        //System.out.println(Math.max(5,9));
        //System.out.println(Math.min(7,2));
        //System.out.println(Math.pow(5,3));  object and method for finding the power of somethng
        //System.out.println(Math.sqrt(9)); finds the square root

        //creating a random set of number with random class
        Random dice = new Random();
        int number;

//        for (int counter =1; counter <=10; counter++){
//            number = 1+dice.nextInt(6);//1+dice means print random numbers between 1-6
//            System.out.println(number+" ");
//        }

        for(int counter =1; counter <=10; counter++){
            number = dice.nextInt(20);
            System.out.println(number + " ");
        }

    }
}
