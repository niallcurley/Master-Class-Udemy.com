package practicejavaprograms;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Various Shapes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DifferentShapes d = new DifferentShapes();
        f.setBackground(Color.WHITE);
        f.add(d);
        f.setSize(500,270);
        f.setVisible(true);
    }
}
