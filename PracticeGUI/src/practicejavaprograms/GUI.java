package practicejavaprograms;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends JFrame{//JFrame has built in stuff for buttons

    private JButton reg;//regular button
    private JButton custom;//special one

    public GUI (){//this is the JFrame constructor has no parameters, because we want a window
        //to automaticaly pop up with out making a method
        super("Button Presser");//the super keyword is how you call methods from the super class in this case its JFrame
        setLayout(new FlowLayout());//layout of buttons - default layout

        reg = new JButton("Regular Button");
        add(reg);//add button to screen

        //we now have a blank box and a button with a title on it.

        //this code gets the images you want and saves it in the objects b and x.
        Icon b = new ImageIcon(getClass().getResource("green.png"));//getResource code for getting the file
        Icon x = new ImageIcon(getClass().getResource("trinitywhite.png"));

        //this code changes the above images into a button
        custom = new JButton("Customized", b);//created new buttom and gave it new name
        custom.setRolloverIcon(x);//creates a rollover effects
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);



    }//end of constructor

    private class HandlerClass implements ActionListener{//implements means you have to over ride the methods in the class
        public void actionPerformed (ActionEvent event){

            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
