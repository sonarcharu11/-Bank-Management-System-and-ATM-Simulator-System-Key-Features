
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;



public class Pinchange extends JFrame implements ActionListener{
    
       JPasswordField pin,repin;
       JButton change,back;
       String pinnumber;
      
    Pinchange(String pinnumber){
        
                this.pinnumber=pinnumber;
                setLayout(null);
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
                Image i2=i1.getImage().getScaledInstance(900, 740,Image.SCALE_DEFAULT);
                ImageIcon i3= new ImageIcon(i2);
                JLabel image= new JLabel(i3);
                image.setBounds(0, 0, 900, 740);
                add(image);
                
                JLabel text= new JLabel("CHANGE YOUR PIN");
                text.setForeground(Color.white);
                text.setFont(new Font("System",Font.BOLD, 16));
                text.setBounds(260, 240, 500, 35);
                image.add(text);
                
                
                JLabel pintext= new JLabel("NEW PIN");
                pintext.setForeground(Color.white);
                pintext.setFont(new Font("System",Font.BOLD, 14));
                pintext.setBounds(180, 300, 180, 18);
                image.add(pintext);  
                
                pin=new JPasswordField();
                pin.setFont(new Font("Raleway",Font.BOLD, 14));
                pin.setBounds(310,300,180,18);
                pin.setBackground(Color.white);
                pin.setForeground(Color.BLACK);
                image.add(pin);
                
                
                JLabel repintext= new JLabel("RE-ENTER PIN");
                repintext.setForeground(Color.white);
                repintext.setFont(new Font("System",Font.BOLD, 14));
                repintext.setBounds(180, 340, 180, 18);
                image.add(repintext); 
                
                  
                repin=new JPasswordField();
                repin.setFont(new Font("Raleway",Font.BOLD, 14));
                repin.setBounds(310,340,180,18);
                repin.setBackground(Color.white);
                repin.setForeground(Color.BLACK);
                image.add(repin);
                
                change= new JButton("CHANGE");
                change.setBounds(210,390,100,30);
                change.addActionListener(this);
                image.add(change);
                
                back= new JButton("BACK");
                back.setBounds(370,390,100,30);
                back.addActionListener(this);
                image.add(back);
                
                
                
                
                
                setSize(900,740);
                setLocation(300,0);
                setUndecorated(true);
                setVisible(true);

        
    }
    
       @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            try{
                String npin= pin.getText();
                String rpin= repin.getText();

                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"ENTER PIN DOSE NOT MATCH");
                    return;
                }
                
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null,"PLEASE ENTER A PIN");
                    return;
                }
                
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"PLEASE ENTER RE-ENTER PIN");
                    return;
                }
                
                Conn conn= new Conn();
                String query1="update bank set pin='"+rpin+"'where pin='"+pinnumber+"'";
                String query2="update login set pin='"+rpin+"'where pin='"+pinnumber+"'";
                String query3="update SignupThree set pin='"+rpin+"'where pin='"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"CHANGE YOUR PIN SUCCESSFULLY");

                setVisible(false);
                new Transactions(rpin).setVisible(true);
                


            
            }catch(HeadlessException | SQLException e){
            System.out.println(e);
            }
        }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
  
    public static void main(String args[]) {
        new Pinchange(" ").setVisible(true);
    }
}
