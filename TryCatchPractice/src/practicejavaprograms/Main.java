package practicejavaprograms;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static int getSelection(){
        int choice = 0;//set to zero
        boolean ok = false;// boolean rule
        do {
            System.out.print("Enter choice of channel 1-5: ");
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
    }//end of getSelection method

    public static void main(String[] args) {


        TimesOfProgrammes t = new TimesOfProgrammes();

        int channelNum;
        int x = 1;

        //System.out.print("Please choose a channel between 1 - 5!");
        //channelNum = input.nextInt();
        int value = getSelection();



                switch (value) {
                    case 1:
                        try {
                            System.out.println("Welcome to channel " + value);
                            t.messageChoice();
                        }catch (Exception e) {
                            System.out.println("Try again");
                            input.nextLine();
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Welcome to channel " + value);
                            t.messageChoice();
                        }catch (Exception e){
                            System.out.println("Try again");
                            input.nextLine();
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Welcome to channel " + value);
                            t.messageChoice();
                        }catch (Exception e){
                            System.out.println("Try again");
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Welcome to channel " + value);
                            t.messageChoice();
                        }catch (Exception e){
                            System.out.println("Try again");
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Welcome to channel " + value);
                            t.messageChoice();
                        }catch (Exception e){
                            System.out.println("Try again");
                        }
                        break;
                    default:
                        System.out.println("Error - choose 1-9");





            }


    }
}
