package com.nit.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection con=null;
	private DbConnection(){	
	}
	static {
		try {
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.uName,DBInfo.Pword);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}
    
}

