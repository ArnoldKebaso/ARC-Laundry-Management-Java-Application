<%-- 
    Document   : login
    Created on : Feb 20, 2024, 9:45:57 PM
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
        
        <h2>Login JSP file to store the data entered </h2>
        <h1>Here is the data that you entered <h1>
                <% 
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
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
        </table>
            <h1>Click here to go to the homepage</h1>
            <form action="home.html">
                <input type ="submit" value="Homepage">
            </form>
    </body>
</html>
