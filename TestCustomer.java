package Com.lab;

import java.sql.SQLException;
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) throws SQLException {
			Customer c = new Customer();
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
				System.out.println("1. Insert \n 2. Update \n 3. Select \n 4. Delete \n 5. Exit");
				System.out.println("Enter any number from 1 - 5");
				choice = sc.nextInt();
				System.out.println("-------------------------------");
				
				switch(choice) {
				case 1 :
					c.saveCustomer();
					break;
				case 2 :
					c.updateCustomer();
					break;
				case 3 :
					c.fetchCustomer();
					break;
				case 4 :
					c.deleteCustomer();
					break;
				}
			}
			while(choice!=5);

		}

	
	}


