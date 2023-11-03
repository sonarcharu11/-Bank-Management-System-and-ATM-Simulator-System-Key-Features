package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.ResultSet;




public class BalenceEnquiry extends JFrame implements ActionListener {
    
    JButton back;
    String pinnumber;
    
    
    BalenceEnquiry(String pinnumber){
        this.pinnumber =  pinnumber;
        
        setLayout(null);
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
                Image i2=i1.getImage().getScaledInstance(900, 740,Image.SCALE_DEFAULT);
                ImageIcon i3= new ImageIcon(i2);
                JLabel image= new JLabel(i3);
                image.setBounds(0, 0, 900, 740);
                add(image);
                
                
                back=new JButton("BACK");
                back.setBounds(380,410,100,30);
                back.setFont(new Font("System",Font.BOLD,15));
                back.addActionListener(this);
                image.add(back);
                
                 Conn c=new Conn();
                   int balence=0;
                    try {
                        //get balence of user
                           ResultSet rs =c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                         
                           while(rs.next()){
                              if(rs.getString("type").equals("Deposit")){
                                balence+=Integer.parseInt( rs.getString("amount"));
                              }else{
                                balence-= Integer.parseInt( rs.getString("amount"));
                              }
                           }
                    }catch(NumberFormatException | SQLException ae){
                        System.out.println(ae);
                    }
                    
                    JLabel text=new JLabel("    your Account Balence Is RS="+balence);
                    text.setForeground(Color.white);
                    text.setBounds(220, 250, 300, 30);
                    text.setFont(new Font("System",Font.BOLD,15));

                    image.add(text);
                 
        
        
        setSize(900,740);
        setLocation(300,0);
        setVisible(true);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }

   
    public static void main(String args[]) {
        BalenceEnquiry balenceEnquiry = new BalenceEnquiry("");
    }
}
