/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.*;
import javax.swing.JOptionPane;
import model.DBcon;

/**
 *
 * @author Yasiru
 */
public class groceries extends javax.swing.JFrame {
        private String username;
    /**
     * Creates new form groceries
     */
    public groceries(String username) {
        initComponents();
        this.username = username;
        showUsername();
    }
    
    private void showUsername() {
        lbl_showUsername.setText("Welcome, " + username);
    }
    
    private void addItemToCart(int itemId, String itemName, int price) {
    Connection con = DBcon.createConnection();
        try {
            String query = "INSERT INTO cart (Item_ID, Item_Name, Price) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, itemId);
            pst.setString(2, itemName);
            pst.setInt(3, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, itemName + " added to cart!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding item to cart: " + e.getMessage());
        }
    }
    
    
    
    private void clearCart(int itemId) {
        Connection con = DBcon.createConnection();
        try {
        String query = "DELETE FROM cart WHERE Item_ID = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, itemId);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Item removed from cart!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error removing item from cart: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_showUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_showCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_vPack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btn_vPack2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btn_beverages = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btn_snacks = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        btn_meat = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        btn_dryRations = new javax.swing.JButton();
        btn_removeDryRations = new javax.swing.JButton();
        btn_removeVPack1 = new javax.swing.JButton();
        btn_removeVPack2 = new javax.swing.JButton();
        btn_removeBeverages = new javax.swing.JButton();
        btn_removeSnacks = new javax.swing.JButton();
        btn_removeMeat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Groceries");
        setMinimumSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_showUsername.setText("jLabel1");
        getContentPane().add(lbl_showUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Beverages");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, -1));

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 80, -1));

        btn_showCart.setText("Show Cart");
        btn_showCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showCartActionPerformed(evt);
            }
        });
        getContentPane().add(btn_showCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vegitable pack 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 100));

        jLabel2.setText("Rs.500/=");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Includes -  250g Carrots                   \n                   200g Beans\n                   200g Potatoes\n                   200g Onions");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 90));

        btn_vPack1.setText("Add");
        btn_vPack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vPack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_vPack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vegitable pack 2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 100));

        jLabel4.setText("Rs.500/=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Includes -  200g Beans\n                   100g Garlic\n                   300g Brinjal\n                   200g Green Chilli\n                   250g Tomatoes");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 90));

        btn_vPack2.setText("Add");
        btn_vPack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vPack2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_vPack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/beverages.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 100));

        jLabel6.setText("Rs.1000/=");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 20));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Includes -  Coca Cola (1L)\n                   Fresh Milk (500ml)\n                   2 Mango Juice (500ml)");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, 90));

        btn_beverages.setText("Add");
        btn_beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beveragesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_beverages, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Vegitable Pack 1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Vegitable Pack 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Snacks");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 150, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/snacks.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 100));

        jLabel12.setText("Rs.1500/=");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 20));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Includes - Cream Cracker\n                  2 Lays Chips\n                  Popcorn (100g)\n                  Cassava Chips (200g)");
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 90));

        btn_snacks.setText("Add");
        btn_snacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_snacksActionPerformed(evt);
            }
        });
        getContentPane().add(btn_snacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Meat");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 150, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/meat.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 100));

        jLabel15.setText("Rs.3500/=");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 20));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Includes - 2Kg Chicken\n                  400g Sausages\n                  1Kg Beef");
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 90));

        btn_meat.setText("Add");
        btn_meat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_meatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_meat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Dry Rations");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 150, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/snacks.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 100, 100));

        jLabel18.setText("Rs.1000/=");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, 20));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Includes - 2Kg White Rice\n                  2Kg Red Rice\n                  1Kg Dhal");
        jScrollPane6.setViewportView(jTextArea6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 90));

        btn_dryRations.setText("Add");
        btn_dryRations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dryRationsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dryRations, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        btn_removeDryRations.setText("Remove");
        btn_removeDryRations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeDryRationsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeDryRations, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        btn_removeVPack1.setText("Remove");
        btn_removeVPack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeVPack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeVPack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        btn_removeVPack2.setText("Remove");
        btn_removeVPack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeVPack2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeVPack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        btn_removeBeverages.setText("Remove");
        btn_removeBeverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeBeveragesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeBeverages, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        btn_removeSnacks.setText("Remove");
        btn_removeSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeSnacksActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        btn_removeMeat.setText("Remove");
        btn_removeMeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeMeatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_removeMeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        new UserDashboard(username).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_vPack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vPack1ActionPerformed
        addItemToCart(101, "Vegitable Pack 1", 500);
    }//GEN-LAST:event_btn_vPack1ActionPerformed

    private void btn_vPack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vPack2ActionPerformed
        addItemToCart(102, "Vegitable Pack 2", 500);
    }//GEN-LAST:event_btn_vPack2ActionPerformed

    private void btn_beveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beveragesActionPerformed
        addItemToCart(103, "Beverages", 1000);
    }//GEN-LAST:event_btn_beveragesActionPerformed

    private void btn_snacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_snacksActionPerformed
        addItemToCart(104, "Snacks", 1500);
    }//GEN-LAST:event_btn_snacksActionPerformed

    private void btn_meatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_meatActionPerformed
        addItemToCart(105, "Meat", 3500);
    }//GEN-LAST:event_btn_meatActionPerformed

    private void btn_dryRationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dryRationsActionPerformed
        addItemToCart(106, "Dry Rations", 1000);
    }//GEN-LAST:event_btn_dryRationsActionPerformed

    private void btn_removeVPack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeVPack1ActionPerformed
        clearCart(101);
    }//GEN-LAST:event_btn_removeVPack1ActionPerformed

    private void btn_removeVPack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeVPack2ActionPerformed
        clearCart(102);
    }//GEN-LAST:event_btn_removeVPack2ActionPerformed

    private void btn_removeBeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeBeveragesActionPerformed
        clearCart(103);
    }//GEN-LAST:event_btn_removeBeveragesActionPerformed

    private void btn_removeSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeSnacksActionPerformed
        clearCart(104);
    }//GEN-LAST:event_btn_removeSnacksActionPerformed

    private void btn_removeMeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeMeatActionPerformed
        clearCart(105);
    }//GEN-LAST:event_btn_removeMeatActionPerformed

    private void btn_removeDryRationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeDryRationsActionPerformed
        clearCart(106);
    }//GEN-LAST:event_btn_removeDryRationsActionPerformed

    private void btn_showCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showCartActionPerformed
        dispose();
        new cart(username).setVisible(true); 
    }//GEN-LAST:event_btn_showCartActionPerformed

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
            java.util.logging.Logger.getLogger(groceries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(groceries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(groceries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(groceries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new groceries(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_beverages;
    private javax.swing.JButton btn_dryRations;
    private javax.swing.JButton btn_meat;
    private javax.swing.JButton btn_removeBeverages;
    private javax.swing.JButton btn_removeDryRations;
    private javax.swing.JButton btn_removeMeat;
    private javax.swing.JButton btn_removeSnacks;
    private javax.swing.JButton btn_removeVPack1;
    private javax.swing.JButton btn_removeVPack2;
    private javax.swing.JButton btn_showCart;
    private javax.swing.JButton btn_snacks;
    private javax.swing.JButton btn_vPack1;
    private javax.swing.JButton btn_vPack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JLabel lbl_showUsername;
    // End of variables declaration//GEN-END:variables
}
