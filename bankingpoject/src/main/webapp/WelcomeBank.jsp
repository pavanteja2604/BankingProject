<%@ page import="java.io.*, java.util.*, javax.servlet.*, javax.servlet.http.*" %>
<%
    HttpSession sessionObj = request.getSession(false);
    if (sessionObj == null || sessionObj.getAttribute("userId") == null) {
        response.sendRedirect("index.html"); // Redirect to login if not authenticated
    } else {
        String userId = (String) sessionObj.getAttribute("userId");
        String accountNo = (String) sessionObj.getAttribute("accountNo");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= userId %>!</h2>
    <p>Your Account Number: <%= accountNo %></p>
    <a href="logout.jsp">Logout</a>
</body>
</html>
<%
    }
%>
