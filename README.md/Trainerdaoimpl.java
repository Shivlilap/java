package com.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.onetomany.config.Hibernateutil;
import com.onetomany.dao.Trainerdao;
import com.onetomany.entity.Student;
import com.onetomany.entity.Trainer;

public class Trainerdaoimpl implements Trainerdao {

	@Override
	public void addTrainer() {
		// TODO Auto-generated method stub
		
		Session s = Hibernateutil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		
		Trainer tt = new Trainer();
		tt.setTname("Preeti");
		tt.setCname("DotNet");
		tt.setDesignation("Faculty");
		
		Student ss3 = new Student();
		ss3.setAid(104);
		ss3.setName("Aditya");
		ss3.setEmail("adi@gmail.com");
		ss3.setPhone(776543211);
	
		
		Student ss4 = new Student();
		ss4.setAid(105);
		ss4.setName("Sachin");
		ss4.setEmail("sa@gmail.com");
		ss4.setPhone(676503211);
ArrayList<Student> al = new ArrayList<Student>();
		al.add(ss3);
		al.add(ss4);
		
		tt.setStudent(al); //set students data with trainer object
		
		s.save(tt);
		t.commit();
		s.close();
	}

	@Override
	public void fetchTrainer() {
		// TODO Auto-generated method stub
		
		Session s = Hibernateutil.getSessionFactory().openSession();
		Query<Trainer> q= s.createQuery("from Trainer");
		List<Trainer> ll= q.getResultList();
		
		Iterator<Trainer> itr = ll.iterator();
		while(itr.hasNext()) {
			Trainer ta = itr.next();
			System.out.println(ta.getTname() + " " + ta.getCname());
			
			List<Student> all = ta.getStudent();
			Iterator<Student> itr2 = all.iterator();
			while(itr2.hasNext()) {
				Student stu = itr2.next();
				System.out.println(stu.getName() + " "
						+stu.getPhone() + " " + stu.getEmail());
			}
			
		}
		s.close();
	}

}
