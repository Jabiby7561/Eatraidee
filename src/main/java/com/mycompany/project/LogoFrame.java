//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import javax.swing.*;

public class LogoFrame extends javax.swing.JFrame {

    //--VARIABLE--..
    
    
    //--METHOD--..
    public LogoFrame() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/LOGO_ICON.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }
    
    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EATRAIDEE");
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoFrame.png"))); // NOI18N
        labelBg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBgMouseClicked(evt);
            }
        });
        getContentPane().add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBgMouseClicked
        StartFrame startFrame = new StartFrame();
        startFrame.setVisible(true);
        startFrame.pack();
        startFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelBgMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBg;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..