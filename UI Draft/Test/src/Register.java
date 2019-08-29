import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Register {
    private static JFrame registerframe;
    public static void createAndShowGUI() {

        registerframe = new JFrame("Register");
        registerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerframe.setSize(350,270);

        JPanel registerpanel = new JPanel();
        registerpanel.setLayout(null);
        registerframe.add(registerpanel);
        //set label
        JLabel NameLabel = new JLabel("Name:");
        NameLabel.setBounds(30,30,80,25);
        JLabel GenderLabel = new JLabel("Gender:");
        GenderLabel.setBounds(30,70,80,25);
        JLabel AgeLabel= new JLabel("Age:");
        AgeLabel.setBounds(30,110,80,25);
        JLabel ActorLabel= new JLabel("Actor:");
        ActorLabel.setBounds(30,150,80,25);

        //set textfield
        JTextField NameText = new JTextField(20);
        NameText.setBounds(130,30,165,25);
        JTextField GenderText = new JTextField(20);
        GenderText.setBounds(130,70,165,25);
        JTextField AgeText = new JTextField(20);
        AgeText.setBounds(130,110,165,25);

        //set combobox
        JComboBox ActorComboBox = new JComboBox();
        ActorComboBox.setBounds(130,150,165,25);
        ActorComboBox.addItem("Please Choose");
        ActorComboBox.addItem("Customer");
        ActorComboBox.addItem("Owner");
        ActorComboBox.addItem("Administrator");

        //set button
        JButton ConfirmButton = new JButton("Confirm");
        ConfirmButton.setBounds(135, 190, 80, 25);
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginExample.ShowLogin();
                registerframe.setVisible(false);
            }
        });


        registerpanel.add(NameLabel);
        registerpanel.add(GenderLabel);
        registerpanel.add(AgeLabel);
        registerpanel.add(ActorLabel);
        registerpanel.add(NameText);
        registerpanel.add(GenderText);
        registerpanel.add(AgeText);
        registerpanel.add(ActorComboBox);
        registerpanel.add(ConfirmButton);

        // 显示窗口
        registerframe.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = registerframe.getSize().width;
        int h = registerframe.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        registerframe.setLocation(x, y-100);
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}