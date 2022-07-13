package com.selenium;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeleniumDatabaseTesting {

	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	static final String USER = "sneha";
	static final String PASS = "root";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, "root", "root");
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name from Employee";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				
				System.out.println("Id: " +id);
				System.out.println("Name: " +name);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2) {
			}
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}
}
