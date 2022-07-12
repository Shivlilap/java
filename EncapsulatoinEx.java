package Com;

import java.util.Scanner;
public class EncapsulatoinEx {

	public static void main(String[] args) {
	
		Student s = new Student(); 
		//s.SetId(101); //putting values using set()
		//s.SetsName("Mamta");
		//s.SetsEmail("mamta@gmail.com");
		//s.SetsPhone(98765432);
		
		//Scanner class to take value from user 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Id");
		int id= sc.nextInt();
	    s.setId(id);
		
		System.out.println("Enter Name");
		String n= sc.next();
		s.setsName(n);
	
		System.out.println("Enter Phone");
		long ph= sc.nextLong();
		s.setsPhone(ph);
		
		System.out.println("Enter email");
		String e= sc.next();
		s.setsEmail(e);
		
		System.out.println("--------Student Details-------");
		
		System.out.println("Id is :" + s.getId());  //fetch value using get()
		System.out.println("Name is :" + s.getsName());
		System.out.println("Phone is :" + s.getsPhone());
		System.out.println("Email is :" + s.getsEmail());
		
		
	}
		
		

	}


