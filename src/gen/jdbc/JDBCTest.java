package gen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
	//step 1
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	
	//step 2
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genpact","root", "1234");
	System.out.println("Connected...");
	
	//step 3
	Statement stm = con.createStatement();
	
	//step 4
	ResultSet rs = stm.executeQuery("select * from paintings");
	
		System.out.println("Details of Paintings table ");
		System.out.println("################################");
		while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+"    "+rs.getInt(3)+"  "+rs.getInt(4));
		
	}
	con.close();
	}
	catch(Exception e) {

	}

}
}
