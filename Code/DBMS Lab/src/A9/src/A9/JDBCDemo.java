package A9;

import  java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            	String driver="oracle.jdbc.driver.OracleDriver";
            	Class.forName(driver);
            	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","paramojus");
            	Statement s=con.createStatement();//creating the statement
            	System.out.println("Connected successfully");
            	ResultSet rs=s.executeQuery("create table AddMember (id int, name varchar(15), age int)");
            	ResultSet rs1=s.executeQuery("insert into AddMember values(1, 'Rohan', 20)");
            	ResultSet rs2=s.executeQuery("insert into AddMember values(2, 'Sunita', 21)");
            	ResultSet rs3=s.executeQuery("insert into AddMember values(3, 'Sushma', 16)");
            	ResultSet rs4=s.executeQuery("insert into AddMember values(4, 'Riya', 19)");
            	ResultSet rs5=s.executeQuery("select * from AddMember");
            	while (rs5.next()){
                	System.out.println(rs5.getString("name"));
            	}    
                rs.close();
                s.close();
                con.close();
        } catch (Exception ex) {
        	System.out.println("Error:"+ex);
        }
    
    }
    
}
