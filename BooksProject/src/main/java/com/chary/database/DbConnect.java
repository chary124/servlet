package com.chary.database;

import java.sql.Connection;
import java.sql.DriverManager;

 
public class DbConnect {
	public static Connection con = null;

	private DbConnect() {
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(DbInfo.dbUrl, DbInfo.userName, DbInfo.passWord);
			// System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}

}
