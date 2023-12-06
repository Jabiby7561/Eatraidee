//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

//--JAVA CLASS--..
public class MenuList {
    public ArrayList<String> SelectMenuList = new ArrayList<>();
    
    //--METHOD--..
    public void DatabseToStringToArray(String CheckSelectedMenu,String FuctionType){
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        ResultSet result = null;
        
        try{
            String sqlFetch = "SELECT foodName FROM foodItem WHERE "+ FuctionType +" =?" ;
            cursor = con.prepareStatement(sqlFetch);
            cursor.setString(1,CheckSelectedMenu);
            result = cursor.executeQuery(); 
            
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            try{
                while (result.next()){
                    SelectMenuList.add("/" + result.getString("foodName")+ ".png");               
                }                
                con.close();
                result.close();
                cursor.close();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
}