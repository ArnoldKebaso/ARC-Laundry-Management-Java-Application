//
//
//
//
//
////import com.arnold.database.DatabaseConnection;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import com.arnold.database.DatabaseConnection;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//@WebServlet("/LoginServlet")
//public class LoginServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        // Retrieve hashed password from database based on username
//        String storedPassword = getStoredPasswordByUsername(username);
//
//        if (storedPassword != null && storedPassword.equals(password)) {
//            // Passwords match, create session and redirect to dashboard
//            HttpSession session = request.getSession();
//            session.setAttribute("username", username);
//            response.sendRedirect("dashboard.jsp");
//        } else {
//            // Invalid password, display error message
//            request.setAttribute("error", "Invalid username or password");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }
//    }
//
//    private String getStoredPasswordByUsername(String username) {
//        // Retrieve hashed password from database based on username
//        try {
//            Connection connection = DatabaseConnection.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT Password FROM users WHERE Username = ?");
//            preparedStatement.setString(1, username);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                return resultSet.getString("Password");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}