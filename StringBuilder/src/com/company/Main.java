package com.company;

public class Main {

    public static void main(String[] args) {


        //not an efficient way to work with strings.
        String info = "";

        info += "My name is bob";
        info += " ";
        info += "and I am a builder";

        System.out.println(info);

        String importantNotes = "My name is  Niall Curley, I am a Christian. I beleive in the gospel and want to see" +
                " Jesus glorified in West Belfast.\nI am part of a non denominational Church called 'Coracle Christian" +
                " Fellowship. We have been praying\n for the community to come together under Christ for some years now";

        System.out.println(importantNotes);
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");


        //more efficient way to work with strings
        StringBuilder stringBuilder = new StringBuilder("");

        stringBuilder.append("My name is Niall");
        stringBuilder.append(" ");
        stringBuilder.append("and I am a taxi driver");
        System.out.println(stringBuilder.toString());
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");


        StringBuilder fg;
        fg = new StringBuilder();
        fg.append("For a much and i can say").append(" ").append("I know nothing");
        System.out.println(fg.toString());
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");


        //Formating strings

        System.out.println("Here is some text.\tThat was a tab.\nThat was a new line");

        System.out.println("There was a few customers today who were more complicated than usual.\tOne job included a kid who knew everything.\n");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");

        StringBuilder shortNote = new StringBuilder();

        shortNote.append("uyfkuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu.\n" +
                "fukuyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy\n" +
                "wetttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt\n");

        System.out.println(shortNote.toString());

        //Formatting  - Print format

        System.out.printf("Total cost of items %d, quantity of items %d\n", 4, 100 );
        System.out.printf("Total cost of items %5d, quantity of items %5d\n", 3,150);
        System.out.printf("Total cost of items %-5d, quantity of items %-5d\n", 3,150);

        //Print formant with for loop
        for (int i=0; i<20; i++){
            System.out.printf("%-2d: life is wonderful.\n", i);// this is how you format integers represted by the letter 'd'
        }
        //formatting to 2 places on floating point values.  '%.3f' or %.2f
        System.out.printf("Amount of total expenditure to two decimal places £%.2f\n", 45895.699394);//formatting to 2 places on floating point values.  '%.3f' or %.2f
        System.out.printf("Amount of total expenditure to two decimal places £%10.2f\n", 45895.699394);
        System.out.printf("Amount of total expenditure to two decimal places £%10.2f\n", 45895.699394);//formatting to 2 places on floating point values.  '%.3f' or %.2f
        System.out.printf("Amount of total expenditure to two decimal places £%12.2f\n", 45895.699394);
        System.out.printf("Amount of total expenditure to two decimal places £%9.2f\n", 45895.699394);//formatting to 2 places on floating point values.  '%.3f' or %.2f

        //formatting to 2 places on floating point values.  '%.3f' or %.2f


     //practicing stringbuilder

        StringBuilder newStrings = new StringBuilder();

        newStrings.append("I am the main man in the taxi during the daytime but at night time its Fred.");

        System.out.println(newStrings.toString());






    }




}
