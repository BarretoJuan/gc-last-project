/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.views;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import proyecto.db.Caller;
import proyecto.entities.DetailedReport;
import proyecto.entities.Report;
import proyecto.entities.User;
import proyecto.utils.Colors;
import proyecto.utils.JFrameSaver;
import proyecto.utils.Message;
import proyecto.utils.ReportType;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.SetImageLabel;
import proyecto.utils.Verify;
import proyecto.verifications.ContentVerifications;

/**
 *
 * @author juan
 */
public class DetailedReportView extends javax.swing.JFrame {
    private User user;
    private int id;

    public DetailedReportView(int id, User user) {
        this.user=user;
        this.id=id;
        DetailedReport report = new Caller().getDetailedReport(id);
        initComponents();
        reportTitleInfo.setText(report.getReportTitle());
        reportTypeInfo.setText(new ReportType().getType(report.getReportType()));
        reporterInfo.setText(report.getReportAuthor());
        dateInfo.setText(report.getReportTimestamp());
        telephoneInfo.setText(report.getContact_phone());
        jTextArea3.setText(report.getAnswerBodyText());
        jTextArea2.setText(report.getReportBodyText());
        
        if(!jTextArea3.getText().isEmpty()) { // if textarea 3 is not empty, then disable both the text area and the button
            jTextArea3.setDisabledTextColor(Colors.darkBlue);
            jTextArea3.setEnabled(false);
            uploadReportButton.setText("");
            uploadReportButton.setOpaque(false);
            uploadReportButton.setEnabled(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        backIcon = new javax.swing.JLabel();
        generateReportLabel1 = new javax.swing.JLabel();
        exportReportButton = new javax.swing.JButton();
        reporterInfo = new javax.swing.JLabel();
        reporterReference = new javax.swing.JLabel();
        dateInfo = new javax.swing.JLabel();
        reportTitleInfo = new javax.swing.JLabel();
        uploadReportButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        telephoneLabel = new javax.swing.JLabel();
        telephoneInfo = new javax.swing.JLabel();
        reportTypeInfo = new javax.swing.JLabel();
        reportTypeLabel = new javax.swing.JLabel();
        generateReportLabel = new javax.swing.JLabel();
        logOutIconButton = new javax.swing.JButton();
        logOutIcon = new javax.swing.JLabel();
        profileIconButton = new javax.swing.JButton();
        profileIcon = new javax.swing.JLabel();
        logoPicButton = new javax.swing.JButton();
        logoPic = new javax.swing.JLabel();
        creamContainer2 = new javax.swing.JLabel();
        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        BlueBackGround = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Detallada Reporte");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(961, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusable(false);
        backButton.setPreferredSize(new java.awt.Dimension(70, 84));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        backIcon.setPreferredSize(new java.awt.Dimension(70, 84));
        backIcon.setSize(70,84);
        new SetImageLabel().SetImage(backIcon, "/resources/back.png");
        getContentPane().add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        generateReportLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        generateReportLabel1.setForeground(Colors.darkBlue);
        generateReportLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generateReportLabel1.setText("Respuesta del Reporte");
        getContentPane().add(generateReportLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 155, -1, -1));

        exportReportButton.setBackground(Colors.darkBlue);
        exportReportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        exportReportButton.setForeground(Colors.creamWhiteText);
        exportReportButton.setText("EXPORTAR REPORTE");
        exportReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportReportButton.setFocusable(false);
        exportReportButton.setMaximumSize(new java.awt.Dimension(135, 36));
        exportReportButton.setMinimumSize(new java.awt.Dimension(135, 36));
        exportReportButton.setPreferredSize(new java.awt.Dimension(135, 36));
        exportReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportReportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exportReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 170, -1));

        reporterInfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reporterInfo.setForeground(Colors.darkBlue);
        reporterInfo.setText("REPORTER_INFO");
        reporterInfo.setPreferredSize(new java.awt.Dimension(500, 23));
        getContentPane().add(reporterInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, -1));

        reporterReference.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        reporterReference.setForeground(Colors.darkBlue);
        reporterReference.setText("De:");
        reporterReference.setPreferredSize(new java.awt.Dimension(500, 23));
        getContentPane().add(reporterReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 30, -1));

        dateInfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dateInfo.setForeground(Colors.darkBlue);
        dateInfo.setText("DATE_INFO");
        dateInfo.setPreferredSize(new java.awt.Dimension(500, 23));
        getContentPane().add(dateInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 210, -1));

        reportTitleInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportTitleInfo.setForeground(Colors.darkBlue);
        reportTitleInfo.setText("REPORT_TITLE");
        reportTitleInfo.setPreferredSize(new java.awt.Dimension(500, 23));
        getContentPane().add(reportTitleInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 350, -1));

        uploadReportButton.setBackground(Colors.darkBlue);
        uploadReportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uploadReportButton.setForeground(Colors.creamWhiteText);
        uploadReportButton.setText("RESPONDER REPORTE");
        uploadReportButton.setBorder(null);
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
        getContentPane().add(uploadReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 170, 30));

        jScrollPane3.setBackground(Colors.creamWhiteText);
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.darkBlue));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane3.setPreferredSize(new java.awt.Dimension(749, 105));

        jTextArea3.setBackground(Colors.creamWhiteText);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextArea3.setForeground(Colors.darkBlue);
        jTextArea3.setRows(5);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setDisabledTextColor(Colors.darkBlue);
        jTextArea3.setMargin(new java.awt.Insets(2, 10, 2, 2));
        // jTextArea3.setInputVerifier(new Verify.ReportBodyVerifier());
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 200, 220, 190));

        jScrollPane2.setBackground(Colors.creamWhiteText);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.darkBlue));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(749, 105));

        jTextArea2.setBackground(Colors.creamWhiteText);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextArea2.setForeground(Colors.darkBlue);
        jTextArea2.setRows(5);
        jTextArea2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in nisl non dolor laoreet rhoncus nec a lacus. Curabitur facilisis faucibus odio. Phasellus ut magna sit amet nulla venenatis pretium. Nunc efficitur neque nec consequat convallis. Vivamus id congue sem. Donec euismod lectus ac ligula mattis convallis. Nam aliquet scelerisque enim, sed pulvinar urna facilisis vel. Ut eget justo tempor, volutpat arcu a, sollicitudin mi. Ut et volutpat augue. Quisque gravida odio sit amet mauris cursus aliquet. Nunc dolor turpis, suscipit a suscipit vitae, interdum sit amet enim. Vivamus eu odio non augue tempor laoreet vitae non tellus. Curabitur rhoncus dolor ante, eu fringilla libero hendrerit ac. In massa ante, maximus vel tincidunt bibendum, dignissim sed turpis.\n\nVivamus eleifend egestas lorem vel placerat. Mauris sagittis nunc sit amet nunc mattis venenatis. Donec dictum laoreet dolor sed condimentum. Pellentesque vel gravida massa, congue dignissim tellus. Praesent arcu arcu, imperdiet vitae nisi in, accumsan ultrices lectus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pharetra, elit sit amet feugiat consectetur, est justo ornare justo, eu finibus augue sem non neque. Aliquam ac massa commodo, semper justo vitae, tincidunt dolor. Morbi pellentesque enim nisi, vitae facilisis sem convallis viverra. Mauris condimentum porta ex a tincidunt. Sed nec felis urna. Praesent mollis ante mi, at interdum sem mattis id. Duis at nunc suscipit, facilisis elit vitae, suscipit justo.\n\nEtiam facilisis nulla ut posuere vulputate. Quisque congue mollis tellus, vel dignissim nulla maximus sed. Pellentesque in rutrum diam. Proin gravida in libero cursus euismod. Nam sit amet sapien pellentesque, rhoncus orci rutrum, gravida augue. Nunc nec lorem fermentum sapien viverra interdum. Integer ultricies porta enim, eget sollicitudin neque lacinia vitae. Duis et ultrices lorem. Morbi auctor, nunc porta blandit lacinia, justo nulla placerat urna, cursus vulputate ipsum odio eu diam. Donec risus sapien, venenatis ut mi vel, finibus congue lorem. Etiam commodo nisi ac tempus sagittis.\n\nAliquam rhoncus nec dui et ultricies. Aliquam pulvinar blandit lacinia. Etiam in faucibus tortor, et bibendum tellus. Vivamus aliquam lorem dictum eros viverra, vel tristique mi dignissim. Ut viverra dui vel turpis suscipit eleifend at non ipsum. Sed venenatis rhoncus auctor. Integer facilisis cursus massa sed imperdiet. Phasellus sagittis quam in eleifend viverra. Sed id magna at nunc vestibulum imperdiet nec interdum ligula. Donec congue iaculis nulla sed sagittis. Cras et congue diam.\n\nDuis euismod neque et imperdiet imperdiet. Nunc rutrum ipsum dui. Nullam porta purus dapibus, tristique risus sit amet, hendrerit tellus. Duis rhoncus magna gravida, pulvinar arcu nec, dapibus urna. Sed pharetra justo eget ex vulputate consequat. Quisque congue neque quis ante rutrum viverra. Ut diam mi, ultrices id massa vitae, auctor maximus ex. Nunc congue, libero bibendum mattis maximus, metus magna sagittis dui, ut lacinia tellus sapien placerat nisl. Aenean eleifend velit id blandit feugiat. Morbi elementum ex ex, vitae sodales risus imperdiet vel. Ut lorem enim, ultricies id nulla nec, malesuada tempor odio. Sed elit lorem, dignissim eu posuere vitae, laoreet ut ligula. ");
        jTextArea2.setCaretPosition(0);
        jTextArea2.setDisabledTextColor(Colors.darkBlue);
        jTextArea2.setEnabled(false);
        jTextArea2.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 580, 140));

        telephoneLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telephoneLabel.setForeground(Colors.darkBlue);
        telephoneLabel.setText("Número de teléfono de contacto:");
        getContentPane().add(telephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        telephoneInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telephoneInfo.setForeground(Colors.darkBlue);
        telephoneInfo.setText("TELEPHONE_INFO");
        telephoneInfo.setPreferredSize(new java.awt.Dimension(250, 17));
        getContentPane().add(telephoneInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        reportTypeInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportTypeInfo.setForeground(Colors.darkBlue);
        reportTypeInfo.setText("REPORT_TYPE");
        reportTypeInfo.setPreferredSize(new java.awt.Dimension(250, 17));
        getContentPane().add(reportTypeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        reportTypeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportTypeLabel.setForeground(Colors.darkBlue);
        reportTypeLabel.setText("Tipo de reporte:");
        getContentPane().add(reportTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        generateReportLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        generateReportLabel.setForeground(Colors.darkBlue);
        generateReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generateReportLabel.setText("Reporte");
        getContentPane().add(generateReportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

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

        creamContainer2.setBackground(Colors.creamWhite);
        creamContainer2.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer2.setPreferredSize(new java.awt.Dimension(249, 346));
        creamContainer2.setRequestFocusEnabled(false);
        getContentPane().add(creamContainer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 135, -1, 380));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new java.awt.Dimension(625, 346));
        creamContainer.setRequestFocusEnabled(false);
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 135, -1, 380));

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
       dispose();

        try {
            new WelcomeView(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DetailedReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoPicButtonActionPerformed

    private void profileIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileIconButtonActionPerformed

        dispose();
        try {
            new EditProfile(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DetailedReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profileIconButtonActionPerformed

    private void logOutIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutIconButtonActionPerformed
        dispose();  
        new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_logOutIconButtonActionPerformed

    private void uploadReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadReportButtonActionPerformed
        String text = jTextArea3.getText();
        boolean verifyText = new ContentVerifications().verifyBodyAndAnswer(text);
        
        
        
        if (verifyText) { 
            String body = jTextArea3.getText();
            Message message = null;
            
            try {
                message = new Caller().insertAnswer(body,user.getId(), id);
            } catch (SQLException ex) {
                Logger.getLogger(DetailedReportView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (message.getStatus()) {
            dispose();
                try {
                    new ReportList1(user).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DetailedReportView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }   
       
    }//GEN-LAST:event_uploadReportButtonActionPerformed

    private void exportReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportReportButtonActionPerformed
        new JFrameSaver().saveJFrameAsPNG(this); // TODO add your handling code here:
    }//GEN-LAST:event_exportReportButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        try {
            new ReportList1(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DetailedReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BlueBackGround;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel creamContainer;
    private javax.swing.JLabel creamContainer2;
    private javax.swing.JLabel dateInfo;
    private javax.swing.JButton exportReportButton;
    private javax.swing.JLabel generateReportLabel;
    private javax.swing.JLabel generateReportLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JButton logOutIconButton;
    private javax.swing.JLabel logoPic;
    private javax.swing.JButton logoPicButton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JButton profileIconButton;
    private javax.swing.JLabel reportTitleInfo;
    private javax.swing.JLabel reportTypeInfo;
    private javax.swing.JLabel reportTypeLabel;
    private javax.swing.JLabel reporterInfo;
    private javax.swing.JLabel reporterReference;
    private javax.swing.JLabel telephoneInfo;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JButton uploadReportButton;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
