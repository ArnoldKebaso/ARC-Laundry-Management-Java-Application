<%-- 
    Document   : display_user_details
    Created on : Feb 28, 2024, 10:55:51 PM
    Author     : Krafty Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String userName = request.getParameter("username");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");
            String email = request.getParameter("email");
            String userType = request.getParameter("userType");
            String phone = request.getParameter("phone");
        %>
        
        <h1>Here is the data you entered</h1>
            <table cellspacing="5" cellpadding="5" border="1">
        <tr>
            <td align="right">User name:</td>
            <td><%= userName %></td>
        </tr>
        <tr>
            <td align="right">password:</td>
            <td><%= password %></td>
        </tr>
        <tr>
            <td align="right">Confirm Password::</td>
            <td><%= confirmPassword %></td>
        </tr>
        <tr>
            <td align="right">email</td>
            <td><%= email %></td>
        </tr>
        <tr>
            <td align="right">User</td>
            <td><%= userType %></td>
        </tr>
        <tr>
            <td align="right">Phone number</td>
            <td><%= phone %></td>
        </tr>
    </table>
        <h1>To create another account <br>
    click on the back button in your browser or the Return button shown <br>
    below.</h1>
        <form action="AddUserDetailsServlet" method="post">
        <input type="submit" value="Return">
    </form>



    </body>
</html>
