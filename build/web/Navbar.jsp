<%-- 
    Document   : Navbar
    Created on : Mar 5, 2024, 4:04:35 PM
    Author     : INFINITY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Navbar</title>
    <style>
        /* Add your CSS styles here */
        nav {
            background-color: #333;
            padding: 10px 0;
            text-align: center;
        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
        li {
            display: inline;
            margin-right: 20px;
        }
        li:last-child {
            margin-right: 0;
        }
        a {
            color: #fff;
            text-decoration: none;
            font-size: 16px;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <nav>
        <ul>
            <li><a href="Homepage.jsp">Home</a></li>
            <li><a href="Registration.jsp">Registration</a></li>
            <li><a href="Login.jsp">Login</a></li>
        </ul>
    </nav>
    </body>
</html>
