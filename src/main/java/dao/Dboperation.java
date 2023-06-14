/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.mysql.cj.xdevapi.Result;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class Dboperation {
    public static void setDataorDelete(String Query, String msg){
       
        try{
            Connection con=connectionProvider.getcon();
            Statement st=con.createStatement();
                 st.executeUpdate(Query.toString());
                 if(!msg.equals(""))
                     JOptionPane.showMessageDialog(null, msg);
        
        }
            catch(Exception e)
                    {
                    JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
                    
                    }
    
    
    }

   

//    static Resultset getData(String query) {
//        try{
//             Connection con=connectionProvider.getcon();
//            Statement st=con.createStatement();
//
//                ResultSet rs=st.executeQuery(query);
//                 return (Resultset) rs;
//        
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
//        return null;
//        }
//    }
    
    public static Resultset getData(String query){
        
        try{
             Connection con=connectionProvider.getcon();
            Statement st=con.prepareStatement(query.toString());

                ResultSet rs=st.executeQuery(query.toString());
return (Resultset) rs;
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        return null;
        }
        
        
    }
    
}
    
