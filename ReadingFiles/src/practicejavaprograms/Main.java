package practicejavaprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{


        String fileName = //"C:\\Users\\niall.LAPTOP-6FGCD18F\\OneDrive\\Email attachments\\My Documents\\";
                "C:/Users/niall.LAPTOP-6FGCD18F/OneDrive/Email attachments/My Documents/exampleFile.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println(line);
        }

        in.close();//closing scanner

    }
}
