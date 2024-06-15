package com.sql;

import java.sql.*;
import java.util.Scanner;

public class MySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1504");
		Statement stmt=con.createStatement();
		System.out.println("Enter query:");
		Scanner s=new Scanner(System.in);
		//stmt.execute(s.nextLine());
		ResultSet rs=stmt.executeQuery(s.nextLine());
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
