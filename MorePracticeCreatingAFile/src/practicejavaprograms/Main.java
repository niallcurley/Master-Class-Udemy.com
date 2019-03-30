package practicejavaprograms;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Formatter file;



        try {
            file = new Formatter("Large Mustaches.txt");
            System.out.println("Large Mustaches File Created");
        }catch (Exception e){
            System.out.println("Error File Exists");
        }




    }
}
