/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
//import business.User;
//import data.UserIO;


public class UserRegistrationServlet extends HttpServlet {
     // JDBC URL, username, and password
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/laundry_users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mAjimaji21!!";

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
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String email = request.getParameter("email");
        String userType = request.getParameter("userType");
        String phone = request.getParameter("phone");

        // Insert data into the database
        if (registerUser(username, password,confirmPassword, email,userType, phone)) {
            // Registration successful, redirect to success.jsp
            response.sendRedirect("display_user_details.jsp");
        } else {
            // Registration failed, redirect to failure.jsp
            response.sendRedirect("login.jsp");
        }
    }
         
        private boolean registerUser(String username, String password,String confirmPassword, String email,String userType, String phone) {
        // SQL statement to insert user data
        String sql = "INSERT INTO users (username, password,confirmPassword, email,userType, Phone) VALUES (?, ?, ?, ?, ?, ?)";

        try (
            // Get database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Create prepared statement with SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            // Set parameters in the prepared statement
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
              preparedStatement.setString(3, confirmPassword);
            preparedStatement.setString(4, email);
              preparedStatement.setString(5, userType);
            preparedStatement.setString(6, phone);

            // Execute the SQL statement and check if rows were affected
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
// Handle database errors
                        return false;
        }
    }      
}
  





