package practicejavaprograms;

import java.util.Scanner;

public class TimesOfProgrammes {

    Scanner input = new Scanner(System.in);

     int getSelection(){
        int choice = 0;//set to zero
        boolean ok = false;// boolean rule
        do {
            System.out.print("Choose between 9.00-3.00: ");
            try {// try condition - block
                choice = input.nextInt();//input for user
                ok = true;
            }//end of try
            catch(Exception ex){//catch statement maintains normal flow of program
                System.out.println("Error - Try Again!");
                input.nextLine();//Clear data for next command
            }//end of catch
        }//end of do while loop
        while(ok == false);
        return choice;
    }

    //private Scanner input = new Scanner(System.in);
    Actors a = new Actors();

    public void messageChoice(){

        //System.out.println("Choose time between 9.00 & 3.00");

        int time = getSelection();

        try {


            switch (time) {
                case 9:
                    System.out.println("The BBC Breakfast News");
                    final String actor1 = a.actor1;
                    System.out.println(actor1);
                    break;
                case 10:
                    System.out.println("Test Cricket");
                    final String actor2 = a.actor2;
                    System.out.println(actor2);
                    break;
                case 11:
                    System.out.println("Rosie & Jim");
                    final String actor3 = a.actor3;
                    System.out.println(actor3);
                    break;
                case 12:
                    System.out.println("Midday News");
                    final String actor4 = a.actor4;
                    System.out.println(actor4);
                    break;
                case 1:
                    System.out.println("Politics OF Europe");
                    final String actor5 = a.actor5;
                    System.out.println(actor5);
                    break;
                case 2:
                    System.out.println("Tennis in Wimbleton");
                    final String actor6 = a.actor6;
                    System.out.println(actor6);
                    break;
                case 3:
                    System.out.println("The deep blue sea");
                    final String actor7 = a.actor7;
                    System.out.println(actor7);
                    break;

                default:
                    System.out.println("Please choose another time");


            }

        }catch (Exception e){
            System.out.println("Choose between 9.00-3.00");
        }
   }


}
