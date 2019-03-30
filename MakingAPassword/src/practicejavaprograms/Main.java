package practicejavaprograms;

/*
This programme validates a valid email address.
This allows input from the user as to the correct password
It allows only letters, number, @, underscore and a period.
It must be a valid email address
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputUserName;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username:  ");
        inputUserName = input.next();

        System.out.println(UserCheck(inputUserName));
        System.out.println(" ");

        main(args);

    }

    public static String UserCheck (String Username) {

        String result = "Valid Username";
        int atLoc = 0;
        int perLoc = 0;
        int atCount = 0;
        int perCount = 0;

        for (int x = 0; x < Username.length(); x++) {
            //charAt connects with the ASCii table
            if ((Username.charAt(x) >= 48 && Username.charAt(x) <= 57) || (Username.charAt(x) >= 65 && Username.charAt(x) <= 90) ||
                    (Username.charAt(x) >= 97 && Username.charAt(x) <= 122) || (Username.charAt(x) == 64) || (Username.charAt(x) == 46)
                    || (Username.charAt(x) == 95)) {

            } else {
                result = "Username Contains Invalid Letters";
            }

            if (Username.charAt(x) == 64) {//64 is the @ symbol
                atLoc = x;
                atCount++;
            }

            if (Username.charAt(x) == 46) {//46 is the . symbol
                perLoc = x;
                perCount++;
            }

        }//end of for loop

        if ((atLoc < 1) || (perLoc < 1)) {
            result = "Not a valid email address";
        }//@ symbol must be present & . must be present - AT LEAST ONE OF EACH

        if (perLoc < atLoc){
            result = "Not a valid email address";
        }// location of period symbol must be before the @.
        //

        if ((atCount > 1) || (perCount >2)){
            result = "Not a valid email address";
        }

        return (result);
    }//ends the passcheck method


}//ends the validate password class
