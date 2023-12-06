//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

//--JAVA CLASS--..
public class MainDaiWelaa extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    
    //--METHOD--..
    public MainDaiWelaa() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnType = new javax.swing.JButton();
        btnMaterial = new javax.swing.JButton();
        btnCook = new javax.swing.JButton();
        btnTaste = new javax.swing.JButton();
        btnTunHue = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnTunSafe = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnType_default.png"))); // NOI18N
        btnType.setBorder(null);
        btnType.setBorderPainted(false);
        btnType.setContentAreaFilled(false);
        btnType.setFocusPainted(false);
        btnType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTypeMouseExited(evt);
            }
        });
        getContentPane().add(btnType, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 413, -1, -1));

        btnMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnMaterial_default.png"))); // NOI18N
        btnMaterial.setBorder(null);
        btnMaterial.setBorderPainted(false);
        btnMaterial.setContentAreaFilled(false);
        btnMaterial.setFocusPainted(false);
        btnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaterialMouseExited(evt);
            }
        });
        getContentPane().add(btnMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 413, -1, -1));

        btnCook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnCook_default.png"))); // NOI18N
        btnCook.setBorder(null);
        btnCook.setBorderPainted(false);
        btnCook.setContentAreaFilled(false);
        btnCook.setFocusPainted(false);
        btnCook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCookMouseExited(evt);
            }
        });
        getContentPane().add(btnCook, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        btnTaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTaste_default.png"))); // NOI18N
        btnTaste.setBorder(null);
        btnTaste.setBorderPainted(false);
        btnTaste.setContentAreaFilled(false);
        btnTaste.setFocusPainted(false);
        btnTaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTasteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTasteMouseExited(evt);
            }
        });
        getContentPane().add(btnTaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 182, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainDaiWelaa.png"))); // NOI18N
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

    private void btnTasteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTasteMouseEntered
        try{
            String filePath = "/btnTaste_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTaste.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTasteMouseEntered

    private void btnTasteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTasteMouseExited
        try{
            String filePath = "/btnTaste_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnTaste.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTasteMouseExited

    private void btnCookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCookMouseEntered
        try{
            String filePath = "/btnCook_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnCook.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnCookMouseEntered

    private void btnCookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCookMouseExited
        try{
            String filePath = "/btnCook_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnCook.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnCookMouseExited

    private void btnMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseExited
        try{
            String filePath = "/btnMaterial_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnMaterial.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnMaterialMouseExited

    private void btnMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseEntered
        try{
            String filePath = "/btnMaterial_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnMaterial.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnMaterialMouseEntered

    private void btnTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeMouseEntered
        try{
            String filePath = "/btnType_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnType.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTypeMouseEntered

    private void btnTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeMouseExited
        try{
            String filePath = "/btnType_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnType.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnTypeMouseExited

    private void btnTunSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunSomActionPerformed
        MainSomHai mainSomHai = new MainSomHai();
        mainSomHai.setVisible(true);
        mainSomHai.pack();
        mainSomHai.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunSomActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnCook;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMaterial;
    private javax.swing.JButton btnTaste;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JButton btnType;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..