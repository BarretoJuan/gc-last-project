/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.views;

import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import proyecto.utils.Colors;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.SetImageLabel;

/**
 *
 * @author juan
 */
public class ReportList extends javax.swing.JFrame {

    /**
     * Creates new form ReportGeneration
     */
    public ReportList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportBodyLabel = new javax.swing.JLabel();
        uploadReportButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        reportTitleTextfield = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        telephoneLabel = new javax.swing.JLabel();
        reportTypeCombo = new javax.swing.JComboBox<>();
        reportTitleLabel = new javax.swing.JLabel();
        reportTypeLabel = new javax.swing.JLabel();
        generateReportLabel = new javax.swing.JLabel();
        logOutIconButton = new javax.swing.JButton();
        logOutIcon = new javax.swing.JLabel();
        profileIconButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        logoPicButton = new javax.swing.JButton();
        logoPic = new javax.swing.JLabel();
        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        BlueBackGround = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar Reporte");
        setResizable(false);
        setSize(new java.awt.Dimension(961, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportBodyLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportBodyLabel.setForeground(Colors.darkBlue);
        reportBodyLabel.setText("Cuerpo del reporte");
        reportBodyLabel.setPreferredSize(new java.awt.Dimension(136, 23));
        getContentPane().add(reportBodyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        uploadReportButton.setBackground(Colors.darkBlue);
        uploadReportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uploadReportButton.setForeground(Colors.creamWhiteText);
        uploadReportButton.setText("SUBIR REPORTE");
        uploadReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadReportButton.setFocusable(false);
        uploadReportButton.setMaximumSize(new java.awt.Dimension(135, 36));
        uploadReportButton.setMinimumSize(new java.awt.Dimension(135, 36));
        uploadReportButton.setPreferredSize(new java.awt.Dimension(135, 36));
        uploadReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadReportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(153, 51, 0, 0));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.darkBlue));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(749, 105));

        jTextArea2.setBackground(Colors.creamWhite);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextArea2.setForeground(Colors.darkBlue);
        jTextArea2.setRows(5);
        jTextArea2.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        Border line = javax.swing.BorderFactory.createLineBorder(Colors.darkBlue);
        Border empty = new EmptyBorder(2, 5, 2, 2);
        CompoundBorder border = new CompoundBorder(line, empty);
        reportTitleTextfield.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        reportTitleTextfield.setForeground(Colors.darkBlue);
        reportTitleTextfield.setBorder(border);
        reportTitleTextfield.setOpaque(false);
        reportTitleTextfield.setPreferredSize(new java.awt.Dimension(169, 23));
        reportTitleTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTitleTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(reportTitleTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 235, -1, -1));

        telephoneField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        telephoneField.setForeground(Colors.darkBlue);
        telephoneField.setBorder(border);
        telephoneField.setOpaque(false);
        telephoneField.setPreferredSize(new java.awt.Dimension(250, 23));
        getContentPane().add(telephoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, -1, -1));

        telephoneLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telephoneLabel.setForeground(Colors.darkBlue);
        telephoneLabel.setText("Número de teléfono de contacto");
        getContentPane().add(telephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        reportTypeCombo.setBackground(Colors.creamWhite);
        reportTypeCombo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        reportTypeCombo.setForeground(Colors.darkBlue);
        reportTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de reporte" }));
        reportTypeCombo.setFocusable(false);
        reportTypeCombo.setOpaque(false);
        reportTypeCombo.setPreferredSize(new java.awt.Dimension(169, 23));
        getContentPane().add(reportTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 235, -1, -1));

        reportTitleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportTitleLabel.setForeground(Colors.darkBlue);
        reportTitleLabel.setText("Título de reporte:");
        getContentPane().add(reportTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        reportTypeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportTypeLabel.setForeground(Colors.darkBlue);
        reportTypeLabel.setText("Tipo de reporte:");
        getContentPane().add(reportTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        generateReportLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        generateReportLabel.setForeground(Colors.darkBlue);
        generateReportLabel.setText("Generación de Reportes");
        getContentPane().add(generateReportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 150, -1, -1));

        logOutIconButton.setBorderPainted(false);
        logOutIconButton.setContentAreaFilled(false);
        logOutIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutIconButton.setFocusable(false);
        logOutIconButton.setPreferredSize(new java.awt.Dimension(70, 84));
        logOutIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutIconButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutIconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        logOutIcon.setPreferredSize(new java.awt.Dimension(70, 84));
        logOutIcon.setSize(70,84);
        new SetImageLabel().SetImage(logOutIcon, "/resources/LogOut.png");
        getContentPane().add(logOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        profileIconButton.setBorderPainted(false);
        profileIconButton.setContentAreaFilled(false);
        profileIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileIconButton.setFocusable(false);
        profileIconButton.setPreferredSize(new java.awt.Dimension(70, 84));
        profileIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileIconButtonActionPerformed(evt);
            }
        });
        getContentPane().add(profileIconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        profileIcon.setPreferredSize(new java.awt.Dimension(70, 84));
        profileIcon.setSize(70,84);
        new SetImageLabel().SetImage(profileIcon, "/resources/EditProfile.png");
        getContentPane().add(profileIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        logoPicButton.setBackground(new java.awt.Color(255, 153, 0, 0));
        logoPicButton.setBorderPainted(false);
        logoPicButton.setContentAreaFilled(false);
        logoPicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoPicButton.setFocusable(false);
        logoPicButton.setPreferredSize(new java.awt.Dimension(375, 130));
        logoPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoPicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoPicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        logoPic.setPreferredSize(new java.awt.Dimension(375, 130));
        logoPic.setSize(375, 130);
        new SetImageLabel().SetImage(logoPic, "/resources/Logo3.png");
        getContentPane().add(logoPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new java.awt.Dimension(884, 346));
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 135, -1, -1));

        waveBg.setPreferredSize(new java.awt.Dimension(961, 540));
        waveBg.setSize(new Dimension(961,540));
        new SetImageLabel().SetImage(waveBg, "/resources/BgBig.png");
        getContentPane().add(waveBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BlueBackGround.setBackground(Colors.darkBlue);
        BlueBackGround.setPreferredSize(new java.awt.Dimension(961, 540));

        javax.swing.GroupLayout BlueBackGroundLayout = new javax.swing.GroupLayout(BlueBackGround);
        BlueBackGround.setLayout(BlueBackGroundLayout);
        BlueBackGroundLayout.setHorizontalGroup(
            BlueBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        BlueBackGroundLayout.setVerticalGroup(
            BlueBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(BlueBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoPicButtonActionPerformed
        System.out.println("Main menu button");
    }//GEN-LAST:event_logoPicButtonActionPerformed

    private void profileIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileIconButtonActionPerformed
        System.out.println("Edit profile button action");
    }//GEN-LAST:event_profileIconButtonActionPerformed

    private void logOutIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutIconButtonActionPerformed
        System.out.println("Log Out Button");        // TODO add your handling code here:
    }//GEN-LAST:event_logOutIconButtonActionPerformed

    private void reportTitleTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTitleTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTitleTextfieldActionPerformed

    private void uploadReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadReportButtonActionPerformed
        System.out.println("");        // TODO add your handling code here:
    }//GEN-LAST:event_uploadReportButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BlueBackGround;
    private javax.swing.JLabel creamContainer;
    private javax.swing.JLabel generateReportLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JButton logOutIconButton;
    private javax.swing.JLabel logoPic;
    private javax.swing.JButton logoPicButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JButton profileIconButton;
    private javax.swing.JLabel reportBodyLabel;
    private javax.swing.JLabel reportTitleLabel;
    private javax.swing.JTextField reportTitleTextfield;
    private javax.swing.JComboBox<String> reportTypeCombo;
    private javax.swing.JLabel reportTypeLabel;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JButton uploadReportButton;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
