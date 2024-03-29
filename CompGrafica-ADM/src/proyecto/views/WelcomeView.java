/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import proyecto.entities.Report;
import proyecto.entities.User;
import proyecto.utils.Colors;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.SetImageLabel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import proyecto.db.Caller;

public class WelcomeView extends javax.swing.JFrame {
    private User user;

    public WelcomeView(User user) throws SQLException {
        this.user = user;
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeAppButton = new JButton();
        viewReportsButton = new JButton();
        viewReportsLabel = new JLabel();
        closeAppLabel = new JLabel();
        logoLabel = new JLabel();
        generateReportLabel2 = new JLabel();
        generateReportLabel3 = new JLabel();
        generateReportLabel = new JLabel();
        generateReportLabel1 = new JLabel();
        logOutIconButton = new JButton();
        logOutIcon = new JLabel();
        profileIconButton = new JButton();
        profileIcon = new JLabel();
        creamContainer = new JLabel();
        waveBg = new JLabel();
        BlueBackGround = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setResizable(false);
        setSize(new Dimension(961, 540));
        getContentPane().setLayout(new AbsoluteLayout());

        closeAppButton.setBackground(Colors.darkBlue);
        closeAppButton.setFont(new Font("Arial", 1, 25)); // NOI18N
        closeAppButton.setForeground(Colors.creamWhiteText);
        closeAppButton.setText("Cerrar programa");
        closeAppButton.setBorder(BorderFactory.createEmptyBorder(2, 100, 2, 14));
        closeAppButton.setContentAreaFilled(false);
        closeAppButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeAppButton.setFocusable(false);
        closeAppButton.setHorizontalAlignment(SwingConstants.LEFT);
        closeAppButton.setMargin(new Insets(2, 100, 2, 14));
        closeAppButton.setMaximumSize(new Dimension(135, 36));
        closeAppButton.setMinimumSize(new Dimension(135, 36));
        closeAppButton.setPreferredSize(new Dimension(340, 75));
        closeAppButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeAppButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeAppButton, new AbsoluteConstraints(520, 330, -1, -1));

        viewReportsButton.setBackground(Colors.darkBlue);
        viewReportsButton.setFont(new Font("Arial", 1, 25)); // NOI18N
        viewReportsButton.setForeground(Colors.creamWhiteText);
        viewReportsButton.setText("Ver reportes");
        viewReportsButton.setBorder(BorderFactory.createEmptyBorder(2, 100, 2, 14));
        viewReportsButton.setContentAreaFilled(false);
        viewReportsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        viewReportsButton.setFocusable(false);
        viewReportsButton.setHorizontalAlignment(SwingConstants.LEFT);
        viewReportsButton.setMargin(new Insets(2, 100, 2, 14));
        viewReportsButton.setMaximumSize(new Dimension(135, 36));
        viewReportsButton.setMinimumSize(new Dimension(135, 36));
        viewReportsButton.setPreferredSize(new Dimension(340, 75));
        viewReportsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewReportsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewReportsButton, new AbsoluteConstraints(520, 230, -1, -1));

        viewReportsLabel.setFont(new Font("Arial", 1, 25)); // NOI18N
        viewReportsLabel.setForeground(Colors.darkBlue);
        viewReportsLabel.setOpaque(true);
        viewReportsLabel.setPreferredSize(new Dimension(340, 75));
        viewReportsLabel.setSize(new Dimension(340, 75));
        new SetImageLabel().SetImage(viewReportsLabel, "/resources/magBar.png");
        getContentPane().add(viewReportsLabel, new AbsoluteConstraints(520, 230, -1, -1));

        closeAppLabel.setFont(new Font("Arial", 1, 25)); // NOI18N
        closeAppLabel.setForeground(Colors.darkBlue);
        closeAppLabel.setOpaque(true);
        closeAppLabel.setPreferredSize(new Dimension(340, 75));
        closeAppLabel.setSize(new Dimension(340, 75));
        new SetImageLabel().SetImage(closeAppLabel, "/resources/powBar.png");
        getContentPane().add(closeAppLabel, new AbsoluteConstraints(520, 330, -1, -1));

        logoLabel.setText("jLabel1");
        logoLabel.setPreferredSize(new Dimension(393, 256));
        logoLabel.setSize(new Dimension(393, 256));
        new SetImageLabel().SetImage(logoLabel,"/resources/nobgicon.png");
        getContentPane().add(logoLabel, new AbsoluteConstraints(30, 200, -1, -1));

        generateReportLabel2.setFont(new Font("Arial", 1, 25)); // NOI18N
        generateReportLabel2.setForeground(Colors.darkBlue);
        generateReportLabel2.setText("¿Qué desea hacer?");
        getContentPane().add(generateReportLabel2, new AbsoluteConstraints(580, 150, -1, -1));

        generateReportLabel3.setFont(new Font("Arial", 1, 30)); // NOI18N
        generateReportLabel3.setForeground(Colors.creamWhiteText);
        generateReportLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        generateReportLabel3.setText("CargoMara C.A");
        generateReportLabel3.setPreferredSize(new Dimension(280, 29));
        getContentPane().add(generateReportLabel3, new AbsoluteConstraints(90, 130, 280, 50));

        generateReportLabel.setFont(new Font("Arial", 1, 25)); // NOI18N
        generateReportLabel.setForeground(Colors.creamWhiteText);
        generateReportLabel.setHorizontalAlignment(SwingConstants.CENTER);
        generateReportLabel.setText("Sistema de gestión de");
        generateReportLabel.setPreferredSize(new Dimension(280, 29));
        getContentPane().add(generateReportLabel, new AbsoluteConstraints(90, 70, 280, -1));

        generateReportLabel1.setFont(new Font("Arial", 1, 25)); // NOI18N
        generateReportLabel1.setForeground(Colors.creamWhiteText);
        generateReportLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        generateReportLabel1.setText("reportes de incidencias");
        generateReportLabel1.setPreferredSize(new Dimension(280, 29));
        getContentPane().add(generateReportLabel1, new AbsoluteConstraints(90, 100, -1, -1));

        logOutIconButton.setBorderPainted(false);
        logOutIconButton.setContentAreaFilled(false);
        logOutIconButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logOutIconButton.setFocusable(false);
        logOutIconButton.setPreferredSize(new Dimension(70, 84));
        logOutIconButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logOutIconButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutIconButton, new AbsoluteConstraints(830, 20, -1, -1));

        logOutIcon.setPreferredSize(new Dimension(70, 84));
        logOutIcon.setSize(70,84);
        new SetImageLabel().SetImage(logOutIcon, "/resources/LogOut.png");
        getContentPane().add(logOutIcon, new AbsoluteConstraints(830, 20, -1, -1));

        profileIconButton.setBorderPainted(false);
        profileIconButton.setContentAreaFilled(false);
        profileIconButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        profileIconButton.setFocusable(false);
        profileIconButton.setPreferredSize(new Dimension(70, 84));
        profileIconButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                profileIconButtonActionPerformed(evt);
            }
        });
        getContentPane().add(profileIconButton, new AbsoluteConstraints(730, 20, -1, -1));

        profileIcon.setPreferredSize(new Dimension(70, 84));
        profileIcon.setSize(70,84);
        new SetImageLabel().SetImage(profileIcon, "/resources/EditProfile.png");
        getContentPane().add(profileIcon, new AbsoluteConstraints(730, 20, -1, -1));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new Dimension(444, 360));
        getContentPane().add(creamContainer, new AbsoluteConstraints(451, 130, 470, -1));

        waveBg.setPreferredSize(new Dimension(961, 540));
        waveBg.setSize(new Dimension(961,540));
        new SetImageLabel().SetImage(waveBg, "/resources/BgBig.png");
        getContentPane().add(waveBg, new AbsoluteConstraints(0, 0, -1, -1));

        BlueBackGround.setBackground(Colors.darkBlue);
        BlueBackGround.setPreferredSize(new Dimension(961, 540));

        GroupLayout BlueBackGroundLayout = new GroupLayout(BlueBackGround);
        BlueBackGround.setLayout(BlueBackGroundLayout);
        BlueBackGroundLayout.setHorizontalGroup(BlueBackGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        BlueBackGroundLayout.setVerticalGroup(BlueBackGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(BlueBackGround, new AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileIconButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_profileIconButtonActionPerformed
        dispose();
        try {
            new EditProfile(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(WelcomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_profileIconButtonActionPerformed

    private void logOutIconButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_logOutIconButtonActionPerformed
        dispose();
        new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_logOutIconButtonActionPerformed

    private void closeAppButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_closeAppButtonActionPerformed
        dispose();
        
    }//GEN-LAST:event_closeAppButtonActionPerformed

    private void viewReportsButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_viewReportsButtonActionPerformed
        dispose();
        try {
            new ReportList1(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(WelcomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewReportsButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public JPanel BlueBackGround;
    public JButton closeAppButton;
    public JLabel closeAppLabel;
    public JLabel creamContainer;
    public JLabel generateReportLabel;
    public JLabel generateReportLabel1;
    public JLabel generateReportLabel2;
    public JLabel generateReportLabel3;
    public JLabel logOutIcon;
    public JButton logOutIconButton;
    public JLabel logoLabel;
    public JLabel profileIcon;
    public JButton profileIconButton;
    public JButton viewReportsButton;
    public JLabel viewReportsLabel;
    public JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
