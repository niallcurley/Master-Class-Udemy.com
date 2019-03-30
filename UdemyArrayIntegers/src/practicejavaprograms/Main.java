package practicejavaprograms;

import java.util.Scanner;

public class Main {

    //static keyword used so you dont have to created instance of Scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);//myIntegers equal getInteger method so the value of the element can be passed into the output

        for (int i=0; i<myIntegers.length; i++){
            System.out.println("Element "+i+ " typed value was "+myIntegers[i]);
        }

        System.out.println("The average is "+ getAverage(myIntegers));

    }

    //the point of this method is to return the values in each element entered by the user
    public static int [] getIntegers (int number){
        System.out.println("Enter " +number+ " integer values.\r");
        int[] values = new int[number];//array values created and int number is the passed parametre into its number of elements

        //loop to count up number of elements in number
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage (int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

}
