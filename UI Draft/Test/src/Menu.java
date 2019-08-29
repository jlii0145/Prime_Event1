import javax.swing.*;
import java.awt.*;


public class Menu {

    public static void ShowMenu() {

        JFrame menuframe = new JFrame("Hall Menu");
        menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel searchPanel = new JPanel();
        JPanel mainPanel = new JPanel();
        searchPanel.setBounds(0,0,10000,30);
        searchPanel.setBackground(Color.gray);
        //JMenuBar searchPanel = new JMenuBar();
        searchPanel.setLayout(null);
        JLabel datelabel = new JLabel("Date:");
        datelabel.setBounds(10,5,50,20);
        JLabel tolabel = new JLabel("To");
        tolabel.setBounds(310,5,50,20);
        JLabel namelabel = new JLabel("Name:");
        namelabel.setBounds(610,5,50,20);

        JTextField dateText1 = new JTextField(10);
        dateText1.setBounds(110,5,170,20);
        JTextField dateText2 = new JTextField(10);
        dateText2.setBounds(410,5,170,20);
        JTextField nameText = new JTextField(10);
        nameText.setBounds(710,5,130,20);

        JButton searchButton = new JButton("search");
        searchButton.setBounds(900,5,130,20);

        searchPanel.add(datelabel);
        searchPanel.add(tolabel);
        searchPanel.add(namelabel);

        searchPanel.add(dateText1);
        searchPanel.add(dateText2);
        searchPanel.add(nameText);

        searchPanel.add( searchButton);

        menuframe.add(searchPanel);
        menuframe.add(mainPanel);
        //menuframe.setJMenuBar(searchPanel);
        menuframe.pack();
        menuframe.setVisible(true);
        menuframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        ShowMenu();
    }
}