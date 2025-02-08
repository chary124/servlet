package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewDao {
	String q = "select *from book";
	Connection con = DbConnect.getConnection();
	ArrayList<Book> al = new ArrayList<Book>();
	ResultSet s = null;
	public ArrayList<Book> view()
	{
		try {
			PreparedStatement p = con.prepareStatement(q);
			//Book b = new Book();
			s = p.executeQuery();
			while(s.next())
			{
				Book b = new Book();
				b.setBookId(s.getString(1));
				b.setBookName(s.getString(2));
				b.setBookAuthor(s.getString(3));
				b.setBookPrice(s.getString(4));
				b.setBookQty(s.getString(5));
				al.add(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
