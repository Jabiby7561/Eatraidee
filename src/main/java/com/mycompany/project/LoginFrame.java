//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import javax.swing.ImageIcon;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//--JAVA CLASS--..
public class LoginFrame extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    CustomFont customFont;
    
    //--METHOD--..
    public LoginFrame() {
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
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        labelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
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

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 280, 50));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 270, 50));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnLogin_default.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 574, 200, 100));

        labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame.png"))); // NOI18N
        getContentPane().add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //Do this next time
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Username and Password is required", "Error", 
                    JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
        }else{
            userLogin(username,password);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        try{
            String filePath = "/btnLogin_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnLogin.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        try{
            String filePath = "/btnLogin_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnLogin.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnLoginMouseExited
    
    private void showTextFeild(){
        txtUsername.setBackground(new java.awt.Color(0,0,0,0));
        txtUsername.setOpaque(false);
        txtUsername.repaint();
        
        txtPassword.setBackground(new java.awt.Color(0,0,0,0));
        txtPassword.setOpaque(false);
        txtPassword.repaint();
        
        customFont = new CustomFont();
        Font font = customFont.setFontFile(22);
        txtUsername.setFont(font);
    }
    
    public void userLogin(String username, String password){
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        ResultSet result = null;
        if(con != null){
            try{
                String sqlFetch = "SELECT username FROM userAccount WHERE username = ? AND password = ?";
                cursor = con.prepareStatement(sqlFetch);
                cursor.setString(1,username);
                cursor.setString(2,password);
                result = cursor.executeQuery();
                if(result.next()){
                    JOptionPane.showMessageDialog(this, "Login Successful!","Info",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.setVisible(true);
                    mainFrame.pack();
                    mainFrame.setLocationRelativeTo(null);
                }else{
                    JOptionPane.showMessageDialog(this, "Username or Password is invalid","Warning",
                            JOptionPane.WARNING_MESSAGE);
                    txtPassword.selectAll();
                    txtPassword.requestFocus();
                }
            }catch(SQLException e){
                System.out.println(e.toString());
            }finally{
                try{
                    con.close();
                    result.close();
                    cursor.close();
                }catch(SQLException e){
                    System.out.println(e.toString());
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel labelBg;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..