package com.company;

public class Main {

    public static void main(String[] args) {

        //int count = 5;
//	while (count != 5) {
//        System.out.println("The count value is " + count);
//        count++;
//    }

//    count = 1;
//    while (true){
//	    if (count == 6){
//	        break;
//        }
//        System.out.println("The count value is " + count);
//        count++;
//    }
//       for (int i = 1; i < 7; i++){
//       System.out.println("The count value is " + i);
//       }

//        count = 2;// if count is set to below 6 it will work otherwise and endless loop
//        //this code always works at least once
//        do {
//            System.out.println("The count value is " + count);
//            count++;
//
//            // if (count > 100) {
//            //  break;
//            //}
//        } while (count != 2);//condition i

        int number = 5;
        int finishNumber = 14;

        while(number <= finishNumber){
//            if (isEvenNumber(number)){
//                System.out.println("Even number " + number);
//                number++;
//            }
//            number++;
//            continue;

            if (!isEvenNumber(number)){//if its 'not' an even number, then it will bypass the block do system.out.println (43.44).
                number++;
               continue;  //means to bypass the code 'System.out.println ("Even number " + number)
            }
            System.out.println("Even number " + number);
            number++;
        }

    }//main

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;

        }
    }


}//class
