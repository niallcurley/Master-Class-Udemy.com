package practicejavaprograms;

import sun.security.util.Password;

import java.util.*;

public class Driver {

    public static void main(String[] args) {

        String command = " ";
        String username = " ";
        String password = " ";
        ArrayList<User> data = new ArrayList<User>();
        Scanner input = new Scanner(System.in);

        while (!command.equalsIgnoreCase("Exit")) {

            System.out.println("Please Enter a Command or Type Exit: ");
            command = input.next();

            if (command.equalsIgnoreCase("add")) {
                System.out.print("Username: ");
                username = input.next();
                System.out.println("Password:  ");
                password = input.next();


                if ((UserCheck(username).equals("Valid Username")) && (PassCheck(password).equals("Valid Password"))) {
                    User validUser = new User(username, password);
                    data.add(validUser);
                    System.out.println("Sucessful! ");
                    System.out.println("");
                } else {
                    System.out.println("Not a Valid Username or Password");
                    System.out.println(" ");
                }
            }


            if (command.equalsIgnoreCase("Veiw")) {
                System.out.println(" ");
                if ((data.size() == 0)) {
                    System.out.println("No User in the Database!");
                    System.out.println(" ");
                } else {
                    System.out.println("Current Users: ");
                    for (int x = 0; x < data.size(); x++) {
                        System.out.println(data.get(x).toString());
                    }
                    System.out.println(" ");
                }
            }


            if ((command.equalsIgnoreCase("Delete"))) {
                System.out.println("Username: ");
                username = input.next();
                if ((UserCheck(username).equals("Valid Username"))) {
                    for (int x = 0; x < data.size(); x++) {
                        if (username.equals(data.get(x).getUsername())) {
                            data.remove(x);
                            System.out.println("Delete Successful! ");
                            System.out.println();

                        } else
                            System.out.println("User Does Not Exist!");
                        System.out.println(" ");

                    }

                }
            } else {
                System.out.println("Not A Valid Username!");
                System.out.println();
            }
        }
    }
}

        /////////////////


        if (command.equalsIgnoreCase("Delete")) {
            boolean found = false;
            System.out.print("Username: ");
            username = input.next();
            if (UserCheck(username).equals("Valid Username")) {
                for (int x = 0; x < data.size(); x++) {
                    if (username.equals(data.get(x).getUsername())) {
                        data.remove(x);
                        found = true;
                        System.out.println("Delete Successful!");
                        System.out.println(" ");
                    }
                }
            } else {
                System.out.println("Not A Valid Username");
                System.out.println(" ");
                found = true;
            }

            if (found == false) {
                System.out.println("User Does Not Exist!");
                System.out.println();
            }

        }

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
