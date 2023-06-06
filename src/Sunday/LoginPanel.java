package Sunday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel implements ActionListener {

    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPanel() {
        setLayout(new GridLayout(3, 2));

        usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        usernameField = new JTextField();
        add(usernameField);

        passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setPreferredSize(new Dimension(50, 30)); // menetapkan ukuran tombol
        add(loginButton);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Add login logic here

            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Panel");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LoginPanel loginPanel = new LoginPanel();
        frame.add(loginPanel);

        frame.setVisible(true);
    }
}
