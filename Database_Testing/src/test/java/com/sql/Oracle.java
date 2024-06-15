package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
		Statement stmt=con.createStatement();
		//ResultSet rs=stmt.executeQuery("SELECT * FROM testing");
		int executeUpdate = stmt.executeUpdate("insert into testing values(2001,'babu')");
		
		System.out.println(executeUpdate);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("id")+" "+rs.getString("name"));
//			
//		}
		con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
