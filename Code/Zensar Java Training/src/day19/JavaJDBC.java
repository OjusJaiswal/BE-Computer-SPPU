package day19;

import java.sql.*;

public class JavaJDBC {
	
	void connect() {
		try {
			System.out.println("Creating Connection :=\n");
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
	    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
	    	Statement s = con.createStatement();
	    	System.out.println("Connected successfully");
	    	s.close();
	        con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}    	
	}
	
	void createTable() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
	    	Class.forName(driver);
	    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
	    	Statement s = con.createStatement();
			System.out.println("\nCreating Table :=\n");
			s.executeQuery("create table ZensarJavaTraining(id number, name varchar(20), grade varchar(5))");
			System.out.println("Table created successfully");
			s.close();
	        con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}    	
	}
	
	void inputData() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
	    	Class.forName(driver);
	    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
	    	Statement s = con.createStatement();
			System.out.println("\nInserting Records :=\n");
			s.executeQuery("insert into ZensarJavaTraining values (101, 'ABC', 'A+')");
			s.executeQuery("insert into ZensarJavaTraining values (102, 'DEF', 'B')");
			s.executeQuery("insert into ZensarJavaTraining values (103, 'GHI', 'A')");
			System.out.println("Records inserted successfully");
			s.close();
	        con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	void fetchData() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
	    	Class.forName(driver);
	    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
	    	Statement s = con.createStatement();
			System.out.println("\nFetching Records :=\n");
			int i = 1;
			ResultSet rs = s.executeQuery("select * from ZensarJavaTraining");
			while(rs.next()) {
				System.out.println("Record No. "+i+" :- ");
				System.out.println("ID : "+rs.getInt("id"));
				System.out.println("Name : "+rs.getString("name"));
				System.out.println("Grade : "+rs.getString("grade"));
				System.out.println();
				i++;
			}
			System.out.println("Data fetched successfully");
			rs.close();
	        s.close();
	        con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	void updateData() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
			Statement s = con.createStatement();
			System.out.println("\nUpdating Record :=\n");
			s.executeQuery("update ZensarJavaTraining set grade = 'C' where id =103");
			System.out.println("Records updated successfully");
	        s.close();
	        con.close();
			fetchData();
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	void deleteData() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "paramojus");
			Statement s = con.createStatement();
			System.out.println("\nDeleting Record :=\n");
			s.executeQuery("delete from ZensarJavaTraining where id =103");
			System.out.println("Records Deleted successfully");
			s.close();
		    con.close();
			fetchData();
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	void closeConnection() {
		try {
			System.out.println("\nClosing Connection :=\n");
	        System.out.println("Connection closed successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JavaJDBC obj = new JavaJDBC();
		obj.connect();
		obj.createTable();
		obj.inputData();
		obj.fetchData();
		obj.updateData();
		obj.deleteData();
		obj.closeConnection();
	}
}
