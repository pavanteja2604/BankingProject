package com.nit.banking;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AccountNumberGenerate")
public class AccountNumberGenerate extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterDAO userDAO = new RegisterDAO();
        String accNumber = RegisterDAO.generateAccountNumber();
        response.getWriter().write(accNumber);
    }
}

