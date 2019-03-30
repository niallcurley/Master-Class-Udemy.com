package practicejavaprograms;
import javax.swing.*;
import java.awt.*;

public class Design extends JPanel {

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        //rectangle one
        g.setColor(Color.ORANGE);
        g.fillRect(25,25,300,100);

        //rectangle two
        g.setColor(new Color(190,81,215));
        g.fillRect(25,140, 300,100);

        g.setColor(Color.CYAN);
        g.drawString("This is coloured text", 25, 300);

        g.setColor(Color.BLUE);
        //g.drawArc(400,30,30,7,9,9);
        g.drawString("This is more text", 500, 100);

        g.setColor(new Color(22, 66,80));
        g.fillRect(65, 300, 100,100);


    }

}
