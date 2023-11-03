
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;


     public class SignupThree extends JFrame implements ActionListener{
         
         JRadioButton r1,r2,r3,r4;
         JCheckBox c1,c2,c3,c4,c5,c6,c7;
         JButton submit ,cancel;
         String fomeno;
        
         
         SignupThree(String fomeno){
             this.fomeno=fomeno;
             setLayout(null);
             
                JLabel l1=new JLabel("page 3: Account Detail");
                l1.setFont(new Font("Raleway",Font.BOLD,24));
                l1.setBounds(280, 40, 400, 40);
                add(l1);
                
                JLabel type=new JLabel("Account Yupes :");
                type.setFont(new Font("Raleway",Font.BOLD,22));
                type.setBounds(80, 110, 400, 30);
                add(type);
                
                r1= new JRadioButton("Saving Account");
                r1.setFont(new Font("Raleway",Font.BOLD,16));
                r1.setBounds(150, 155, 270, 30);
                r1.setBackground(Color.black);
                r1.setForeground(Color.WHITE);
                add(r1);
                
                 
                r2= new JRadioButton("Currnt Account");
                r2.setFont(new Font("Raleway",Font.BOLD,16));
                r2.setBounds(500, 155, 270, 30);
                r2.setBackground(Color.black);
                r2.setForeground(Color.WHITE);
                add(r2);
                
                 
                r3= new JRadioButton("Disxed Deposits Account");
                r3.setFont(new Font("Raleway",Font.BOLD,16));
                r3.setBounds(150, 205, 270, 30);
                r3.setBackground(Color.black);
                r3.setForeground(Color.WHITE);
                add(r3);
                
                 
                r4= new JRadioButton("Recurring Deposits Account");
                r4.setFont(new Font("Raleway",Font.BOLD, 16));
                r4.setBounds(500, 205, 270, 30);
                r4.setBackground(Color.black);
                r4.setForeground(Color.WHITE);
                add(r4);
                
                ButtonGroup Groupaccount = new ButtonGroup();
                Groupaccount.add(r1);
                Groupaccount.add(r2);
                Groupaccount.add(r3);
                Groupaccount.add(r4);
                
               JLabel card=new JLabel("Card Number :");
               card.setFont(new Font("Raleway",Font.BOLD,22));
               card.setBounds(80, 270, 400, 30);
               add(card);
               
                JLabel number= new JLabel("xxxx-xxxx-xxxx-1415");
                number.setBounds(300, 270, 400, 30);
                number.setFont(new Font("Raleway",Font.BOLD,18));           
                number.setForeground(Color.WHITE);
                number.setBackground(Color.black);
                add(number);
                
                JLabel carddetail= new JLabel("your 16 digits card number");
                carddetail.setBounds(300, 295, 400, 20);
                carddetail.setFont(new Font("Raleway",Font.BOLD,14));            
                carddetail.setForeground(Color.RED);

                add(carddetail);
                
                 
               JLabel pin=new JLabel("pin Number :");
               pin.setFont(new Font("Raleway",Font.BOLD,22));
               pin.setBounds(80, 340, 400, 30);
               add(pin);
               
                JLabel pnumber= new JLabel("xxxx");
                pnumber.setBounds(300, 340, 400, 30);
                pnumber.setFont(new Font("Raleway",Font.BOLD,18));              
                pnumber.setForeground(Color.WHITE);
                pnumber.setBackground(Color.black);
                add(pnumber);
                
                JLabel pindetail= new JLabel("your 4 digits pin number");
                pindetail.setBounds(300, 365, 400, 20);
                pindetail.setFont(new Font("Raleway",Font.BOLD,14));              
                pindetail.setForeground(Color.RED);
                add(pindetail);

                
                JLabel srvices= new JLabel("service provider");
                srvices.setBounds(80, 400, 400, 30);
                srvices.setFont(new Font("Raleway",Font.BOLD,22));
                add(srvices);
                
                c1=new JCheckBox("ATM Card");
                c1.setBounds(200, 450, 200, 30);
                c1.setFont(new Font("Raleway",Font.BOLD,14));
                add(c1);
                
                c2=new JCheckBox("Mobile Banking");
                c2.setBounds(450, 450, 200, 30);
                c2.setFont(new Font("Raleway",Font.BOLD,14));
                add(c2);
                
                c3=new JCheckBox("Internet Banking");
                c3.setBounds(200, 490, 200, 30);
                c3.setFont(new Font("Raleway",Font.BOLD,14));
                add(c3);
                
                c4=new JCheckBox("Email & SMS Alerts");
                c4.setBounds(450, 490, 200, 30);
                c4.setFont(new Font("Raleway",Font.BOLD,14));
                add(c4);
                
                c5=new JCheckBox("Check books");
                c5.setBounds(200, 530, 200, 30);
                c5.setFont(new Font("Raleway",Font.BOLD,14));
                add(c5);
                
                c6=new JCheckBox("E-Statement");
                c6.setBounds(450, 530, 200, 30);
                c6.setFont(new Font("Raleway",Font.BOLD,14));
                add(c6);
                
                c7=new JCheckBox("I hereby declares that the above entered details are correct to the best od my konwlage");
                c7.setBounds(200, 570, 600, 30);
                c7.setFont(new Font("Raleway",Font.BOLD,12));
                
                add(c7);
                
                
                submit= new JButton("Submit");
                submit.setBounds(290, 620, 100, 30);
                submit.setBackground(Color.GREEN);
                submit.setForeground(Color.BLACK);
                submit.setFont(new Font("Raleway",Font.BOLD,18));
                submit.addActionListener(this);
                add(submit);
                
                cancel= new JButton("Cancel");
                cancel.setBounds(430, 620, 100, 30);
                cancel.setBackground(Color.GREEN);
                cancel.setForeground(Color.BLACK);
                cancel.setFont(new Font("Raleway",Font.BOLD,18));
                cancel.addActionListener(this);

                add(cancel);
                       
                
               


            
            
                getContentPane().setBackground(Color.cyan);
                setSize(850,800);
                setLocation(350,10);
                setVisible(true);

         }
         
         public void actionPerformed(ActionEvent ae){
             if(ae.getSource()==submit){
                 String accountType=null;
                 if(r1.isSelected()){
                     accountType="Saving Account";
                 }else if(r2.isSelected()){
                     accountType="Corrunt Account";
                 }else if(r3.isSelected()){
                     accountType="Disxed Deposits Account";
                 }else if(r4.isSelected()){
                     accountType="Recurring Deposits Account";
                 }
                 
                 Random random=new Random();
                 String cardnumber= ""+Math.abs((random.nextLong()  %90000000))+50409360L;
                 
                String pinnumber= "" + Math.abs((random.nextLong() % 90L))+ 100L;
                
                String facility="";
                if(c1.isSelected()){
                    facility= facility + " ATM Card";

                    }else if(c2.isSelected()){
                        facility= facility + " Internet Banking";
               
                    }else if(c3.isSelected()){
                        facility= facility + " mobile Banking";
                    
                    }else if(c4.isSelected()){
                        facility= facility + " Email & SMS Alerts";
                    
                    }else if(c5.isSelected()){
                        facility= facility + " Check books";
                    
                    }else if(c6.isSelected()){
                        facility= facility + " E-Statemen";
                    
                    }else if(c7.isSelected()){
                    facility= facility + " I hereby declares that the above entered details are correct to the best od my konwlage";


                }
                try{
                   if(accountType.equals("")){
                       JOptionPane.showMessageDialog(null,"Acoount type is Requred");
                   } else{
                       Conn conn=new Conn();
                       String query1="insert into signupThree values('"+fomeno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                       String query2="insert into login values('"+fomeno+"','"+cardnumber+"','"+pinnumber+"')";

                       conn.s.executeUpdate(query1);
                       conn.s.executeUpdate(query2);

                       
                       JOptionPane.showMessageDialog(null,"card number"+cardnumber+"\n pin:"+pinnumber);
                       
                       setVisible(false);
                       new Deposit(pinnumber).setVisible(false);
                   }
                    
                }catch(HeadlessException | SQLException e){
                    System.out.println(e);
                }
               
                 
                    }    
             else if (ae.getSource()==cancel){
                 new Login().setVisible(true);
                 
             }
         }

    
    public static void main(String args[]) {
        new SignupThree("");
    }
}
