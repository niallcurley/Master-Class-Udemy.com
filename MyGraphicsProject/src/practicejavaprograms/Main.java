package practicejavaprograms;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        JFrame f = new JFrame("Practicing Graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Design design = new Design();
        f.add(design);
        f.setSize(1000,500);
        f.setVisible(true);
    }
}
