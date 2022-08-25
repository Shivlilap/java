package Com.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customer {
	
	int cust_id;
	String fname, lname;
	
	Scanner s = new Scanner(System.in);
	
	
	// saving an customer
	public void saveCustomer() throws SQLException {
		System.out.println("Enter id");
		cust_id = s.nextInt();
		System.out.println("Enter first name");
		fname = s.next();
		System.out.println("Enter last name");
		lname = s.next();
		
		Connection con = Helpher.conn();
		PreparedStatement st = con.prepareStatement("insert into customer values(?,?,?)");
		st.setInt(1, cust_id);
		st.setString(2, fname);
		st.setString(3, lname);
		st.executeUpdate();

	}
	
	//fetch an customer
	public void fetchCustomer() throws SQLException {
		Connection con = Helpher.conn();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from customer");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " "+ rs.getString(2)+ " "+ rs.getString(3));
		}
	}
	
	//update an customer details 
	public void updateCustomer() throws SQLException{
		Connection con = Helpher.conn();
		Statement st = con.createStatement();
		System.out.println("Enter id");
		cust_id = s.nextInt();
		System.out.println("Enter last name");
		lname = s.next();
		st.executeUpdate("update customer set lname= '"+lname+"' " + "where cust_id = " +cust_id);
		
	}
	
	//delete an customer details
	public void deleteCustomer() throws SQLException{
		Connection con = Helpher.conn();
		Statement st = con.createStatement();
		System.out.println("Enter id");
		cust_id = s.nextInt();
		st.executeUpdate("delete from customer where cust_id = " + cust_id);
	}
}