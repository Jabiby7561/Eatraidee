/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class OrderRecord {
    private static int userId;
    private static String foodName;
    
    public int getUserId() {
        return userId;
    }

    public void setUsername(String userString) {
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        ResultSet result = null;
        try{    
            if(con != null){
                String sqlFetch = "SELECT userId FROM userAccount WHERE username = ?";
                cursor = con.prepareStatement(sqlFetch);
                cursor.setString(1, userString); 
                result = cursor.executeQuery();
                if (result.next()) { // If a row is present
                    OrderRecord.userId = result.getInt("userId");
                    //System.out.println("Set user: " + OrderRecord.userId); 
                    //System.out.println("Printed user: " + result.getInt("userId"));
                }
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally {
            try {
                if (result != null) result.close();
                if (cursor != null) cursor.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        OrderRecord.foodName = foodName;
    }


    public void insertToOrderMenu_DB(){
        //System.out.println("Set user: " + userId); 
        //System.out.println("Food Name : "+foodName);
        //System.out.println("Date : "+date);
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        try{
            String sqlInsert = "INSERT INTO orderMenu(foodName,userId) VALUES(?,?)";
            cursor = con.prepareStatement(sqlInsert);
            cursor.setString(1, foodName);
            cursor.setInt(2, userId);
            cursor.execute();
            //System.out.println("Data has been inserted!");
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
}
