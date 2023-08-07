package PROJECT;
import java.io.*;
import java.sql.*;
import java.util.*;
public class USER_INTERFACE {
	public static void main (String[] args) throws Exception {
		boolean f=true;
		Scanner sc=new Scanner(System.in);
		String url= "jdbc:mysql://localhost:3306/book"; 
    String username = "new1"; String password = "Sudeep@31";
    Class.forName(
        "com.mysql.cj.jdbc.Driver"); 
    Connection con = DriverManager.getConnection(
        url, username, password);
    	Statement st = con.createStatement();
    	String bN,bA;double bP;int id;
    	System.out.println("*********Welecome********* ");
		do {
			printMenu();
			int choice=sc.nextInt();
			switch(choice) {
			case 0:
				 System.out.println("Thank YOU");
				f=false;break;
			case 1:
				System.out.println("Enter book name:");
		        bN = sc.next();
		        
		        System.out.println("Enter book price:");
		        bP = sc.nextDouble();
		        
		        System.out.println("Enter book author:");
		        bA = sc.next();
		        insertin(bN,bP,bA,st);
		        break;
			case 2:
				viewBooks(con);
				System.out.println("Enter the id of book to update");
				 id=sc.nextInt();
				
				System.out.println("Enter new book name:");
		        bN = sc.next();
		        
		        System.out.println("Enter new book price:");
		        bP = sc.nextDouble();
		        
		        System.out.println("Enter new book author:");
		        bA = sc.next();
		        update(id,bN,bP,bA,st);break;
			case 3:
				viewBooks(con);
				System.out.println();
				System.out.println("Enter the id of book to be Deleted");
				id=sc.nextInt();
				delete(id,st);break;
			case 4:
				viewBooks(con);System.out.println();break;
		    default:
		    	System.out.println("INVALID INPUT TRY AGAIN");
		    	continue;
				
			}
		}while(f);
		con.close();
	}
	public static void printMenu() {
        System.out.println("Options");
        System.out.println("----------------------");
        System.out.println("1. Add a Book");
        System.out.println("2. Update a Book");
        System.out.println("3. Delete a Book");
        System.out.println("4. View Books");
        System.out.println("0. Exit");
        System.out.println("----------------------");}
	public static void insertin(String bn,double bp,String an,Statement st)throws Exception {
		String qr=String.format("INSERT INTO book.data (Name,price,Author) VALUES('%s',%s,'%s');",bn,bp,an);
		int m = st.executeUpdate(qr);
        if (m == 1){System.out.println("BOOK ADDED successfully : ");}
        else{System.out.println(" failed");}
	}
	public static void viewBooks(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM data";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            System.out.println("Books in the database:");
            System.out.println("========================");
            System.out.println();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String author = resultSet.getString("author");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Author: " + author);
            }}}
	public static void update(int id,String bn,double bp,String an,Statement st)throws Exception {
		String qr=String.format("UPDATE book.data SET Name='%s',price=%s,Author='%s' where id=%s;",bn,bp,an,id);
		int m = st.executeUpdate(qr);
        if (m == 1){System.out.println("Updated successfully : ");}
        else{System.out.println(" failed");}
	}
	public static void delete(int id,Statement st)throws Exception {
		String qr=String.format("DELETE FROM book.data where id=%s", id);
		int m = st.executeUpdate(qr);
        if (m == 1){System.out.println("Deleted successfully : ");}
        else{System.out.println(" failed");}
	}

}
