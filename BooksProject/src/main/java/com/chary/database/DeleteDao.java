package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDao {
	String q = "delete  from book where bookid=?";
	Connection con = DbConnect.getConnection();
	int k = 0;
	
	public int deleteBook(String id)
	{
		try
		{
		PreparedStatement p =con.prepareStatement(q);
		p.setString(1, id);
		 k = p.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return  k;
	
	}

	 

}
