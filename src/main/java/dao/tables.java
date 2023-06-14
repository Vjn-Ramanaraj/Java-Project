/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */

public class tables {
    public static void main(String[]args){
        try{
               String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),phoneno varchar(10),address varchar(200),password varchar(200),status varchar(20),UNIQUE (email))";
                 String adminDetails="Insert into user(name,email,phoneno,address,password,status) values('Admin','admin@gmail.com','0771234567','SrilankaS','Admin2000','true')";  
                 String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
                 String ProductTable ="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
                  String billTable ="create table bill(id int primary key,name varchar(200),phoneNumber varchar(200),email varchar(200),date varchar(50),total varchar(50),created varchar(200))";
                 
                 Dboperation.setDataorDelete(userTable, "User Table created successfully");
            Dboperation.setDataorDelete(adminDetails,"Admin Details Added Successfully");
            Dboperation.setDataorDelete(categoryTable,"Category table Created Successfully");
            Dboperation.setDataorDelete(ProductTable,"Product table Created Successfully");
          Dboperation.setDataorDelete(billTable,"Bill table Created Successfully");
       
        }  
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
              
            
        }
        
        
        
    }
    
}

