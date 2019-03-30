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
public class Time24Hr {
    
    private int hour;
    private int second;
    private int minute;
    
    public void setTime (int h, int s, int m){
        hour =((h>0 && h<24) ? h : 0);
        second =((s>0 && s<24) ? s : 0);
        minute =((m>0 && m<24) ? m : 0);

    }//
    
    public String militaryTime(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    
    
}
