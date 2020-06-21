package koo.dev.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import koo.dev.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//create sessionfactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
			
		
		
		//create a session
		
		Session session = factory.getCurrentSession();
		
		// now need to use the session to save a java object
		
		try {
			
					
			
			//create a student 
			
			System.out.println("Creating new student object.");
			Student tempStudent = new Student("Koo", "Dev", "koo.dev@gmail.com");
			
			
			//start the transaction
			
			session.getTransaction();
			
			//save the student object
			System.out.println("Saving the student.");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		
	finally {
		factory.close();
			}		

	}

}
