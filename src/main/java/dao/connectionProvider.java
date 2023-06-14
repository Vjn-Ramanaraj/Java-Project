/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class connectionProvider {
   public static Connection getcon(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb?useSSL=false","root","");
             //  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb?useSSL=false","root","");
            //return con;
            } catch (ClassNotFoundException | SQLException e) {
                System.out.print(e.getMessage());
                return null; 
            }
           
}
   

}

