package practicejavaprograms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //example of lots of instances of an object being created. This is the importance of constructors and instances.
        Scanner input = new Scanner(System.in);
        GirlName mother = new GirlName("Joan");
        GirlName mother1 = new GirlName("Maureen");
        GirlName mother2 = new GirlName("Florence");
        GirlName mother3 = new GirlName("Isabel");


        //System.out.println("Enter your mothers name: ");
        //String myMothersName = input.nextLine();//temporary String variable for inputting

        //mother.setName(myMothersName);
        mother.saying();
        mother1.saying();
        mother2.saying();
        mother3.saying();

    }
}
