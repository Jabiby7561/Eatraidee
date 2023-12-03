//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

//--JAVA CLASS--..
public class MainFrame extends javax.swing.JFrame {

    //--VARIABLE--..
    ImageIcon imgIcon;
    
    //--METHOD--..
    public MainFrame() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTunSafe = new javax.swing.JButton();
        btnTunHue = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        labelBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTunSafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTunSave_default.png"))); // NOI18N
        btnTunSafe.setBorder(null);
        btnTunSafe.setBorderPainted(false);
        btnTunSafe.setContentAreaFilled(false);
        btnTunSafe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTunSafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTunSafeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTunSafeMouseExited(evt);
            }
        });
        getContentPane().add(btnTunSafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 200, 100));

        btnTunHue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTunHew_default.png"))); // NOI18N
        btnTunHue.setBorder(null);
        btnTunHue.setBorderPainted(false);
        btnTunHue.setContentAreaFilled(false);
        btnTunHue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTunHue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTunHueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTunHueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTunHueMouseExited(evt);
            }
        });
        btnTunHue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunHueActionPerformed(evt);
            }
        });
        getContentPane().add(btnTunHue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 90));

        btnChefTun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnDaiWelaa_default.png"))); // NOI18N
        btnChefTun.setBorder(null);
        btnChefTun.setBorderPainted(false);
        btnChefTun.setContentAreaFilled(false);
        btnChefTun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChefTun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChefTunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChefTunMouseExited(evt);
            }
        });
        getContentPane().add(btnChefTun, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 230, 80));

        btnTunSom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTunSom_default.png"))); // NOI18N
        btnTunSom.setText("jButton2");
        btnTunSom.setBorder(null);
        btnTunSom.setBorderPainted(false);
        btnTunSom.setContentAreaFilled(false);
        btnTunSom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTunSom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTunSomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTunSomMouseExited(evt);
            }
        });
        getContentPane().add(btnTunSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 230, 80));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnHome.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 80, 60));

        labelBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainFrame.png"))); // NOI18N
        getContentPane().add(labelBgMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChefTunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChefTunMouseEntered
        try{
            String filePath = "/btnDaiWelaa_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnChefTun.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnChefTunMouseEntered

    private void btnChefTunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChefTunMouseExited
        try{
            String filePath = "/btnDaiWelaa_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnChefTun.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnChefTunMouseExited

    private void btnTunSomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunSomMouseEntered
        try{
            String filePath = "/btnTunSom_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunSom.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunSomMouseEntered

    private void btnTunSomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunSomMouseExited
        try{
            String filePath = "/btnTunSom_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunSom.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunSomMouseExited

    private void btnTunSafeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunSafeMouseEntered
        try{
            String filePath = "/btnTunSave_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunSafe.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunSafeMouseEntered

    private void btnTunSafeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunSafeMouseExited
        try{
            String filePath = "/btnTunSave_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunSafe.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunSafeMouseExited

    private void btnTunHueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseExited
        //System.out.println("Exit");
        try{
            String filePath = "/btnTunHew_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunHue.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunHueMouseExited

    private void btnTunHueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseEntered
        //System.out.println("Enter");
        try{
            String filePath = "/btnTunHew_Hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunHue.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunHueMouseEntered

    private void btnTunHueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseClicked
        MainTunHew mainTunHew = new MainTunHew();
        mainTunHew.setVisible(true);
        mainTunHew.pack();
        mainTunHew.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunHueMouseClicked

    private void btnTunHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunHueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTunHueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JLabel labelBgMain;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..