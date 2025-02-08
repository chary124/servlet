package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EditDao {
	String q = "update book set bookid=?,bookname=?,bookauthor=?,bookprice=?,bookqty=? where bookid=?";
	Connection con = DbConnect.getConnection();
	int k =0;
	public int edit(Book b,String id)
	{
		try
		{
		PreparedStatement p = con.prepareStatement(q);
		p.setString(1, b.getBookId());
		p.setString(2, b.getBookName());
		p.setString(3, b.getBookAuthor());
		p.setString(4, b.getBookPrice());
		p.setString(5, b.getBookQty());
		p.setString(6, id);
	  k = p.executeUpdate();
	 
	 System.out.println(k + "book");
	 
	
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		
	}
		return k;
	}
	

}
