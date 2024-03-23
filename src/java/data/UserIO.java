///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package data;
//import java.io.*;
//import java.util.*;
//import business.User;
//
//public class UserIO
//{
//    public static void addRecord(User user, String filename) throws IOException
//    {
//        File file = new File(filename);
//        PrintWriter out = new PrintWriter(
//                new FileWriter(file, true));
//        out.println(user.getEmailAddress()+ "|"
//                + user.getPassword() +  "|"
//                + user.getConfirmPassword() + "|"
//                + user.getFirstName() + "|"
//                + user.getLastName() + "|"
//                + user.getPhoneNumber() + "|"
//                + user.getBlockName() + "|"
//                + user.getRoomNumber() + "|"
//                + user.getHostelName() + "|"
//                + user.getPickUp() + "|"
////                + user.getItemName() + "|"
////                + user.getWeight()); 
//        out.close();
//    }
//    
//    public static User getUser(String emailAddress, String filename) throws IOException
//    {
//        File file = new File(filename);
//        BufferedReader in = new BufferedReader(
//                new FileReader(file));
//        User user = new User();
//        String line = in.readLine();
//        while (line != null)
//        {
//            StringTokenizer t = new StringTokenizer(line, "|");
//            String email = t.nextToken();
//            if (email.equalsIgnoreCase(email))
//            {
//               
//                String password = t.nextToken();
//                String confirmPassword = t.nextToken();
//                String   firstName= t.nextToken();
//                String   lastName= t.nextToken();
//                String  phoneNumber= t.nextToken();
//                String   blockName= t.nextToken();
//                String  hostelName= t.nextToken();
//                String roomNumber = t.nextToken();
//                String   pickUp= t.nextToken();
//                String  itemName= t.nextToken();
//                String weight = t.nextToken();
//                
//                user.setEmailAddress(email);
//                user.setPassword(password);
//                user.setConfirmPassword(confirmPassword);
//                user.setFirstName(firstName);
//                user.setLastName(lastName);
//                user.setPhoneNumber(phoneNumber);
//                user.setBlockName(blockName);
//                user.setHostelName(hostelName);
//                user.setRoomNumber(roomNumber);
//                user.setPickUp(pickUp);
//                user.setItemName(itemName);
//                user.setWeight(weight);
//
//                
//
//            }
//            line = in.readLine();
//        }
//        in.close();
//        return user;
//    }
//
//    public static ArrayList<User> readRecords(String file) throws IOException
//    {
//        ArrayList<User> users = new ArrayList<>();
//        BufferedReader in = new BufferedReader(
//                new FileReader(file));
//        String line = in.readLine();
//        while (line != null)
//        {
//            StringTokenizer t = new StringTokenizer(line, "|");
//            String email = t.nextToken();
//            String password = t.nextToken();
//            String   firstName= t.nextToken();
//            String   lastName= t.nextToken();
//            String  phoneNumber= t.nextToken();
//            String   blockName= t.nextToken();
//            String  hostelName= t.nextToken();
//            String roomNumber = t.nextToken();
//            String confirmPassword = t.nextToken();
//            String   pickUp= t.nextToken();
//            String  itemName= t.nextToken();
//            String weight = t.nextToken();
//            User user = new User(email, password, confirmPassword, firstName, lastName, phoneNumber, blockName,hostelName, roomNumber,pickUp,itemName,weight);
//            users.add(user);
//            line = in.readLine();
//        }
//        in.close();
//        return users;
//    }
//    
//}
