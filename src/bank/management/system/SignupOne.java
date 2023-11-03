
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addTextField,cityTextField,pincodeTextField,stateTextField;
    JButton next;
    JRadioButton male,female,other,marride,Unmarride,Other;
    JDateChooser dateChooser ;
    SignupOne()
    {
        
        setLayout(null);
        
        Random ran = new Random();
        random=Math.abs((ran.nextLong()% 9000L)+1000L);
        
        JLabel formno = new JLabel("APLICATION FORM NO.."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(100,20,800,30);
         
        add(formno);
        

        JLabel PersonalDetails = new JLabel("page 1: Personal Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,40);
        add(PersonalDetails);
 //name row...       
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
         
        add(name);
        
       
        nameTextField= new JTextField();
        nameTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
          
        add(nameTextField);
        
//father name:         
        JLabel fname = new JLabel("Father Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
       

        add(fname);
        
        fnameTextField= new JTextField();
        fnameTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
      
        add(fnameTextField);
        
//Date Of birth        
        JLabel dob = new JLabel("Date Of birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBackground(Color.GRAY);
        dateChooser.setForeground(Color.WHITE);

   
        add(dateChooser);
        
 //gender       
        JLabel gender = new JLabel("gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
             male= new JRadioButton("Male");
             male.setBounds(300,290,90,30);
             male.setBackground(Color. PINK);
             add(male);
             
            female= new JRadioButton("Female");
            female.setBounds(430,290,90,30);
            female.setBackground(Color.PINK);
            add(female);
            
            other= new JRadioButton("Other");
            other.setBounds(560,290,90,30);
            other.setBackground(Color.PINK);
            add(other);
            
            ButtonGroup genderGroup =new ButtonGroup();
            genderGroup.add(male);
            genderGroup.add(female);
            genderGroup.add(other);
 //email      
        JLabel email = new JLabel("email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        
        emailTextField= new JTextField();
        emailTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
       
       
        add(emailTextField);
        
//Marital
        JLabel marital = new JLabel("Marital :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
             marride= new JRadioButton("Marride");
             marride.setBounds(300,390,80,30);
             marride.setBackground(Color. WHITE);
             marride.setBackground(Color.PINK);

             add(marride);
             
            Unmarride= new JRadioButton("Unmarride");
            Unmarride.setBounds(430,390,90,30);
            Unmarride.setBackground(Color.WHITE);
             Unmarride.setBackground(Color.PINK);

            add(Unmarride);
            
            Other= new JRadioButton("Other");
            Other.setBounds(560,390,90,30);
            Other.setBackground(Color.WHITE);
            Other.setBackground(Color.PINK);

            add(Other);
            
            ButtonGroup Marital =new ButtonGroup();
            Marital.add(marride);
            Marital.add(Unmarride);
            Marital.add(Other);
        
     
 //address       
        JLabel add = new JLabel("address :");
        add.setFont(new Font("Raleway",Font.BOLD,20));
        add.setBounds(100,440,200,30);
        add(add);
                
        addTextField= new JTextField();
        addTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        addTextField.setBounds(300,440,400,30);
        
        add(addTextField);
        
 //city:       
        JLabel city = new JLabel("city :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField= new JTextField();
        cityTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
       
        add(cityTextField);
        
//state:
        JLabel state = new JLabel("state :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        
        add(state);
        
        stateTextField= new JTextField();
        stateTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
         
        add(stateTextField);
        
        
//pincode
        JLabel pincode = new JLabel("pincode :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField= new JTextField();
        pincodeTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
       
        add(pincodeTextField);
       
  //Next button      
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD ,14));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);
                
        
        
        
        getContentPane().setBackground(Color.cyan);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
      
}
   
    @Override
    public void actionPerformed(ActionEvent ae)
    {
         String formno=""+ random;//long
         String name= nameTextField.getText();
         String fname=fnameTextField.getText();
         String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         
         String gender= null;
         if(male.isSelected()){
             gender="Male";
         }else if(female.isSelected()){
                 gender="female";
          }
                 else if(other.isSelected())
                 gender="other";
          
        
        String email=emailTextField.getText();
        
        
        String marital= null;
         if(marride.isSelected()){
             marital="Male";
         }else if(Unmarride.isSelected()){
                 marital="female";
         }else if(Other.isSelected())
                 marital="Other";
         
         String add=cityTextField.getText();
         String city=cityTextField.getText();
         String state=stateTextField.getText();
         String pincode=pincodeTextField.getText();
         
         try
         {
             if(name.equals(""))
             {
                 JOptionPane.showMessageDialog(null,"Name is Requred");
             }
             else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date Of Brithday  Is Requred");
             }
             else if((male.isSelected()==false)&&(female.isSelected()==false)&&(other.isSelected()==false)){
                    JOptionPane.showMessageDialog(null,"gender is Requred");

             }
             else if(email.equals("")){
                JOptionPane.showMessageDialog(null,"Date Of Brithday  Is Requred");
             }
                else if(email.equals("")){
                JOptionPane.showMessageDialog(null,"Email Is Requred");
             }
             
                     
               
             else{
                 Conn c =new Conn();
                 String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+add+"','"+city+"','"+pincode+"','"+state+"')";
                          c.s.executeUpdate(query);
                          
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
                
             }
         }
         catch(HeadlessException | SQLException e){
             System.out.println(e);
         }


    }
         
 public static void main(String args[]) {
        SignupOne signupOne = new SignupOne();
 }
}