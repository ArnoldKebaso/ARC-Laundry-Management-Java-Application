/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Krafty Coder
 */
public class AddUserDetailsServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data from request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String email = request.getParameter("email");
        String userType = request.getParameter("userType");
        String phone = request.getParameter("phone");
        
        // You can perform validation or other business logic here
        
        // For demonstration, we'll just forward the request to a JSP page to display the user details
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("confirmPassword", confirmPassword);
        request.setAttribute("email", email);
        request.setAttribute("userType", userType);
        request.setAttribute("phone", phone);
        
        // Forward the request to a JSP page to display the user details
        request.getRequestDispatcher("display_user_details.jsp").forward(request, response);
    }

}
