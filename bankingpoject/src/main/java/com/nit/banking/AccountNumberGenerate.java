package com.nit.banking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AccountNumberGenerate extends HttpServlet{
	private static final long AccountNumber =1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
		try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("Select Max(AccountNO)from UserRegister");
		ResultSet rs=ps.executeQuery();
		long newAccountNo=100000001l;
		if(rs.next() && rs.getLong(1)!=0) {
			newAccountNo=rs.getLong(1)+1;
		}
		res.getWriter().write(String.valueOf(newAccountNo));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
