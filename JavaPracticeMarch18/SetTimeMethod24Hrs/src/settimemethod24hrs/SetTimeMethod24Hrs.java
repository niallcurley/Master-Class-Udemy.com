/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settimemethod24hrs;

/**
 *
 * @author niall
 */
public class SetTimeMethod24Hrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time24Hr myTime = new Time24Hr();
        myTime.setTime(8, 21, 12);
        System.out.println(myTime.militaryTime());
    }
    
}
