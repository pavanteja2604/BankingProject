package com.nit.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DBInfo.driver);
        return DriverManager.getConnection(DBInfo.dbUrl, DBInfo.uName, DBInfo.Pword);
    }
}

