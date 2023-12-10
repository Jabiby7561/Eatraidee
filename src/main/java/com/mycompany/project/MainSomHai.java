//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

//--JAVA CLASS--..
public class MainSomHai extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    CustomFont customFont;
    Timer CountDown;
    private int TimerCount = 1;
    
    private ArrayList<String> txtinslot = new ArrayList<>();
    
    //--METHOD--..
    public MainSomHai() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
        SlotMachine("ShowText");
        showTextFeild();
    }

    public int getTimerCount() {
        return TimerCount;
    }

    public void setTimerCount(int TimerCount) {
        this.TimerCount = TimerCount;
    }
    
    
    public void SlotMachine(String operation){
        customFont = new CustomFont();
        Font font = customFont.setFontFile(22);
        
        ArrayList<Integer> randomindexlist = new ArrayList<>();
        
        int randomIndex = 0;
        
        if (operation.equals("ShowText")){
            //System.out.println(txtinslot.size());
            txtSlot1.setFont(font);  
            txtSlot2.setFont(font);
            txtSlot3.setFont(font);  
            txtSlot4.setFont(font);  
            txtSlot5.setFont(font);
            
            ChangeTextSlotMachine();
        }
        
        if (operation.equals("AddText")){
            if (txtinslot.size() < 5){
                if (txtFoodname.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Pls Fill The Blanks", "Error", 
                    JOptionPane.WARNING_MESSAGE);
                }else{
                    txtinslot.add(txtFoodname.getText());
                }              
            }else{
                  JOptionPane.showMessageDialog(this, "The Limited is 5 Menu", "Error", 
                    JOptionPane.WARNING_MESSAGE);     
            }
            txtFoodname.setText(null);
            ChangeTextSlotMachine();
        }
        
        
        if (operation.equals("RandomText")){
            //txtSlotMachine
            Random random = new Random();
            if (txtinslot.size() == 5){               
                do {
                    randomIndex = random.nextInt( txtinslot.size());
                    if (randomindexlist.contains(randomIndex)== false){
                        randomindexlist.add(randomIndex);
                    }
                }while(randomindexlist.size() < 5);          
            txtSlot1.setText(txtinslot.get(randomindexlist.get(0)));  
            txtSlot2.setText(txtinslot.get(randomindexlist.get(1)));  
            txtSlot3.setText(txtinslot.get(randomindexlist.get(2)));   
            txtSlot4.setText(txtinslot.get(randomindexlist.get(3)));    
            txtSlot5.setText(txtinslot.get(randomindexlist.get(4)));
            }else{
                JOptionPane.showMessageDialog(this, "Pls Fill More Menu", "Error", 
                    JOptionPane.WARNING_MESSAGE); 
            }
            
        }
        
        
        if (operation.equals("DeleteText")){
            if (txtinslot.contains(txtFoodname.getText())){
                this.txtinslot.remove(txtFoodname.getText());
                JOptionPane.showMessageDialog(this, "Delete Successful!","Info",
                            JOptionPane.INFORMATION_MESSAGE);              
            }else{
                JOptionPane.showMessageDialog(this, "Your Delete Not Found!!", "Error", 
                    JOptionPane.WARNING_MESSAGE); 
            }   
            ChangeTextSlotMachine();       
        }       
    }
    
    public void ChangeTextSlotMachine(){        
        txtSlot1.setText("");
        txtSlot2.setText("");
        txtSlot3.setText("");
        txtSlot4.setText("");
        txtSlot5.setText("");
        
        txtSlot1.setForeground(new java.awt.Color(0,0,0));
        txtSlot2.setForeground(new java.awt.Color(0,0,0));
        txtSlot3.setForeground(new java.awt.Color(0,0,0));
        txtSlot4.setForeground(new java.awt.Color(0,0,0));
        txtSlot5.setForeground(new java.awt.Color(0,0,0));
         
        switch (txtinslot.size()) {
            case 1 -> txtSlot1.setText(txtinslot.get(0));
            case 2 -> {
                txtSlot1.setText(txtinslot.get(0));
                txtSlot2.setText(txtinslot.get(1));
            }
            case 3 -> {
                txtSlot1.setText(txtinslot.get(0));
                txtSlot2.setText(txtinslot.get(1));
                txtSlot3.setText(txtinslot.get(2));
            }
            case 4 -> {
                txtSlot1.setText(txtinslot.get(0));
                txtSlot2.setText(txtinslot.get(1));
                txtSlot3.setText(txtinslot.get(2));
                txtSlot4.setText(txtinslot.get(3));
            }
            case 5 -> {
                txtSlot1.setText(txtinslot.get(0));
                txtSlot2.setText(txtinslot.get(1));
                txtSlot3.setText(txtinslot.get(2));
                txtSlot4.setText(txtinslot.get(3));
                txtSlot5.setText(txtinslot.get(4));
            }
        default -> {
            }
        }
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
        btnRandom = new javax.swing.JButton();
        txtSlot3 = new javax.swing.JLabel();
        txtSlot2 = new javax.swing.JLabel();
        txtSlot4 = new javax.swing.JLabel();
        txtSlot1 = new javax.swing.JLabel();
        txtSlot5 = new javax.swing.JLabel();
        txtSlotMachine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Program");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFoodname.setBackground(new java.awt.Color(100, 100, 100));
        txtFoodname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoodname.setBorder(null);
        getContentPane().add(txtFoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 260, 50));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAdd_default.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnDelete_default.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTunSafeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTunSafeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTunSafeMouseExited(evt);
            }
        });
        btnTunSafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunSafeActionPerformed(evt);
            }
        });
        getContentPane().add(btnTunSafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 200, 100));

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

        btnRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnRandom_default.png"))); // NOI18N
        btnRandom.setBorder(null);
        btnRandom.setBorderPainted(false);
        btnRandom.setContentAreaFilled(false);
        btnRandom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRandomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRandomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRandomMouseExited(evt);
            }
        });
        getContentPane().add(btnRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        txtSlot3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSlot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSlot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 360, 50));

        txtSlot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSlot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 290, 50));

        txtSlot4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSlot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 290, 50));

        txtSlot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSlot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 290, 50));

        txtSlot5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSlot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 290, 50));

        txtSlotMachine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine.png"))); // NOI18N
        getContentPane().add(txtSlotMachine, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainTunSom.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTunHueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunHueMouseClicked
        
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

    private void btnRandomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRandomMouseEntered
        try{
            String filePath = "/btnRandom_hover.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnRandom.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRandomMouseEntered

    private void btnRandomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRandomMouseExited
        try{
            String filePath = "/btnRandom_default.png";
            imgIcon = new ImageIcon(getClass().getResource(filePath));
            btnRandom.setIcon(imgIcon);
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRandomMouseExited

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        SlotMachine("AddText");
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnRandomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRandomMouseClicked
        setTimerCount(1) ;
        if (txtinslot.size() == 5){
            CountDown = new Timer( 85,new ActionListener(){     
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (getTimerCount() <= 9){
                        String filePath = "/SlotMachine" + getTimerCount() +".png";
                        imgIcon = new ImageIcon(getClass().getResource(filePath));
                        txtSlotMachine.setIcon(imgIcon);
                    
                        SlotMachine("RandomText");
                                 
                    }else{
                        String filePath = "/SlotMachine.png";
                        imgIcon = new ImageIcon(getClass().getResource(filePath));
                        txtSlotMachine.setIcon(imgIcon);
                    
                        txtSlot1.setForeground(new java.awt.Color(225,225,225));
                        txtSlot2.setForeground(new java.awt.Color(225,225,225));
                        txtSlot3.setForeground(new java.awt.Color(0,0,0));
                        txtSlot4.setForeground(new java.awt.Color(225,225,225));
                        txtSlot5.setForeground(new java.awt.Color(225,225,225));
                        CountDown.stop();
                    }
                    setTimerCount(getTimerCount()+ 1) ;
                }                         
            });
            CountDown.start();
        }else{
            SlotMachine("RandomText");
        }
    }//GEN-LAST:event_btnRandomMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        SlotMachine("DeleteText");
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnTunSafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTunSafeMouseClicked
        MainTunSafe mainTunSafe = new MainTunSafe();
        mainTunSafe.setVisible(true);
        mainTunSafe.pack();
        mainTunSafe.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunSafeMouseClicked

    private void btnTunSafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunSafeActionPerformed
        if (MainFrame.CheckAccount.equals("Don't Have Account")){
            JOptionPane.showMessageDialog(this, "Your Don't Have Account Pls Sign-UP or Log-IN", "Error", JOptionPane.WARNING_MESSAGE);
            UserOptionFrame userOptionFrame = new UserOptionFrame();
            userOptionFrame.setVisible(true);
            userOptionFrame.pack();
            userOptionFrame.setLocationRelativeTo(null);
            this.dispose();
        }else if (MainFrame.CheckAccount.equals("Have Account")){
            MainTunSafe mainTunSafe = new MainTunSafe();
            mainTunSafe.setVisible(true);
            mainTunSafe.pack();
            mainTunSafe.setLocationRelativeTo(null);
            this.dispose();
        }     
    }//GEN-LAST:event_btnTunSafeActionPerformed

    private void btnTunHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunHueActionPerformed
        MainTunHew mainTunHew = new MainTunHew();
        mainTunHew.setVisible(true);
        mainTunHew.pack();
        mainTunHew.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunHueActionPerformed
    
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
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtFoodname;
    private javax.swing.JLabel txtSlot1;
    private javax.swing.JLabel txtSlot2;
    private javax.swing.JLabel txtSlot3;
    private javax.swing.JLabel txtSlot4;
    private javax.swing.JLabel txtSlot5;
    private javax.swing.JLabel txtSlotMachine;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..
