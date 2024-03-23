<%-- 
    Document   : registration_success
    Created on : Mar 6, 2024, 9:00:12 AM
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
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");
        %>
        
        
        <h1>Successfully registered</h1>
        <h1>Here is the infomation that you entered</h1>
        <table cellspacing = "5" cellpadding="5" border="2">
            <tr>
                <td>Email Address</td>
                <td><%= email %></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><%= password %></td>
            </tr>
                       <tr>
                <td>Confirm Password</td>
                <td><%= confirmPassword %></td>
            </tr>
        </table>
            <h1>Enter Your contact details here</h1>
    <form action="contact_details.jsp" method="post">
        <input type="submit" value="Contact Details">
    </form>
            
         <form action="student_address.jsp" method="post">
        <input type="submit" value="Contact Details">
    </form>
    </body>
</html>
