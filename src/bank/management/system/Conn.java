
package bank.management.system;

import java.sql.*;

public class Conn {
    Statement s;
    Connection c;
    public Conn(){
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///bank","root","Charu@#*123");
            s=c.createStatement();
}catch(SQLException e){
            System.out.println(e);
        }
    }
}
