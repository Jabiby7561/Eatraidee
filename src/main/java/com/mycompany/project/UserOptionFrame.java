//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

//--JAVA CLASS--..
public class UserOptionFrame extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    
    //--METHOD--..
    public UserOptionFrame() {
        setTitle("EATRAIDEE");
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnSkip = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Option");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 210, 90));

        btnSkip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSkip_default.png"))); // NOI18N
        btnSkip.setBorder(null);
        btnSkip.setBorderPainted(false);
        btnSkip.setContentAreaFilled(false);
        btnSkip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSkip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSkipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSkipMouseExited(evt);
            }
        });
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });
        getContentPane().add(btnSkip, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 210, 90));

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
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 200, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserOptionFrame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSkipActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        try{
            String filePath = "/btnLogin_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnLogin.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnSkipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSkipMouseEntered
        try{
            String filePath = "/btnSkip_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSkip.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSkipMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        try{
            String filePath = "/btnLogin_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnLogin.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnSkipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSkipMouseExited
        try{
            String filePath = "/btnSkip_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSkip.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSkipMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

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
        SignUpFrame signUpFrame = new SignUpFrame();
        signUpFrame.setVisible(true);
        signUpFrame.pack();
        signUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSkip;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..