package practicejavaprograms;



import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);


    static int getSelection(){
        int choice = 0;//set to zero
        boolean ok = false;// boolean rule
        do {
            System.out.print("Enter choice: ");
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



    public static void main(String[] args) throws IOException, URISyntaxException {




    //MyBankAcc myBankAcc = new MyBankAcc();
        MyBankAcc myBankAcc = null;

    //main menu of choices

        boolean quit = false;//boolean set to false

        do {
            //myBankAcc.getMenu();
            int value = getSelection();// initalizing getSelection method that has been called

            switch (value){

        case 1 :

            try{

                System.out.print("Enter Account Number: ");
            int myAccountNo = input.nextInt();
            //input.nextLine();
            System.out.println("Your Account Number is: "+ myAccountNo);
            input.nextLine();


            System.out.print("Enter Your Name: "  );
            String myName = input.nextLine();
            System.out.println("Your Name is: "+ myName);

            System.out.println("Enter Your Address: ");
            String myAddress = input.nextLine();
            System.out.println("Your Address is: " + myAddress);

            System.out.println("Enter Your PostCode: ");
            String myPostCode = input.nextLine();
            System.out.println("Your PostCode is: " + myPostCode);

            System.out.println("Enter Your Phone Number: ");
            String myPhoneNumber = input.nextLine();
            System.out.println("Your Phone Number: "+ myPhoneNumber);

            System.out.println("Enter Your Age: ");
            int myAge = input.nextInt();
            System.out.println("Your Age: " + myAge);

            System.out.println("Enter Your Balance: ");
            double myBalance = input.nextDouble();
            System.out.println("My balance is: "+ myBalance);

            myBankAcc = new MyBankAcc(myAccountNo, myName, myAddress, myPostCode, myPhoneNumber, myAge, myBalance);
        }//end of try

        catch (Exception ex){
            System.out.println("Error in input - try again!");
            input.nextLine();//clear next line
            System.out.println();
        }//end of catch
            break;

        case 2:

            try {
                System.out.println();
                System.out.println();
                System.out.println("***********Customer Details*******************");
                System.out.println("**********************************************");
                System.out.println("**********************************************");
                System.out.println("Customer Account no: "+ myBankAcc.getAccountNumber());
                System.out.println("Customer Name "+myBankAcc.getName());
                System.out.println("Customer Address "+myBankAcc.getAddress());
                System.out.println("Customer Postcode "+myBankAcc.getPostCode());
                System.out.println("Customer Age "+myBankAcc.getAge());
                System.out.println("Customer Balance "+myBankAcc.getBalance());
            }

            catch (Exception ex){
                System.out.println("Error in input - try again!");
                input.nextLine();//clear next line
                System.out.println();
            }
            break;

        case 3:

            try {


                System.out.println("Enter the amount to deposit");
                double newAmountDeposited = input.nextDouble();
                System.out.println("Amount to deposit: "+newAmountDeposited);
                myBankAcc.deposit(newAmountDeposited);
                System.out.println("New Balance is: "+myBankAcc.getBalance());
            }

            catch (Exception ex){
                System.out.println("Error in input - try again!");
                input.nextLine();//clear next line
                System.out.println();
            }
            break;

        case 4:
            try {


                System.out.println("How much do you wish to withdraw?");
                double newAmountWithdraw = input.nextDouble();
                System.out.println("Amount withdrawn "+newAmountWithdraw);
                myBankAcc.withdrawal(newAmountWithdraw);
                System.out.println("New Balance "+ myBankAcc.getBalance());
            }

            catch (Exception ex){
                System.out.println("Error in input - try again!");
                input.nextLine();//clear next line
                System.out.println();
            }

            break;

            default:System.out.println("Error - Please select a number between 1 and 4");//default in case of erroneous input
                System.out.println();
                System.out.println();

    }//end of switch

        }
        while(quit != true);//end of quit



    }//end of main
}//end of class
