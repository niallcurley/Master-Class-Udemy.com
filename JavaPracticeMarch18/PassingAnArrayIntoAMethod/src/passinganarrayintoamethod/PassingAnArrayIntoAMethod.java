/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passinganarrayintoamethod;

/**
 *
 * @author niall
 */
public class PassingAnArrayIntoAMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nums []={3,4,5,6,7};
        change(nums);
        
        }//main
    
    public static void change(int x[]){
        for(int counter=0;counter<x.length;counter++){
            x[counter]+=5;
        }
    }
    
}//class
