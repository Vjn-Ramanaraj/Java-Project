/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


import model.User;

/**
 *
 * @author LENOVO
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,phoneno,address,password,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getPhonenumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','false')";
        Dboperation.setDataorDelete(query, "Registered Successfully!");
        String message ="hello";

        Dboperation.setDataorDelete(query,message);
    }

    public static User login(String email, String password) {
        User user = null;
        

        try {
              ResultSet rs = (ResultSet) Dboperation.getData("Select *from user where email ='"+email+"' and password='"+password+"'");
              while(rs.next()){
                  user=new User();
                  user.setStatus(rs.getString("status"));
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;

    }
    
    
    
    

    public static void update(String email, String newPassword) {
        String query = "update user set password ='" + newPassword + "'where email='" + email + "'";
        Dboperation.setDataorDelete(query, "Password Changed successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
             
            ResultSet resultSet = (ResultSet) Dboperation.getData("Select *from user where email ='" + email + "' and password='" + oldPassword + "'");
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "old Password is Wrong");
            } else {
                update(email, newPassword);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
