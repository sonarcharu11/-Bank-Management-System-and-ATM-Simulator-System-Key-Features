package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setTitle("Atomated Teller machine");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.JPG"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel(" CARD NO");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(190, 150, 400, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(370, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBackground(Color.BLACK);
        cardTextField.setForeground(Color.WHITE);
        add(cardTextField);

        JLabel pin = new JLabel("ENTER PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(200, 220, 400, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(370, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBackground(Color.BLACK);
        pinTextField.setForeground(Color.WHITE);
        add(pinTextField);

        login = new JButton("SINE IN");
        login.setBounds(370, 300, 100, 30);
        login.setBackground(Color.GRAY);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(520, 300, 100, 30);
        clear.setBackground(Color.GRAY);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);

        add(clear);

        signup = new JButton("SIGNUP");
        signup.setBounds(420, 350, 150, 30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText(" ");
            pinTextField.setText(" ");

        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumberr = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select *from login where card_numberr='" + cardnumberr + "' and pin='" + pinnumber + "'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin number");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);

            }

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);

        }

    }

    public static void main(String args[]) {
        Login login1 = new Login();

    }

}
