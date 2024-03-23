<%-- 
    Document   : Registration
    Created on : Mar 5, 2024, 2:03:37 PM
    Author     : INFINITY
--%>

<%@page  pageEncoding="UTF-8"%>
<%@include file = "Navbar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    <style>
        /* Add your CSS styles here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        form {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        label, input, select {
            display: block;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <form action="Registration" method="post">
        <h2>User Registration</h2>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        
         <label for="password">confirm Password:</label>
        <input type="password" id="password" name="confirmPassword" required 

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="usertype">User Type:</label>
        <select id="usertype" name="userType">
            <option value="student">Student</option>
            <option value="staff">Staff</option>
        </select>

        <label for="phone">Phone Number:</label>
        <input type="text" id="phone" name="phone" pattern="[0-9]{10}" title="Please enter a 10-digit phone number" required>

        <input type="submit" value="Register">
         <p>Already have an account? <a href="Login.jsp">Login</a></p>
    </form>
</body>
</html>
