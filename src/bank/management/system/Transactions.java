
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{

    JButton deposit,withdrawl,fast,statement,pinchange,enquiry,exit;
    String pinnumber;
      
    
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
      
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 740);
        
        add(image);
        
        JLabel text=new JLabel("please selesct your transaction");
        text.setBounds(225,230,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text);
        
        deposit= new JButton("Deposit");
        deposit.setBounds(160,340,130,22);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl= new JButton("Cash withdrawl");
         withdrawl.setBounds(380,340,130,22);
         withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fast = new JButton("Fast cash");
        fast.setBounds(160,370,130,22);
         fast.addActionListener(this);
        image.add(fast);
        
        
        statement= new JButton("Mini Statement");
        statement.setBounds(380,370,130,22);
        statement.addActionListener(this);
        image.add(statement);
        
         pinchange= new JButton("Pin Change");
         pinchange.setBounds(160,400,130,22);
         pinchange.addActionListener(this);
        image.add(pinchange);
        
        
        enquiry= new JButton("Balance enquiry");
        enquiry.setBounds(380,400,130,22);
        enquiry.addActionListener(this);
        image.add(enquiry);
        
        exit= new JButton("Exit");
        exit.setBounds(380,430,130,22);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        setSize(900,800);
        setLocation(230,0);
        setUndecorated(true);
        setVisible(true);
       
        
        
    }
     public void actionPerformed(ActionEvent e){
       
         if(e.getSource()==exit){
           
           System.exit(0);
       }else if (e.getSource()==deposit){
           setVisible(false);
           new Deposit(pinnumber).setVisible(true);
       }else if(e.getSource()==withdrawl){
         setVisible(false);
         new Withdrawl(pinnumber).setVisible(true);
       }else if (e.getSource()==fast){
           setVisible(false);
           new Fastcash(pinnumber).setVisible(true);
      
       }else if(e.getSource()==pinchange){
           setVisible(false);
           new Pinchange(pinnumber).setVisible(true);
       }else if (e.getSource()==enquiry){
           setVisible(false);
           new BalenceEnquiry(pinnumber).setVisible(true);
           
       }else if (e.getSource()==statement){
           setVisible(false);
         new MiniStatement(pinnumber).setVisible(true);
       }    
       
        
    }
   
    public static void main(String args[]) {
        Transactions transactions = new Transactions("");
    }
}
