/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Custodio_OOPCOMP121
 */
public class First extends javax.swing.JFrame {

    DefaultTableModel model1 = new DefaultTableModel();

    /**
     * Creates new form First
     */
    public First() {
        initComponents();
        model1 = (DefaultTableModel) Table.getModel();
        model1.setRowCount(0);
        setBounds(237, 62, 911, 682);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        classfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        typefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pricefield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clearbutton = new javax.swing.JButton();
        nextbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Weapon ID", "Class", "Name", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 790, 120));
        getContentPane().add(classfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Class");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 40));
        getContentPane().add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 204));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, 40));

        typefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typefieldActionPerformed(evt);
            }
        });
        getContentPane().add(typefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, 30));

        inputbutton.setText("Input");
        inputbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(inputbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 200, 70));

        jButton2.setText("Back To Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 250, 60));

        pricefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricefieldActionPerformed(evt);
            }
        });
        getContentPane().add(pricefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 102));
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(clearbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 210, 70));

        nextbutton.setText("Next");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(nextbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 170, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\CLB1\\S.Y. 2021-2022 FIRST SEMESTER\\IT HCI-Mdm Nacua\\Custodio_OOPCOMP121\\Downloads\\Forge Art - Etrian Odyssey Art Gallery.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Menu menu;

    void showdata(int modelnumber) {

        Second second = new Second();
        Third third = new Third();
        DBConnection.init();
        Connection c = DBConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = c.prepareStatement("Select * from weapon_shop.weapon_store");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                
                model1.addRow(new Object[]{rs.getString("weapon_id"), rs.getString("class"), rs.getString("name"), rs.getString("type"), rs.getString("price")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void InputData() {
        DBConnection.init();
        Connection c = DBConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = c.prepareStatement("INSERT INTO weapon_shop.weapon_store (class, name, type, price)\n"
                    + "VALUES ('" + classfield.getText() + "','" + namefield.getText() + "','" + typefield.getText() + "','" + pricefield.getText() + "')");
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getMenu() {
        this.menu.swordbutton.setOpaque(false);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    private void inputbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbuttonActionPerformed
        if (classfield.getText().equals("Bow") || classfield.getText().equals("Sword") || classfield.getText().equals("Shield")) {
            InputData();
            showdata(1);

        } else {
            JOptionPane.showMessageDialog(null, "The Item You Are Trying To Input \n Does Not Belong To Any Know Classes", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_inputbuttonActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
        classfield.setText("");
        typefield.setText("");
        namefield.setText("");
        pricefield.setText("");

    }//GEN-LAST:event_nextbuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        model1.removeRow(1);

    }//GEN-LAST:event_clearbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        System.out.println(this.getBounds());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void typefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typefieldActionPerformed

    private void pricefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricefieldActionPerformed

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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField classfield;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton inputbutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namefield;
    private javax.swing.JButton nextbutton;
    private javax.swing.JTextField pricefield;
    private javax.swing.JTextField typefield;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel DefaultTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
