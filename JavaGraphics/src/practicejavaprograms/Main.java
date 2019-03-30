package practicejavaprograms;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Practicing Graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateColouredRectangles c = new CreateColouredRectangles();
        f.add(c);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
