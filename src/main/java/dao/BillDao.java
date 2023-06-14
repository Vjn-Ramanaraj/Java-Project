/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import java.sql.ResultSet;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author LENOVO
 */
public class BillDao {
    public static String getId(){
        int id =1;
        try{
                ResultSet rs=(ResultSet) Dboperation.getData("Select max(id) from bill");
                if(rs.next())
                {
                id=rs.getInt(1);
                id=id+1;
                }
             }
            catch(Exception e){
                    JOptionPane.showConfirmDialog(null, e);
                    }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
        String query= "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getPhoneNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
         Dboperation.setDataorDelete(query, "Bill Details Added Successfully");
    }
    
    public static ArrayList<Bill> getAllRecorsByInc(String date){
        ArrayList<Bill> arrayList =new ArrayList<>();
        try {
            ResultSet rs=(ResultSet) Dboperation.getData("select *from bill where date like '%"+date+"%'");
            Bill bill=new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setPhoneNumber(rs.getString("phoneNumber"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("date"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatedBy(rs.getString("createdBy"));
            arrayList.add(bill);
        } catch (Exception e) {
        }
    return arrayList;    
    }
    
    
    
      
    public static ArrayList<Bill> getAllRecorsByDesc(String date){
        ArrayList<Bill> arrayList =new ArrayList<>();
        try {
            ResultSet rs=(ResultSet) Dboperation.getData("select *from bill where date like '%"+date+"%' order By id DESC");
            Bill bill=new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setPhoneNumber(rs.getString("phoneNumber"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("date"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatedBy(rs.getString("createdBy"));
            arrayList.add(bill);
        } catch (Exception e) {
        }
    return arrayList;    
    }
    
}
