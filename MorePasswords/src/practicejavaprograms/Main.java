package practicejavaprograms;

/*
this is a programme that validates a password
 */

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        String inputPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Password:  ");
        inputPassword = input.next();

        System.out.println(PassCheck (inputPassword));
        System.out.println(" ");

        main(args);

    }

    public static String PassCheck (String Password){
        String result = "Valid Password";
        int length = 0;
        int numCount = 0;
        int capCount = 0;

        for (int x =0; x < Password.length(); x++){
            if((Password.charAt(x) >= 47 && Password.charAt(x) <= 58)
                    || (Password.charAt(x) >= 64 && Password.charAt(x) <=91) ||
                    (Password.charAt(x) >= 97 && Password.charAt(x) <= 122)){

            }else {
                result = "Password Contains Invalid Character!";
            }

            if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {
                numCount++;
            }

            if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)){
               capCount ++;
            }

            length = (x + 1);
        }

        if (numCount < 2){
            result = "At least 2 Numbers in Password!";
        }

        if (capCount < 2){
            result = "At least two Capital Letters in Password!";
        }

        if (length < 8){
            result = "Password must be at least 8 characters!";
        }

        return (result);
    }
}
