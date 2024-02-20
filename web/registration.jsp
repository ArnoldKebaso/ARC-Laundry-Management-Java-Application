<%-- 
    Document   : registration
    Created on : Feb 20, 2024, 10:11:29 PM
    Author     : Krafty Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Registration Page</title>
    </head>
    <body>
        <h2>JSP code to store details for the registration details</h2>
        <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword= request.getParameter("confirmPassword");
        %>
        
        <table cellspacing="5" cellpadding="5" border="1">
           <tr>
                <td align="right">Username:</td>
                <td><%=username %></td>
            </tr>
            <tr>
                <td align="right">Password:</td>
                <td><%=password %></td>
            </tr>
            <tr>
                <td align="right">Password:</td>
                <td><%=confirmPassword %></td>
            </tr>
        </table>
            <h1>Click here to Login to your account </h1>
    <form action="index.html">
        <input type="submit" value="Login">
    </form>
    </body>
</html>
