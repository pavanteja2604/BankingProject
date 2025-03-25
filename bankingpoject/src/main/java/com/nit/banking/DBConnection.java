package com.nit.banking;

import java.sql.Connection;

public class DBConnection {
	private static Connection con=null;
	private DBConnection() {}
	static {
	try {
		
	}
	catch(Exception e) {
		e.printStackTrace();
	  }
	}
	public static Connection getCon() {
		return con;
	}
}
