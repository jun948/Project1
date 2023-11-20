/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group1.views;

import group1.utils.xImage;
import java.io.File;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author numpa
 */
public class JMainFrame extends javax.swing.JFrame {
//demo
    /**
     * Creates new form JMainFrame
     */
    public JMainFrame() {
        initComponents();
        setIconImage(xImage.getAppIcon());
        setTitle("Coffee Shop Management");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar = new javax.swing.JToolBar();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jToggleButton7 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        pnl_center = new javax.swing.JPanel();
        lbl_centerlogo = new javax.swing.JLabel();
        pnl_statusbar = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        lbl_clock = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_system = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        changepass = new javax.swing.JMenuItem();
        ressetpass = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        menu_managing = new javax.swing.JMenu();
        products = new javax.swing.JMenuItem();
        recipe = new javax.swing.JMenuItem();
        ingridients = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        invoice = new javax.swing.JMenuItem();
        employees = new javax.swing.JMenuItem();
        menu_statitics = new javax.swing.JMenu();
        revenue = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 57, 50));

        jToolBar.setBackground(new java.awt.Color(30, 57, 50));
        jToolBar.setBorder(null);
        jToolBar.setRollover(true);

        jToggleButton3.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton3.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton3.setText("Tạo Hóa Đơn");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jToolBar.add(jToggleButton3);

        jToggleButton4.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton4.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton4.setText("Nhập Nguyên Liệu");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton4);

        jToggleButton5.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton5.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton5.setText("Nhập công thức");
        jToggleButton5.setFocusable(false);
        jToggleButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton5);

        jToggleButton6.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton6.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton6.setText("Nhập Sản phẩm");
        jToggleButton6.setFocusable(false);
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton6);
        jToolBar.add(jSeparator5);

        jToggleButton7.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton7.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton7.setText("Hướng dẫn");
        jToggleButton7.setFocusable(false);
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton7);
        jToolBar.add(jSeparator4);

        jToggleButton1.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton1.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton1.setText("Đăng Xuất");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton1);

        jToggleButton2.setBackground(new java.awt.Color(30, 30, 30));
        jToggleButton2.setForeground(new java.awt.Color(242, 240, 235));
        jToggleButton2.setText("Thoát");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jToggleButton2);

        pnl_center.setBackground(new java.awt.Color(249, 249, 249));

        lbl_centerlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/images/longlogo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_centerLayout = new javax.swing.GroupLayout(pnl_center);
        pnl_center.setLayout(pnl_centerLayout);
        pnl_centerLayout.setHorizontalGroup(
            pnl_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_centerlogo, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_centerLayout.setVerticalGroup(
            pnl_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_centerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_centerlogo, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        pnl_statusbar.setBackground(new java.awt.Color(30, 57, 50));

        lbl_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(242, 240, 235));
        lbl_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/images/icons8_username_25px.png"))); // NOI18N

        lbl_clock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_clock.setForeground(new java.awt.Color(242, 240, 235));
        lbl_clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/images/icons8_alarm_clock_25px.png"))); // NOI18N

        javax.swing.GroupLayout pnl_statusbarLayout = new javax.swing.GroupLayout(pnl_statusbar);
        pnl_statusbar.setLayout(pnl_statusbarLayout);
        pnl_statusbarLayout.setHorizontalGroup(
            pnl_statusbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_statusbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_clock, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_statusbarLayout.setVerticalGroup(
            pnl_statusbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_statusbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_statusbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_statusbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_statusbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(30, 57, 50));

        menu_system.setText("Hệ Thống");
        menu_system.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_system.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_system.setPreferredSize(new java.awt.Dimension(70, 22));
        menu_system.add(jSeparator1);

        changepass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        changepass.setText("Đổi mật khẩu");
        menu_system.add(changepass);

        ressetpass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ressetpass.setText("Đặt lại mật khẩu");
        menu_system.add(ressetpass);
        menu_system.add(jSeparator2);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setText("Đăng Xuất");
        menu_system.add(logout);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        exit.setText("Thoát");
        menu_system.add(exit);

        jMenuBar1.add(menu_system);

        menu_managing.setText("Quản Lý");
        menu_managing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_managing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_managing.setPreferredSize(new java.awt.Dimension(70, 22));

        products.setText("Sản Phảm");
        menu_managing.add(products);

        recipe.setText("Công Thức");
        menu_managing.add(recipe);

        ingridients.setText("Nguyên Liệu");
        menu_managing.add(ingridients);
        menu_managing.add(jSeparator3);

        invoice.setText("Hóa Đơn");
        menu_managing.add(invoice);

        employees.setText("Nhân Viên");
        menu_managing.add(employees);

        jMenuBar1.add(menu_managing);

        menu_statitics.setText("Thống Kê");
        menu_statitics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_statitics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_statitics.setPreferredSize(new java.awt.Dimension(70, 22));

        revenue.setText("Doanh Thu");
        menu_statitics.add(revenue);

        jMenuBar1.add(menu_statitics);

        menu_about.setText("...");
        menu_about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_about.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_about.setPreferredSize(new java.awt.Dimension(70, 22));
        jMenuBar1.add(menu_about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changepass;
    private javax.swing.JMenuItem employees;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem ingridients;
    private javax.swing.JMenuItem invoice;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JLabel lbl_centerlogo;
    private javax.swing.JLabel lbl_clock;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menu_about;
    private javax.swing.JMenu menu_managing;
    private javax.swing.JMenu menu_statitics;
    private javax.swing.JMenu menu_system;
    private javax.swing.JPanel pnl_center;
    private javax.swing.JPanel pnl_statusbar;
    private javax.swing.JMenuItem products;
    private javax.swing.JMenuItem recipe;
    private javax.swing.JMenuItem ressetpass;
    private javax.swing.JMenuItem revenue;
    // End of variables declaration//GEN-END:variables
}
