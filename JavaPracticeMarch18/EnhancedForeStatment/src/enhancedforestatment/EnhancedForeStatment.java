/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforestatment;

/**
 *
 * @author niall
 */
public class EnhancedForeStatment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumOfValues[]={45,67,87,22,33,44,55};
        int total=0;
        
        for(int x: sumOfValues){
            total +=x;
        }
        System.out.println(total);
    
}
}