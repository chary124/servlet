package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PassDao {
	String q = "select *from admin where name=? and pass=?";
	
	Connection con = DbConnect.getConnection();
	ResultSet s = null;
	
	public boolean checkPass(String name,String pass)
	{
		try
		{
			PreparedStatement p = con.prepareStatement(q);
			p.setString(1, name);
			p.setString(2, pass);
			
			s = p.executeQuery();
			
			return s.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	

}
