/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arnold.database;
/**
 *
 * @author Krafty Coder
 */
//import java.sql.Connection; 
//import java.sql.DriverManager; 
//import java.sql.SQLException; 
//  
//// This class can be used to initialize the database connection 
//public class DatabaseConnection { 
//    protected static Connection initializeDatabase() 
//        throws SQLException, ClassNotFoundException 
//    { 
//        // Initialize all the information regarding 
//        // Database Connection 
//        String dbDriver = "com.mysql.jdbc.Driver"; 
//        String dbURL = "jdbc:mysql:// localhost:3306/"; 
//        // Database name to access 
//        String dbName = "laundry_users"; 
//        String dbUsername = "root"; 
//        String dbPassword = "mAjimaji21!!"; 
//  
//        Class.forName(dbDriver); 
//        Connection con = DriverManager.getConnection(dbURL + dbName, 
//                                                     dbUsername,  
//                                                     dbPassword); 
//        return con; 
//    } 
//}

//    public static Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
 
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/laundry_users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mAjimaji21";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}