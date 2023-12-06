//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

//--JAVA CLASS--..
public class MainTunHew extends javax.swing.JFrame {
    
    //--VARIABLE--..
    private ImageIcon imgIcon;

    //--METHOD--..
    public MainTunHew() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFried = new javax.swing.JButton();
        btnStirFried = new javax.swing.JButton();
        btnBoiled = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnTunHue = new javax.swing.JButton();
        btnTunSafe = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFried.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnFried_default.png"))); // NOI18N
        btnFried.setBorder(null);
        btnFried.setBorderPainted(false);
        btnFried.setContentAreaFilled(false);
        btnFried.setFocusPainted(false);
        btnFried.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFriedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFriedMouseExited(evt);
            }
        });
        btnFried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFriedActionPerformed(evt);
            }
        });
        getContentPane().add(btnFried, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 425, -1, -1));

        btnStirFried.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnStir-fried_default.png"))); // NOI18N
        btnStirFried.setBorder(null);
        btnStirFried.setBorderPainted(false);
        btnStirFried.setContentAreaFilled(false);
        btnStirFried.setFocusPainted(false);
        btnStirFried.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStirFriedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStirFriedMouseExited(evt);
            }
        });
        btnStirFried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStirFriedActionPerformed(evt);
            }
        });
        getContentPane().add(btnStirFried, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 187, -1, -1));

        btnBoiled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnBoiled_default.png"))); // NOI18N
        btnBoiled.setBorder(null);
        btnBoiled.setBorderPainted(false);
        btnBoiled.setContentAreaFilled(false);
        btnBoiled.setFocusPainted(false);
        btnBoiled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoiledMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoiledMouseExited(evt);
            }
        });
        btnBoiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoiledActionPerformed(evt);
            }
        });
        getContentPane().add(btnBoiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 182, -1, -1));

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
        btnTunSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunSomActionPerformed(evt);
            }
        });
        getContentPane().add(btnTunSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 412, -1, -1));

        btnTunHue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTunHew_default.png"))); // NOI18N
        btnTunHue.setBorder(null);
        btnTunHue.setBorderPainted(false);
        btnTunHue.setContentAreaFilled(false);
        btnTunHue.setFocusPainted(false);
        btnTunHue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTunHueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTunHueMouseExited(evt);
            }
        });
        getContentPane().add(btnTunHue, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 170, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainTunHew.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBoiledMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoiledMouseEntered
        try{
            String filePath = "/btnBoiled_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnBoiled.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBoiledMouseEntered

    private void btnBoiledMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoiledMouseExited
        try{
            String filePath = "/btnBoiled_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnBoiled.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBoiledMouseExited

    private void btnStirFriedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStirFriedMouseEntered
        try{
            String filePath = "/btnStir-fried_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnStirFried.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnStirFriedMouseEntered

    private void btnStirFriedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStirFriedMouseExited
        try{
            String filePath = "/btnStir-fried_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnStirFried.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnStirFriedMouseExited

    private void btnFriedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFriedMouseExited
        try{
            String filePath = "/btnFried_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnFried.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnFriedMouseExited

    private void btnTunHueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseExited
        try{
            String filePath = "/btnTunHew_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunHue.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunHueMouseExited

    private void btnTunHueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseEntered
        try{
            String filePath = "/btnTunHew_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTunHue.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTunHueMouseEntered

    private void btnFriedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFriedMouseEntered
        try{
            String filePath = "/btnFried_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnFried.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnFriedMouseEntered

    private void btnChefTunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChefTunActionPerformed
        MainDaiWelaa mainDaiWelaa = new MainDaiWelaa();
        mainDaiWelaa.setVisible(true);
        mainDaiWelaa.pack();
        mainDaiWelaa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnChefTunActionPerformed

    private void btnTunSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunSomActionPerformed
        MainSomHai mainSomHai = new MainSomHai();
        mainSomHai.setVisible(true);
        mainSomHai.pack();
        mainSomHai.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunSomActionPerformed

    private void btnBoiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoiledActionPerformed
        SelectMenuFrame selectMenuFrame = new SelectMenuFrame();
        
        selectMenuFrame.setSelectFoodType("cook");
        selectMenuFrame.setSelectMenuType("Boiled");
        selectMenuFrame.MenuRandomize(selectMenuFrame.getSelectMenuType(),selectMenuFrame.getSelectFoodType());
        
        selectMenuFrame.setVisible(true);
        selectMenuFrame.pack();
        selectMenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBoiledActionPerformed

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

    private void btnStirFriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStirFriedActionPerformed
        SelectMenuFrame selectMenuFrame = new SelectMenuFrame();
        
        selectMenuFrame.setSelectFoodType("cook");
        selectMenuFrame.setSelectMenuType("Stir-fried");
        selectMenuFrame.MenuRandomize(selectMenuFrame.getSelectMenuType(),selectMenuFrame.getSelectFoodType());
        
        selectMenuFrame.setVisible(true);
        selectMenuFrame.pack();
        selectMenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnStirFriedActionPerformed

    private void btnFriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFriedActionPerformed
        SelectMenuFrame selectMenuFrame = new SelectMenuFrame();
        
        selectMenuFrame.setSelectFoodType("cook");
        selectMenuFrame.setSelectMenuType("Fried");
        selectMenuFrame.MenuRandomize(selectMenuFrame.getSelectMenuType(),selectMenuFrame.getSelectFoodType());
        
        selectMenuFrame.setVisible(true);
        selectMenuFrame.pack();
        selectMenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnFriedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoiled;
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnFried;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnStirFried;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..