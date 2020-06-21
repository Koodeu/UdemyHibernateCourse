package koo.dev.jdbc;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		
		try {
			
			System.out.println("Connecting to database: " + jdbcUrl);
			java.sql.Connection myConn =  DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connection successful!");

		}

		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
