package practicejavaprograms;

//import com.sun.glass.events.MouseEvent;

import java.awt.*;//imports colours, border layouts
import java.awt.event.*; //all mouse events
import javax.swing.*;

public class GUI extends JFrame{
    private JPanel mousepanel;// area where the mouse moves and clicks
    private JLabel statusbar;//a status bar at bottom that lets you know what you have done


    public GUI () {
        super("Mouse Movements");

        //set JPanel to mousepanel so we can use it.
        mousepanel = new JPanel();//creating a panel
        mousepanel.setBackground(Color.WHITE);//creating a background
        add(mousepanel, BorderLayout.CENTER);//placing the panel in the center

        //creating the status bar
        statusbar = new JLabel("Our Default");
        add(statusbar,BorderLayout.SOUTH);

        Handlerclass handlerclass = new Handlerclass();
        mousepanel.addMouseListener(handlerclass);
        mousepanel.addMouseMotionListener(handlerclass);

    }

    private class Handlerclass implements MouseListener, MouseMotionListener{


        //there are five methods in this class in this order
        public void mouseClicked (MouseEvent event){
            statusbar.setText(String.format("Clicked at %d,%d",event.getX(), event.getY()));
        }//method mouseClicked

        public void mousePressed (MouseEvent event){
            statusbar.setText("You pressed down the mouse");

        }//method mousePressed

        public void mouseReleased(MouseEvent event){
            statusbar.setText("You have released the mouse buttom");
        }

        public void mouseEntered (MouseEvent event){
            statusbar.setText("You moved mouse into panel");
            mousepanel.setBackground(Color.RED);
        }

        public void mouseExited (MouseEvent event){
            statusbar.setText("The mouse has left the panel");
            mousepanel.setBackground(Color.WHITE);
        }

        //these are mouse motion events
        public void mouseDragged (MouseEvent event){
            statusbar.setText("Dragging the mouse");
        }

        public void mouseMoved (MouseEvent event){
            statusbar.setText("You moved the mouse");
        }


    }//Handlerclass
}//end of class GUI
