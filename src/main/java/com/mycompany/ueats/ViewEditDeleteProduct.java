/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ueats;

import dao.BillDao;
import dao.CategoryDao;
import dao.ProductDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Product;

/**
 *
 * @author LENOVO
 */
public class ViewEditDeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form ViewEditDeleteProduct
     */
    public ViewEditDeleteProduct() {
        initComponents();
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
    }

    public void validateField() {
        String name = txtname.getText();
        String price = txtprice.getText();
        String category = (String) jComboBox1.getSelectedItem();
        if (!name.equals("") && !price.equals("") && category != null) {
            btnupdate.setEnabled(true);
        } else 
            btnupdate.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View,Edit &Delete Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 236, 25));

        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 51));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1288, 8, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 37, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 206, 37, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 246, 60, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 286, 38, -1));

        lblid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblid.setText("00");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 56, -1));

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 203, 266, -1));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 283, 266, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 243, 266, -1));

        btnupdate.setBackground(new java.awt.Color(51, 204, 255));
        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 348, -1, -1));

        btndelete.setBackground(new java.awt.Color(51, 204, 255));
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 348, -1, -1));

        btnclear.setBackground(new java.awt.Color(51, 204, 255));
        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 348, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 91, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        int id = Integer.parseInt(lblid.getText());
        product.setId(id);
        product.setName(txtname.getText());
        product.setCategory((String) jComboBox1.getSelectedItem());
        product.setPrice(txtprice.getText());
        ProductDao.update(product);
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtpriceKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> list = ProductDao.getAllRecords();
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();

//            String obj={productObj.getId(),productObj.getName(),productObj.getCategory(),productObj.getPrice()};
             
            dtm.addRow(new Object[]{productObj.getId(), productObj.getName(), productObj.getCategory(), productObj.getPrice()});

            // dtm.addRow(new Object[]{productObj.getId(), productObj.getName(),productObj.getPrice(),productObj.getCategory()});
//             SimpleDateFormat dFormat =new SimpleDateFormat("dd-mm-yyyy");
//        Date date =new Date();
//        String todayDate =dFormat.format(date);
        
//            ArrayList<Bill> lists=BillDao.getAllRecorsByDesc(todayDate);
//            Iterator<Bill> itrs =lists.iterator();
//            while(itr.hasNext()){
//                Bill billObj =itrs.next();
//                dtm.addRow(new Object []{billObj.getId(),billObj.getName(),billObj.getPhoneNumber(),billObj.getEmail(),billObj.getDate(),billObj.getTotal(),billObj.getCreatedBy()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();

        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblid.setText(id);
        String name = model.getValueAt(index, 1).toString();
        txtname.setText(name);
        String category = model.getValueAt(index, 2).toString();
        String price = model.getValueAt(index, 3).toString();
        txtprice.setText(price);
        
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        jComboBox1.removeAllItems();
        jComboBox1.addItem(category);
        ArrayList<Category> categoryList = CategoryDao.getAllRecords();
        Iterator<Category> categoryItr = categoryList.iterator();
        while (categoryItr.hasNext()) {
            Category categoryObj = categoryItr.next();
            if (!categoryObj.getName().equals(category)) {
                jComboBox1.addItem(categoryObj.getName());
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String id = lblid.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete this product", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            ProductDao.delete(id);
            setVisible(false);
            new ViewEditDeleteProduct().setVisible(false);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_btncloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEditDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
