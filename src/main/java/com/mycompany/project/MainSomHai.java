//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

//--JAVA CLASS--..
public class MainSomHai extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    CustomFont customFont;
    
    //--METHOD--..
    public MainSomHai() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
        showTextFeild();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFoodname = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTunHue = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnTunSafe = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFoodname.setBackground(new java.awt.Color(100, 100, 100));
        txtFoodname.setBorder(null);
        getContentPane().add(txtFoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 289, 280, 50));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAdd_default.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 385, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnDelete_default.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 495, -1, -1));

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
        getContentPane().add(btnTunHue, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 170, -1, -1));

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
        btnChefTun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChefTunActionPerformed(evt);
            }
        });
        getContentPane().add(btnChefTun, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 300, -1, -1));

        btnTunSom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTunSom_default.png"))); // NOI18N
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
        getContentPane().add(btnTunSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 416, -1, -1));

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

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnHome_default.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 80, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainTunSom.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTunHueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseClicked
        MainTunHew mainTunHew = new MainTunHew();
        mainTunHew.setVisible(true);
        mainTunHew.pack();
        mainTunHew.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunHueMouseClicked

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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnChefTunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChefTunActionPerformed
        MainDaiWelaa mainDaiWelaa = new MainDaiWelaa();
        mainDaiWelaa.setVisible(true);
        mainDaiWelaa.pack();
        mainDaiWelaa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnChefTunActionPerformed

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        try{
            String filePath = "/btnAdd_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnAdd.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        try{
            String filePath = "/btnAdd_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnAdd.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        try{
            String filePath = "/btnDelete_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnDelete.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        try{
            String filePath = "/btnDelete_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnDelete.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        try{
            String filePath = "/btnHome_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnHome.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        try{
            String filePath = "/btnHome_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnHome.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnHomeMouseExited
    
    private void showTextFeild(){
        txtFoodname.setBackground(new java.awt.Color(0,0,0,0));
        txtFoodname.setOpaque(false);
        txtFoodname.repaint();
        
        customFont = new CustomFont();
        Font font = customFont.setFontFile(22);
        txtFoodname.setFont(font);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtFoodname;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..