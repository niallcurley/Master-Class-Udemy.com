package practicejavaprograms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Name myName = new Name();

        System.out.println("Enter your name: ");
        String nameOne = input.nextLine();

        myName.passNameMethod(nameOne);

    }
}
