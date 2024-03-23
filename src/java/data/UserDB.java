/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package data;
//
///**
// *
// * @author Krafty Coder
// */
//import java.sql.*;
//import business.User;
//
//
//public class UserDB
//{
//    public static int insert(User user)
//    {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//
//        String query = 
//             "INSERT INTO User (firstName, lastName, " +
//                "phoneNumber) " +
//                "VALUES (?, ?, ?)";
//
//try
//        {        
//            ps = connection.prepareStatement(query);
//            ps.setString(1, user.getFirstName());
//            ps.setString(2, user.getLastName());
//            ps.setString(3, user.getPhoneNumber());
//            return ps.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            e.printStackTrace();
//            return 0;
//        }
//        finally
//        {
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
//        }
//    }
//    
//    public static int update(User user)
//    {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//        
//        String query = "UPDATE User SET " +
//                "firstName = ?, " +
//                "lastName = ?, " +
//                "phoneNumber = ?";
//                //"WHERE EmailAddress = ?";
//        try
//        {
//            ps = connection.prepareStatement(query);
//            ps.setString(1, user.getFirstName());
//            ps.setString(2, user.getLastName());
//            ps.setString(3, user.getPhoneNumber());
//            //ps.setString(3, user.getEmailAddress());
//
//            return ps.executeUpdate();
//        }
//       
//
//
//        
//
//    
//    catch(SQLException e)
//        {
//            e.printStackTrace();
//            return 0;
//        }
//        finally
//        {
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
//        }
//    }
//    
//    public static int delete(User user)
//    {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//        
//        String query = "DELETE FROM User " +
//                "WHERE EmailAddress = ?";
//
//    }
//
//    
//    
//    
//    
//    
//}
