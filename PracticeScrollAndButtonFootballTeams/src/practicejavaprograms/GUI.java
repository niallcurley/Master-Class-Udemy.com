package practicejavaprograms;

import javax.swing.*;//import JFrame
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class GUI extends JFrame{

    private JList leftList;
    private JList rightList;
    private JList myList;
    private JButton moveButton;
    private JButton notherButton;
    private static String[] plTeams = {"man city", "man utd", "liverpool", "stoke", "chelsea", "everton", "Crystal Palace", "sunderland"};
    private static String [] favoriteFood = {"stew", "vegetable", "chicken curry", "mash", "fry", "fish and chips", };


    public GUI() {
        super("Premier League Teams");
        setLayout(new FlowLayout());

        leftList = new JList(plTeams);
        leftList.setVisibleRowCount(5);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        myList = new JList(favoriteFood);
        myList.setVisibleRowCount(3);
        myList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(myList));



        moveButton = new JButton("Move-->");
        moveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        rightList.setListData(leftList.getSelectedValues());
                    }
                }
        );

        //experimental button
        //
        notherButton = new JButton("Useless Button");
        //this addActionListener gives functionality to the button as an event
        notherButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        rightList.setListData(myList.getSelectedValues());
                    }
                }
        );

        add(notherButton);

        add(moveButton);

        rightList = new JList();
        rightList.setVisibleRowCount(5);
        rightList.setFixedCellWidth(80);
        rightList.setFixedCellHeight(20);

        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));

    }
}
