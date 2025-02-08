package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateDao {
	String q = "select *from book where bookid=?";
	Connection con = DbConnect.getConnection();
	ResultSet s = null;
	
	public Book update(String id)
	{
		try
		{
		PreparedStatement p = con.prepareStatement(q);
		p.setString(1, id);
		s = p.executeQuery();
		while(s.next())
		{
		
			Book b = new Book(s.getString(1),s.getString(2), s.getString(3), s.getString(4), s.getString(5));
			 			
			
			return b;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
