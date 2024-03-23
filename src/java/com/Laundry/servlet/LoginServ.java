/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Laundry.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.DriverManager;


/**
 *
 * @author Krafty Coder
 */
public class LoginServ extends HttpServlet {

     // JDBC URL, username, and password
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/laundrymanagementsystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456@localhost";

    // JDBC driver class name
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            // Load JDBC driver
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Failed to load JDBC driver: " + JDBC_DRIVER);
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");

        // Retrieve hashed password from database based on username
        String storedPassword = getStoredPasswordByUsername(username);

        if (storedPassword != null && storedPassword.equals(password)) {
            // Passwords match, create session and redirect to dashboard
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            // Invalid password, display error message
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }

    private String getStoredPasswordByUsername(String username) {
        // Retrieve hashed password from database based on username
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Create prepared statement with SQL
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT Password FROM users WHERE Username = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("Password");
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
