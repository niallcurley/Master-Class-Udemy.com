package practicejavaprograms;

//import oracle.jrockit.jfr.JFR;

import javax.swing.JFrame;//this import lets you use windows for buttons and icons

 public class Main{
    public static void main(String[] args) {


        GUI go = new GUI();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for closing your program
        go.setSize(300,200);
        go.setVisible(true);
    }
}
