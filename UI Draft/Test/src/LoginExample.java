import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginExample {
    private static JDialog dialog;
    public static void main(String[] args) {
        ShowLogin();
    }
public static void ShowLogin()
{

    dialog = new JDialog();
    dialog.setTitle("Login Example");
    dialog.setSize(350, 200);


    JPanel panel = new JPanel();

    dialog.add(panel);
    placeComponents(panel);
    dialog.setVisible(true);

//set the location of dialog in the center of screen
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int w = dialog.getSize().width;
    int h = dialog.getSize().height;
    int x = (dim.width-w)/2;
    int y = (dim.height-h)/2;
    dialog.setLocation(x, y-100);

}
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(30,30,80,25);
        panel.add(userLabel);


        JTextField userText = new JTextField(20);
        userText.setBounds(130,30,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30,60,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(130,60,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(70, 100, 80, 25);
        panel.add(loginButton);

        JButton signupButton = new JButton("sign up");
        signupButton.setBounds(180, 100, 80, 25);
        panel.add(signupButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.ShowMenu();
                dialog.setVisible(false);
            }
        });
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register.createAndShowGUI();
                dialog.setVisible(false);
            }
        });
    }






}