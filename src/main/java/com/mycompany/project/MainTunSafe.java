//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//--JAVA CLASS--..
public class MainTunSafe extends javax.swing.JFrame {
    
    //--VARIABLE--..
    ImageIcon imgIcon;
    CustomFont customFont;
    
    //--METHOD--..
    public MainTunSafe() {
        Image AppIcon = new ImageIcon(this.getClass().getResource("/Logo_Icon.png")).getImage();
        this.setIconImage(AppIcon);
        initComponents();
        fetchOrderMenu_DB();
    }

    //--APACHE's METHOD--..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTunHue = new javax.swing.JButton();
        btnChefTun = new javax.swing.JButton();
        btnTunSafe = new javax.swing.JButton();
        btnTunSom = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TUN SAFE WAI LAO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnTunSafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 200, 100));

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
        getContentPane().add(btnTunSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

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
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 638, 80, 60));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(820, 700));
        jScrollPane1.setBackground(new java.awt.Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.repaint();

        jPanel1.setBackground(new java.awt.Color(0,0,0,0));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 2000));
        jPanel1.setOpaque(false);
        jPanel1.repaint();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 840, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TunSafeWaiFrame.png"))); // NOI18N
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

    private void btnChefTunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChefTunActionPerformed
        MainDaiWelaa mainDaiWelaa = new MainDaiWelaa();
        mainDaiWelaa.setVisible(true);
        mainDaiWelaa.pack();
        mainDaiWelaa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnChefTunActionPerformed

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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTunHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunHueActionPerformed
        MainTunHew mainTunHew = new MainTunHew();
        mainTunHew.setVisible(true);
        mainTunHew.pack();
        mainTunHew.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunHueActionPerformed

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

    private void btnTunSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunSomActionPerformed
        MainSomHai mainSomHai = new MainSomHai();
        mainSomHai.setVisible(true);
        mainSomHai.pack();
        mainSomHai.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTunSomActionPerformed
    
    public void fetchOrderMenu_DB(){
        OrderRecord record = new OrderRecord();
        int userId = record.getUserId();
        System.out.println("UserId : "+userId);
      
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Set layout for the main panel
        JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new BoxLayout(wrapperPanel, BoxLayout.Y_AXIS)); // Wrapper panel to hold rows of images
        wrapperPanel.setOpaque(false);
        
        Connection con = DbConnection.connect();
        PreparedStatement cursor = null;
        ResultSet result = null;
        if(con != null){
            try{
                String sqlFetch = "SELECT * FROM orderMenu WHERE userId = ?";
                cursor = con.prepareStatement(sqlFetch);
                cursor.setInt(1, userId);  // Use 1 instead of 3
                result = cursor.executeQuery();
                
                int imageCount = 0;
                JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
                
                
                while(result.next()){
                    String foodName = result.getString("foodName");
                    int userIdResult = result.getInt("userId");
                    //System.out.println("foodName: " + foodName + ", date: " + date + ", userId: " + userIdResult); 
                    
                    String filePath = foodName;
                    ImageIcon image = new ImageIcon(getClass().getResource(filePath));
                    
                    JLabel imageLabel = new JLabel();
                    imageLabel.setIcon(image);
                    rowPanel.add(imageLabel);
                    imageCount++;

                    if (imageCount % 2 == 0) { // After adding 2 images, add the row to wrapper and start a new row
                        wrapperPanel.add(rowPanel);
                        rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
                    }
                    rowPanel.setOpaque(false);
                }
                
                jScrollPane1.setOpaque(false);
                jScrollPane1.getViewport().setOpaque(false);
                
                if (imageCount % 2 != 0) { // Add the last row if it has less than 2 images
                    wrapperPanel.add(rowPanel);
                }
                
                wrapperPanel.setAlignmentY(Component.TOP_ALIGNMENT);
                jScrollPane1.setBorder(null);
                jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
                jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                jScrollPane1.setViewportView(wrapperPanel);
                jScrollPane1.setDoubleBuffered(true);
                jScrollPane1.getVerticalScrollBar().setUnitIncrement(50);
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
                
            }catch(SQLException e){
                System.out.println(e.toString());
            }finally {
                try {
                    if (result != null) result.close();
                    if (cursor != null) cursor.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChefTun;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTunHue;
    private javax.swing.JButton btnTunSafe;
    private javax.swing.JButton btnTunSom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
//--JAVA FILE's END--..