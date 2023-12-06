//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//--JAVA CLASS--..
public class SignUpFrame extends javax.swing.JFrame{
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    CustomFont customFont;
    
    //--METHOD--..
    public SignUpFrame() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
        showTextFeild();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtCfPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnBack_default.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 60, 70));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 270, 50));

        txtCfPassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtCfPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtCfPassword.setBorder(null);
        getContentPane().add(txtCfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 270, 50));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 280, 50));

        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSignUp_default.png"))); // NOI18N
        btnSignUp.setBorder(null);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 200, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUpFrame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        try{
            String filePath = "/btnBack_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnBack.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        try{
            String filePath = "/btnBack_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnBack.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        UserOptionFrame userOptionFrame = new UserOptionFrame();
        userOptionFrame.setVisible(true);
        userOptionFrame.pack();
        userOptionFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        try{
            String filePath = "/btnSignUp_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSignUp.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        try{
            String filePath = "/btnSignUp_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSignUp.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String username,password, cfPassword;
        //Check Feild is null?
        if(txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", 
                    JOptionPane.WARNING_MESSAGE);
            txtUsername.selectAll();
            txtUsername.requestFocus();
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", 
                    JOptionPane.WARNING_MESSAGE);
            txtPassword.selectAll();
            txtPassword.requestFocus();
        }else if(txtCfPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Confirm Password is required", "Error", 
                    JOptionPane.WARNING_MESSAGE);
            txtCfPassword.selectAll();
            txtCfPassword.requestFocus();
        }else{
            username = txtUsername.getText();
            password = txtPassword.getText();  
            cfPassword = txtCfPassword.getText(); 
            if(!cfPassword.equals(password)){
                JOptionPane.showMessageDialog(this, "Confirm password is not match.","Warning",
                        JOptionPane.WARNING_MESSAGE);
                txtCfPassword.selectAll();
                txtCfPassword.requestFocus();
            }else{
                boolean result = fetchUserAll(username);
                LoginFrame loginFrame = new LoginFrame();
                if(result==true){
                    int response = JOptionPane.showConfirmDialog(null, 
                            "You already have an account\nDo you want to go to login page?", 
                            "Admin", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        loginFrame.setVisible(true);
                        loginFrame.pack();
                        loginFrame.setLocationRelativeTo(null);
                        this.dispose();
                    }else{
                        txtUsername.selectAll();
                        txtUsername.requestFocus();
                        txtPassword.setText("");
                        txtCfPassword.setText("");
                    }
                }else{
                    insertToDB(username,password);
                    txtUsername.setText("");
                    txtPassword.setText("");
                    txtCfPassword.setText("");
                    JOptionPane.showMessageDialog(this, "Sign Up Successful");
                    
                    // After show pop-up message back into LoginPage
                    loginFrame.setVisible(true);
                    loginFrame.pack();
                    loginFrame.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed
    
    private void showTextFeild(){
        txtUsername.setBackground(new java.awt.Color(0,0,0,0));
        txtUsername.setOpaque(false);
        txtUsername.repaint();
        
        txtPassword.setBackground(new java.awt.Color(0,0,0,0));
        txtPassword.setOpaque(false);
        txtPassword.repaint();
        
        txtCfPassword.setBackground(new java.awt.Color(0,0,0,0));
        txtCfPassword.setOpaque(false);
        txtCfPassword.repaint();
        
        customFont = new CustomFont();
        Font font = customFont.setFontFile(22);
        txtUsername.setFont(font);
    }
    
    private static void insertToDB(String username, String password){
        try{
            Connection con = DbConnection.connect();
            PreparedStatement cursor = null;
            try{
                String sqlInsert = "INSERT INTO userAccount(username,password) VALUES(?,?)";
                cursor = con.prepareStatement(sqlInsert);
                cursor.setString(1, username);
                cursor.setString(2, password);
                cursor.execute();
                System.out.println("Data has been inserted!");
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private static boolean fetchUserAll(String username){
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        ResultSet result = null;
        try{
            String sqlFetch = "SELECT * FROM userAccount WHERE username = ?";
            cursor = con.prepareStatement(sqlFetch);
            cursor.setString(1, username);
            result = cursor.executeQuery();
            return result.next();
            /*while(result.next()){
                String username = result.getString("username");
                String password = result.getString("password");
                System.out.println("ALL USERS : ");
                System.out.println("USERNAME : "+username);
                System.out.println("PASSWORD : "+password);
                System.out.println("\n");
            }*/
        }catch(SQLException e){
            System.out.println("Fetch ALL Data Error : "+e.toString());
        }finally{
            try{
                cursor.close();
                result.close();
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtCfPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..
