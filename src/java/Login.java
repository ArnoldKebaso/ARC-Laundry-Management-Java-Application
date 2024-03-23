/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author INFINITY
 */
public class Login extends HttpServlet {
     @Override
     protected void doPost(HttpServletRequest request,HttpServletResponse response )throws IOException, ServletException{
         response.setContentType("text/html");
         
         PrintWriter out = response.getWriter();
         
         //gettng data from user
         String username= request.getParameter("username");
         String password = request.getParameter("password");
         
         //declare database instances
         String dbURL = "jdbc:mysql://localhost:3306/laundry_users";
         String user ="root";
         String dbPassword = "mAjimaji21!!";
         
         //connect database
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection(dbURL,user,dbPassword)){
               Statement statement = con.createStatement();
               String sql ="select * from users where Username='"+username+"' and Password='"+password+"'";
               
              try(ResultSet rs =statement.executeQuery(sql)){
                 if (rs.next()){
                     response.sendRedirect("index.html");
//                     out.println("successfuly");
                 }else{
                     out.println("please register first");
                     response.sendRedirect("error.jsp");
                 }
                  
              }
           }
           
           
       }catch(ClassNotFoundException | SQLException e){
           out.println("h2" + e.getMessage() +"/h2");
       }
     }
}