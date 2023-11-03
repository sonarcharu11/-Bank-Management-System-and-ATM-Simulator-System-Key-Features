
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

import java.sql.ResultSet;


public class Fastcash extends JFrame implements ActionListener{

    JButton deposit,withdrawl,fast,statement,pinchange,enquiry,back;
    String pinnumber;
      
    
    Fastcash(String pinnumber){
        this.pinnumber=pinnumber;
      
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 740);
        
        add(image);
        
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(225,230,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text);
        
        deposit= new JButton("RS 100");
        deposit.setBounds(160,340,130,22);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl= new JButton("RS 500");
         withdrawl.setBounds(380,340,130,22);
         withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fast = new JButton("RS 1000");
        fast.setBounds(160,370,130,22);
         fast.addActionListener(this);
        image.add(fast);
        
        
        statement= new JButton("2000");
        statement.setBounds(380,370,130,22);
        statement.addActionListener(this);
        image.add(statement);
        
         pinchange= new JButton("5000");
         pinchange.setBounds(160,400,130,22);
         pinchange.addActionListener(this);
        image.add(pinchange);
        
        
        enquiry= new JButton("10000");
        enquiry.setBounds(380,400,130,22);
        enquiry.addActionListener(this);
        image.add(enquiry);
        
        back= new JButton("BACK");
        back.setBounds(380,430,130,22);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setSize(900,800);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
       
        
        
    }
     public void actionPerformed(ActionEvent e){
       
         if(e.getSource()==back){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
         }
         else  {
             String amount = ((JButton)e.getSource()).getText().substring(3);
             Conn c=new Conn();
             try {
                 //get balence of user
                    ResultSet rs =c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                    int balence=0;
                    while(rs.next()){
                       if(rs.getString("type").equals("Deposit")){
                         balence+=Integer.parseInt( rs.getString("amount"));
                       }else{
                         balence-= Integer.parseInt( rs.getString("amount"));
                       }
                    }
                    if(e.getSource()!=back && balence< Integer.parseInt(amount)){
                      JOptionPane.showMessageDialog(null, "Insufficient Balence");
                      return;
                    }
                    Date date=new Date();
                    String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "RS " +amount+ "Debited Sucessfully");
                 
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
            }          
             catch(HeadlessException | NumberFormatException | SQLException ea){
                        System.out.println(ea);
             }
        }
  
    }
   
    public static void main(String args[]) {
       new Fastcash("");
    }
}
