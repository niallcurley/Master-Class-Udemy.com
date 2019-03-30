package practicejavaprograms;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int restaurantRating = 3;
//
//        switch (restaurantRating){
//
//            case 1:
//                System.out.println("not a great meal");
//                break;
//            case 2:
//                System.out.println("it okay food");
//                break;
//            case 3:
//                System.out.println("this food is out of this world");
//                break;
//
//                default:
//                    System.out.println("Never been to this place");
//                    break;



        Scanner scan = new Scanner (System.in);
        System.out.println("Choose a day from Monday - Saturday (1 - 6)\nto see which is best to work on ?");
        int bestDayToWork = scan.nextInt();

        switch (bestDayToWork){

            case 1:
                System.out.println("Monday £130 easy made");
                break;

            case 2:
                System.out.println("Tuesday £120 made");
                break;

            case 3:
                System.out.println("Wednesday £100 made");
                break;

            case 4:
                System.out.println("Thursday £90 made");
                break;

            case 5:
                System.out.println("Friday £100 made");
                break;

            case 6:
                System.out.println("Saturday £200 made");
                break;

            default:
                System.out.println("Chose again it must be between Monday and Saturday (1-6)");
        }

    }
}
