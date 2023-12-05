//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//--JAVA CLASS--..
public class DbConnection {
    
    //--METHOD--..
    public static Connection connect(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:BU_Eatraidee.db");
            System.out.println("Connected...");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e+"");
        }
        return con;
    }
}
