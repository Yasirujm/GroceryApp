/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.*;
import model.DBcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru
 */
public class payment extends javax.swing.JFrame {
    private String username;

    /**
     * Creates new form payment
     */
    public payment() {
        initComponents();
        
    }
    
    public payment(int totalAmount, String username) {
        initComponents();
        this.username = username;
        lbl_total.setText("Total: Rs" + totalAmount);      
    }
    
    private void sales(String username, String items, int totalAmount) {
    Connection con = DBcon.createConnection();
    try {
        String query = "INSERT INTO sales (Customer_Name, Items, Total_Amount, Sales_Date) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, items);
        pst.setInt(3, totalAmount);
        pst.setTimestamp(4, new Timestamp(System.currentTimeMillis())); // Current date and time from device
        pst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saving sale: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cardNo = new javax.swing.JTextField();
        txt_cardHolderNamer = new javax.swing.JTextField();
        txt_expireDate = new javax.swing.JTextField();
        txt_cvv = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        btn_payNow = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
        setMinimumSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Card Number :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 355, -1, -1));

        jLabel2.setText("Card Holder Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 412, -1, -1));

        jLabel3.setText("Expire Date : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 482, -1, -1));

        jLabel4.setText("CVV : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 545, -1, -1));
        getContentPane().add(txt_cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 352, 264, -1));
        getContentPane().add(txt_cardHolderNamer, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 409, 264, -1));
        getContentPane().add(txt_expireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 479, 264, -1));
        getContentPane().add(txt_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 542, 264, -1));

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 667, 108, 38));

        btn_payNow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_payNow.setForeground(new java.awt.Color(153, 153, 0));
        btn_payNow.setText("PAY NOW");
        btn_payNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payNowActionPerformed(evt);
            }
        });
        getContentPane().add(btn_payNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 667, 108, 38));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_total.setText("jLabel5");
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Your total is given below. Please fill out your card information to confirm ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 497, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("your purchase.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 20, 670, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_payNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payNowActionPerformed
        if (validatePaymentDetails()) {
            // Proceed with payment processing
            JOptionPane.showMessageDialog(this, "Payment successful!");
            String items = getCartItems();
            sales(username, items, getTotalAmount());
            clearCart();
            dispose();
            JOptionPane.showMessageDialog(this, "Thank you for your purchase!", "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
            new UserDashboard(username).setVisible(true);
        }
    }
    
    private String getCartItems() {
    StringBuilder items = new StringBuilder();
    Connection con = DBcon.createConnection();
    try {
        String query = "SELECT item_name FROM cart";
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            if (items.length() > 0) {
                items.append(", ");
            }
            items.append(rs.getString("item_name"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error retrieving cart items: " + e.getMessage());
    }
    return items.toString();
    }
    
    private int getTotalAmount() {
    int totalAmount = 0;
    Connection con = DBcon.createConnection();
    try {
        String query = "SELECT SUM(price) as total FROM cart";
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            totalAmount = rs.getInt("total");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error calculating total amount: " + e.getMessage());
    }
    return totalAmount;
    }

    private boolean validatePaymentDetails() {
        String cardNo = txt_cardNo.getText();
        String cardHolderName = txt_cardHolderNamer.getText();
        String expireDate = txt_expireDate.getText();
        String cvv = txt_cvv.getText();

        if (!cardNo.matches("\\d{16}")) {
            JOptionPane.showMessageDialog(this, "Card number must be 16 digits.");
            return false;
        }

        if (!cardHolderName.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Card holder name must contain only letters.");
            return false;
        }

        if (!cvv.matches("\\d{3}")) {
            JOptionPane.showMessageDialog(this, "CVV must be 3 digits.");
            return false;
        }

        if (!expireDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Expire date must be in the format MM/YY.");
            return false;
        }

        return true; 
    }//GEN-LAST:event_btn_payNowActionPerformed

    private void clearCart() {
        Connection con = DBcon.createConnection();
        try {
            String query = "DELETE FROM cart";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error clearing cart: " + e.getMessage());
        }
    }
    
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
        new cart(username).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_payNow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTextField txt_cardHolderNamer;
    private javax.swing.JTextField txt_cardNo;
    private javax.swing.JTextField txt_cvv;
    private javax.swing.JTextField txt_expireDate;
    // End of variables declaration//GEN-END:variables
}
