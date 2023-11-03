
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;


public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField panTextField, adharTextField;
    JButton next;
    JRadioButton sno,syes,eyes,eno;
    JComboBox category,religen,income,educational,Occupation;
    String formno;
    SignupTwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW APPLIATION FORM-PAGE NO 2");
        
       
        JLabel  addionalDetails = new JLabel("page 2: Addional Details");
        addionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        addionalDetails.setBounds(290,80,200,40);
        add(addionalDetails);
 // Religen...       
        JLabel Religen = new JLabel("Religen :");
        Religen.setFont(new Font("Raleway",Font.BOLD,20));
        Religen.setBounds(100,140,100,30);
        add(Religen);
        
        
        String valreligen[]={"Select The Religen","HIndu","Muslim","shikh","christian","Other"};
        religen= new JComboBox(valreligen);
        religen.setFont(new Font("Ralweway",Font.BOLD,14));
        religen.setBounds(300,140,400,30);
        religen.setBackground(Color.BLACK);
        religen.setForeground(Color.WHITE);
        add(religen);
       
      
//Category :  
        
        JLabel Category = new JLabel("Category :");
        Category.setFont(new Font("Raleway",Font.BOLD,20));
        Category.setBounds(100,190,200,30);
        add(Category);
        
        String valcategory[]={"Select The Category","Geneal","OBC","SBC","SC","NT","VJNT","Other"};
        category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.BLACK);
        category.setForeground(Color.WHITE);
        add(category);
        
        
      
        
//INCOME        
        JLabel Income  = new JLabel("Income :");
        Income .setFont(new Font("Raleway",Font.BOLD,20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
        String valincome[]={"Select The Income","null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000"};
        income=new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.BLACK);
        income.setForeground(Color.WHITE);
        add(income);
       
 //Educational&Qulefication       
        JLabel Educational = new JLabel("Educational");
        Educational.setFont(new Font("Raleway",Font.BOLD,20));
        Educational.setBounds(100,290,200,30);
        add(Educational);
             
        JLabel Qulefication = new JLabel("Qulefication:");
        Qulefication.setFont(new Font("Raleway",Font.BOLD,20));
        Qulefication.setBounds(100,315,200,30);
        add(Qulefication);
        
        String valeducational[]={"Select The Education","NOn Graduation","Graduate","Post Graduate"};
        educational=new JComboBox(valeducational);
        educational.setBounds(300,315,400,30);
        educational.setBackground(Color.BLACK);
        educational.setForeground(Color.WHITE);
        add(educational);
        
        
       
//Occupation
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,385,200,30);
        add(marital);
        
        String valOccupation[]={"Select The Occupation","Salaried","Self-Employed","Bussiness ","Student","Retayrd","Other"};
        Occupation=new JComboBox(valOccupation);
        Occupation.setBounds(300,385,400,30);
        Occupation.setBackground(Color.BLACK);
        Occupation.setForeground(Color.WHITE);
        add(Occupation);
        
     
 //address              
        JLabel Pan = new JLabel("Pan Nomber :");
        Pan.setFont(new Font("Raleway",Font.BOLD,20));
        Pan.setBounds(100,440,200,30);
        add(Pan);
        
        panTextField= new JTextField();
        panTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        panTextField.setBackground(Color.BLACK);
        panTextField.setForeground(Color.WHITE);
        add(panTextField);
                
       
 //Adhar nomber:       
        JLabel Adhar = new JLabel("Adhar nomber :");
        Adhar.setFont(new Font("Raleway",Font.BOLD,20));
        Adhar.setBounds(100,490,200,30);
        add(Adhar);
        
        adharTextField=new JTextField();
        adharTextField.setFont(new Font("Ralweway",Font.BOLD,14));
        adharTextField.setBounds(300,490,400,30);
        adharTextField.setBackground(Color.BLACK);
        adharTextField.setForeground(Color.WHITE);
        add(adharTextField);
        
       
        
//Senior Cityzen:
        JLabel Cityzen = new JLabel("Senior Cityzen :");
        Cityzen.setFont(new Font("Raleway",Font.BOLD,20));
        Cityzen.setBounds(100,540,200,30);
        add(Cityzen);
        
             syes= new JRadioButton("yes");
             syes.setBounds(300,540,90,30);
            syes.setBackground(Color.BLACK);
            syes.setForeground(Color.WHITE);             
            add(syes);
             
            sno= new JRadioButton("No");
            sno.setBounds(500,540,90,30);
            sno.setBackground(Color.BLACK);
            sno.setForeground(Color.WHITE);      
            add(sno);
   
            
            ButtonGroup Cityzen1 =new ButtonGroup();
            Cityzen1.add(syes);
            Cityzen1.add(sno);
        
        
//existing Account 
        JLabel ExistingAccoun = new JLabel(" Existing Account :");
        ExistingAccoun.setFont(new Font("Raleway",Font.BOLD,20));
        ExistingAccoun.setBounds(90,595,200,30);
        add(ExistingAccoun);
        
             eyes= new JRadioButton("yes");
             eyes.setBounds(300,590,90,30);
             eyes.setBackground(Color.BLACK);
             eyes.setForeground(Color.WHITE);    
             add(eyes);
             
            eno= new JRadioButton("No");
            eno.setBounds(500,590,90,30);
            eno.setBackground(Color.BLACK);
            eno.setForeground(Color.WHITE);    
            add(eno);
   
            
            ButtonGroup ExistingAccount1 =new ButtonGroup();
            ExistingAccount1.add(eyes);
            ExistingAccount1.add(eno);
        
        
       
  //Next button      
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD ,14));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);
                
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
      
}
   
    @Override
    public void actionPerformed(ActionEvent ae)
    {
       
         
         String sreligin=(String) religen.getSelectedItem();
         String scategory=(String) category.getSelectedItem();
         String sincome=(String) income.getSelectedItem();
         String sOccupation=(String) Occupation.getSelectedItem();
         String seducational=(String) educational.getSelectedItem();

        String Cityzen1= null;
         if(syes.isSelected()){
             Cityzen1="Yes";
         }else if(sno.isSelected()){
                 Cityzen1="No";
        
         } 
        
        
        
        String ExistingAccount1= null;
         if(eyes.isSelected()){
             ExistingAccount1="Yes";
         }else if(eno.isSelected()){
                 ExistingAccount1="No";
         }
         
         String span=panTextField.getText();
         String sadhar=adharTextField.getText();
        
         
         try{
                 

             
             
         
            Conn c =new Conn();
            String query="insert into signupTwo values('"+formno+"','"+sreligin+"','"+scategory+"','"+sincome+"','"+seducational+"','"+sOccupation+"','"+span+"','"+sadhar+"','"+Cityzen1+"','"+ExistingAccount1+"')";
                c.s.executeUpdate(query);
             
         //signupthree object
         setVisible(false);
         new SignupThree(formno).setVisible(true);

         }catch(SQLException e){
             System.out.println(e);
         }
    

}
         
 public static void main(String args[]) {
        SignupTwo signupTwo = new SignupTwo(" ");
 }
}


