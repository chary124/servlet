package com.chary.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dao {

	String q = "insert into admin values(?,?,?,?,?,?)";
	int k = 0;
	Connection con = DbConnect.getConnection();

	public int insert(Admin a) {
		try {
			PreparedStatement p = con.prepareStatement(q);

			p.setString(1, a.getName());
			p.setString(2, a.getEmail());
			p.setString(3, a.getFname());
			p.setString(4, a.getLname());
			p.setString(5, a.getPhno());
			p.setString(6, a.getPass());
			k = p.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("k:" + k);
		return k;

	}
}
