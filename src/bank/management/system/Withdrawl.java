package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;



public class Withdrawl extends JFrame implements ActionListener {
     JTextField amount;
      JButton withdrawl,back;
      String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
               

        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,740);
        add(image);
        
        
        JLabel text= new JLabel("Enter The amount You Want To Deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,15));
        text.setBounds(200, 240, 400, 20);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Rleway",Font.BOLD, 22));
        amount.setBounds(220, 290, 250, 30);
        image.add(amount);
        
        withdrawl= new JButton("Withdraw");
        withdrawl.setFont(new Font("raleway",Font.BOLD,17));
        withdrawl.addActionListener(this);
        withdrawl.setBounds(355, 365,140,30);
        image.add(withdrawl);
        
        back= new JButton("Back");
        back.setFont(new Font("raleway",Font.BOLD,17));
        back.setBounds(355, 410, 140, 30);
        back.addActionListener(this);
        image.add(back);
        

                
                
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl){
            String number= amount.getText();
            Date date= new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"please Enter The Amount You Want To Withdrawl");
                
            }else{
                try{
                Conn conn= new Conn();
            
           String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
           conn.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"RS"+number+"Withdrawl successfuly");
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
            }catch(HeadlessException | SQLException e){
                System.out.println(e);
            }
            
            }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            
            }
    }

    
    public static void main(String args[]) {
        new Withdrawl("");
    }
}

