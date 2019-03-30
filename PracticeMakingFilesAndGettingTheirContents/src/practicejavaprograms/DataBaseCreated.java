package practicejavaprograms;

import java.io.*;
import java.util.*;
import java.lang.*;

public class DataBaseCreated {

    //private Formatter f;
    private Formatter x;


    public void newFile(){
        try {
            x = new Formatter("Niall Family Data Base");
            System.out.println("Nialls Family Data Base Created");
        }catch (Exception e){
            System.out.println("Error Try Another File");
        }

    }

    public void addContentToDataBase (){
        x.format("%s %s %s %s", "Firstname", "Surname", "DOB     ", "Tel No.\n");
        System.out.println("************************************************");

        x.format("%s %s %s %s", "Niall    ", "Curley ", "21.10.70", "02890875671\n");
        x.format("%s %s %s %s", "John     ", "Curley ", "18.12.66", "02890555555\n");
        x.format("%s %s %s %s", "Joan     ", "Curley ", "13.8.68 ", "02877777777\n");
        x.format("%s %s %s %s", "Mary     ", "Curley ", "3.3.74  ", "02890555533\n");
        x.format("%s %s %s %s", "Ciara    ", "Curley ", "4.5.76  ", "02890222299\n");

    }

    public void shutDown(){
        x.close();
    }
}

