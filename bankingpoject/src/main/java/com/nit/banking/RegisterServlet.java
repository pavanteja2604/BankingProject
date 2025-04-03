package com.nit.banking;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		UserBean ub=new UserBean();
		ub.setuName(req.getParameter("USerID"));
		ub.setpWord(req.getParameter("password"));
		
		ub.setFname(req.getParameter("fname"));
		ub.setLName(req.getParameter("Lname"));
		ub.setCity(req.getParameter("city"));
		ub.setmId(req.getParameter("mailID"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
	    ub.setAltnum(Long.parseLong(req.getParameter("Altnumber")));
		ub.setAddress1(req.getParameter("Address1"));
		ub.setAddress2(req.getParameter("Address2"));
		int k=0;
		if(k>0) {
			req.setAttribute("msg","User Register SucessFully...<br>");
			req.getRequestDispatcher("RegSucess.jsp").forward(req, res);
		}
		
	}
	
}
