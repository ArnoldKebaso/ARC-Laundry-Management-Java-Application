/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Laundry.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 *
 * @author Krafty Coder
 */
public class UserRegServlet extends HttpServlet {

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
        // Retrieve form parameters
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Insert data into the database
        if (registerUser(email, password)) {
            // Registration successful, redirect to success.jsp
            response.sendRedirect("success.jsp");
        } else {
            // Registration failed, redirect to failure.jsp
            response.sendRedirect("failure.jsp");
        }
    }

    private boolean registerUser(String email, String password) {
        // SQL statement to insert user data
        String sql = "INSERT INTO users (email, password) VALUES (?, ?, ?, ?)";

        try (
            // Get database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Create prepared statement with SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            // Set parameters in the prepared statement
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            // Execute the SQL statement and check if rows were affected
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
// Handle database errors
                        return false;
        }
    }
}
