package com.nit.banking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/user")
@SuppressWarnings("serial")

public class LoginValidation  extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		String Acno=req.getParameter("AccNo");
		String userId=req.getParameter("UserId");
		String password=req.getParameter("Password");
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Select *from Userregister where AccountNo=? and UserId=? and password=?");
			ps.setString(1, Acno);
			ps.setString(2,userId);
			ps.setString(3, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				HttpSession session =req.getSession();
				res.sendRedirect("Welcome.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
