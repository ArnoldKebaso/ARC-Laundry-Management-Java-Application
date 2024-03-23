<%-- 
    Document   : contact_success
    Created on : Mar 13, 2024, 12:17:33 AM
    Author     : Krafty Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Details</title>
    </head>
    <body>
        <%
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
        %>
        
        
        <h1>Contact Details</h1>
        <h1>Here is the infomation that you entered</h1>
        <table cellspacing = "5" cellpadding="5" border="2">
            <tr>
                <td>First Name</td>
                <td><%=firstName  %></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><%= lastName %></td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><%= phoneNumber %></td>
            </tr>
        </table>
            <h1>Enter Your contact details here</h1>
    <form action="registration_success.jsp" method="post">
        <input type="submit" value="Contact Details">
    </form>
    </body>
</html>