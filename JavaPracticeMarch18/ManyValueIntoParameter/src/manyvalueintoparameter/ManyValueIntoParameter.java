/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manyvalueintoparameter;

/**
 *
 * @author niall
 */
public class ManyValueIntoParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println(average(30,56,34,22));
    
   
   }//main

public static int average (int...numbers){
      int total=0;
      for(int x:numbers)
      total+=x;
       return total/numbers.length;
   }

}//class

