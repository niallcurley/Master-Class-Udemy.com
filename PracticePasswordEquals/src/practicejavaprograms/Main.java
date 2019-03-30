package practicejavaprograms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
	    final  String a = "john123";
	    String password;

        System.out.println("Please enter Password");
        password = s.next();

        if(password.equalsIgnoreCase(a)){
        System.out.println("Password correct");
    }else {
            System.out.println("Wrong password");
        }




    }
}
