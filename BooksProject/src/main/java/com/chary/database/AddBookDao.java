package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBookDao {
	String q = "insert into book values(?,?,?,?,?)";

	Connection con = DbConnect.getConnection();
	int k = 0;

	public int insert(Book b) {
		try {
			PreparedStatement p = con.prepareStatement(q);
			p.setString(1, b.getBookId());
			p.setString(2, b.getBookName());
			p.setString(3, b.getBookAuthor());
			p.setString(4, b.getBookPrice());
			p.setString(5, b.getBookQty());
			k = p.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(k + " book ");
		return k;
	}

}