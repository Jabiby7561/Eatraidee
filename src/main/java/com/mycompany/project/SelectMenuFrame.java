//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import java.util.Random;
import javax.swing.*;

//--JAVA CLASS--..
public class SelectMenuFrame extends javax.swing.JFrame {

    //--VARIABLE--..
    private ImageIcon imgIcon;
    private String SelectMenuType;
    private String SelectFoodType;
    private String SelectMenu;
    private int CheckTwiceMenu = -1;
      
    //--METHOD--..
    public SelectMenuFrame() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
    }
    
    public void MenuRandomize (String Check_RandomMenu,String FuctionType){
        Random random = new Random();
        MenuList menuList = new MenuList();
        
        menuList.DatabseToStringToArray(Check_RandomMenu,FuctionType);
        
        //random index in arraylist
        setSelectMenu(null);
        int randomIndex;          
        do{          
           randomIndex = random.nextInt(menuList.SelectMenuList.size());
            
        }while (CheckTwiceMenu == randomIndex);
        this.CheckTwiceMenu = randomIndex;
            
        // change picture
        try{
            String filePath = menuList.SelectMenuList.get(randomIndex);               
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            ShowMenu.setIcon(imgIcon);
            
            setSelectMenu(menuList.SelectMenuList.get(randomIndex));
        }catch(Exception e){
            System.err.println(e);
        }       
    }

    public String getSelectMenuType() {
        return SelectMenuType;
    }

    public void setSelectMenuType(String SelectMenuType) {
        this.SelectMenuType = SelectMenuType;
    }

    public String getSelectFoodType() {
        return SelectFoodType;
    }

    public void setSelectFoodType(String SelectFoodType) {
        this.SelectFoodType = SelectFoodType;
    }
    
    public String getSelectMenu() {
        return SelectMenu;
    }

    public void setSelectMenu(String SelectMenu) {
        this.SelectMenu = SelectMenu;
    }
       
    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsSkip = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnTunSafe = new javax.swing.JButton();
        btnTunHue = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        ShowMenu = new javax.swing.JLabel();
        labelBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsSkip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnBack2_default.png"))); // NOI18N
        btnsSkip.setBorder(null);
        btnsSkip.setBorderPainted(false);
        btnsSkip.setContentAreaFilled(false);
        btnsSkip.setFocusPainted(false);
        btnsSkip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsSkipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsSkipMouseExited(evt);
            }
        });
        btnsSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsSkipActionPerformed(evt);
            }
        });
        getContentPane().add(btnsSkip, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 360, -1, -1));

        btnSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSelect_default.png"))); // NOI18N
        btnSelect.setBorder(null);
        btnSelect.setBorderPainted(false);
        btnSelect.setContentAreaFilled(false);
        btnSelect.setFocusPainted(false);
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectMouseExited(evt);
            }
        });
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 357, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnBack2_default.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1175, 640, -1, -1));

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
        getContentPane().add(btnTunHue, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 170, -1, -1));

        btnChefTun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnDaiWelaa_default.png"))); // NOI18N
        btnChefTun.setBorder(null);
        btnChefTun.setBorderPainted(false);
        btnChefTun.setContentAreaFilled(false);
        btnChefTun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChefTun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChefTunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChefTunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChefTunMouseExited(evt);
            }
        });
        getContentPane().add(btnChefTun, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 296, 230, 80));

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
        getContentPane().add(btnTunSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 415, -1, -1));

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

        ShowMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KhaoKaMoo.png"))); // NOI18N
        getContentPane().add(ShowMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 130, -1, -1));

        labelBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelectMenuFrame.png"))); // NOI18N
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

    private void btnTunHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunHueActionPerformed
        MainTunHew mainTunHew = new MainTunHew();
        mainTunHew.setVisible(true);
        mainTunHew.pack();
        mainTunHew.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunHueActionPerformed

    private void btnChefTunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChefTunMouseClicked
        MainDaiWelaa mainDaiWelaa = new MainDaiWelaa();
        mainDaiWelaa.setVisible(true);
        mainDaiWelaa.pack();
        mainDaiWelaa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnChefTunMouseClicked

    private void btnTunSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunSomActionPerformed
        MainSomHai mainSomHai = new MainSomHai();
        mainSomHai.setVisible(true);
        mainSomHai.pack();
        mainSomHai.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunSomActionPerformed

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
            String filePath = "/btnBack2_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnBack.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnsSkipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsSkipMouseEntered
        try{
            String filePath = "/btnBack_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnsSkip.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnsSkipMouseEntered

    private void btnsSkipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsSkipMouseExited
        try{
            String filePath = "/btnBack2_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnsSkip.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnsSkipMouseExited

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        try{
            String filePath = "/btnSelect_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSelect.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        try{
            String filePath = "/btnSelect_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnSelect.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        ShowMenu showMenu = new ShowMenu(getSelectMenu());
        showMenu.setVisible(true);
        showMenu.pack();
        showMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnsSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsSkipActionPerformed
        MenuRandomize(getSelectMenuType(),getSelectFoodType());      
    }//GEN-LAST:event_btnsSkipActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShowMenu;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JButton btnsSkip;
    private javax.swing.JLabel labelBgMain;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..