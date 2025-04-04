package com.nit.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDAO {
	public int k=0;
    public int registerUser(UserBean user) {
        try {
        	Connection con = DbConnection.getCon();
        
            String sql = "INSERT INTO UserRegister (USERID, PASSWORD, ACCOUNTTYPE, FIRSTNAME, LASTNAME, GENDER, CITY, MAILID, PHNO, ALTERNATIVENUMBER, ADDRESS1, ADDRESS2, ACCOUNTNO) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,user.getuName());
            ps.setString(2,user.getpWord());
            ps.setString(3,user.getAccountype());
            ps.setString(4,user.getFname());
            ps.setString(5,user.getLName());
            ps.setString(6,user.getGender());
            ps.setString(7,user.getCity());
            ps.setString(8,user.getmId());
            ps.setLong(9,user.getPhno());
            ps.setLong(10,user.getAltnum());
            ps.setString(11,user.getAddress1());
            ps.setString(12,user.getAddress2());
            ps.setString(13,user.getAccountnumber());
            k=ps.executeUpdate();
           

		/*
			 * int rowsAffected = ps.executeUpdate(); con.close(); return rowsAffected > 0;
			 */       
        } catch (Exception e) {
            e.printStackTrace();
           
        }
        return k;
     }
}

/*
 * public String generateAccountNumber() { try { Connection con =
 * DbConnection.getConnection(); String sql =
 * "SELECT MAX(account_number) FROM users"; PreparedStatement ps =
 * con.prepareStatement(sql); ResultSet rs = ps.executeQuery();
 * 
 * int newAccNo = 1001; if (rs.next() && rs.getInt(1) > 0) { newAccNo =
 * rs.getInt(1) + 1; } con.close(); return String.valueOf(newAccNo); } catch
 * (Exception e) { e.printStackTrace(); return "1001"; } } }
 */
	
