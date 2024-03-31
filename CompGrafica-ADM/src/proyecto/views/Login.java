package proyecto.views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import proyecto.db.Caller;
import proyecto.db.Hasher;
import proyecto.entities.User;
import proyecto.utils.Colors;
import proyecto.utils.Message;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.RoundedLineBorderVoid;
import proyecto.utils.SetImageLabel;
import proyecto.utils.ShowHint;
import proyecto.utils.Verify;
import proyecto.verifications.KeyVerifications;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        KeyVerifications kVerificator = new KeyVerifications();
        kVerificator.verifyUsermane(usernameField);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoPic = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordIcon = new javax.swing.JLabel();
        usernameIcon = new javax.swing.JLabel();
        usernameField = new javax.swing.JFormattedTextField();
        passwordField = new javax.swing.JPasswordField();
        inicioClienteLabel = new javax.swing.JLabel();
        bienvenidoLabel = new javax.swing.JLabel();
        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        panelFondoAzul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin - Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel1.setSize(new java.awt.Dimension(60,60));

        new SetImageLabel().SetImage(jLabel1, "/resources/powBtn.png");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        logoPic.setText("jLabel1");
        logoPic.setMaximumSize(new java.awt.Dimension(249, 167));
        logoPic.setMinimumSize(new java.awt.Dimension(249, 167));
        logoPic.setPreferredSize(new java.awt.Dimension(249, 167));
        getContentPane().add(logoPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));
        logoPic.setSize(249,167);
        new SetImageLabel().SetImage(logoPic, "/resources/Logo1.png");

        loginButton.setBackground(Colors.darkBlue);
        loginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginButton.setForeground(Colors.creamWhiteText);
        loginButton.setText("INICIAR SESION");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.setMaximumSize(new java.awt.Dimension(135, 36));
        loginButton.setMinimumSize(new java.awt.Dimension(135, 36));
        loginButton.setPreferredSize(new java.awt.Dimension(135, 36));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        passwordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        passwordIcon.setSize(34,36);
        new SetImageLabel().SetImage(passwordIcon,"/resources/PasswordIcon.png");
        getContentPane().add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        usernameIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        usernameIcon.setSize(34,36);
        new SetImageLabel().SetImage(usernameIcon,"/resources/ProfileIcon.png");
        getContentPane().add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        usernameField.setBackground(Colors.creamWhite);
        Border line = javax.swing.BorderFactory.createLineBorder(Colors.darkBlue);
        Border empty = new EmptyBorder(2, 20, 2, 2);
        CompoundBorder border = new CompoundBorder(line, empty);
        usernameField.setBorder(border);
        usernameField.setForeground(Colors.darkBlue);
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameField.setOpaque(false);
        usernameField.setPreferredSize(new java.awt.Dimension(152, 36));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("USUARIO", usernameField);
        usernameField.setInputVerifier(new Verify.UsernameVerifier());
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordField.setForeground(Colors.darkBlue);
        passwordField.setBackground(Colors.creamWhite);
        passwordField.setBorder(border);
        passwordField.setOpaque(false);
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setMaximumSize(new java.awt.Dimension(152, 36));
        passwordField.setMinimumSize(new java.awt.Dimension(152, 36));
        passwordField.setPreferredSize(new java.awt.Dimension(152, 36));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("CONTRASEÑA", passwordField);
        passwordField.setInputVerifier(new Verify.PasswordVerifier());
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        inicioClienteLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inicioClienteLabel.setForeground(Colors.darkBlue);
        inicioClienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioClienteLabel.setText("Inicio de Administrador");
        inicioClienteLabel.setToolTipText("");
        inicioClienteLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(inicioClienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, -1));

        bienvenidoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bienvenidoLabel.setForeground(Colors.darkBlue);
        bienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidoLabel.setText("BIENVENIDO");
        bienvenidoLabel.setToolTipText("");
        bienvenidoLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(bienvenidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 400, -1));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new java.awt.Dimension(297, 297));
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        waveBg.setMaximumSize(new java.awt.Dimension(400, 508));
        waveBg.setMinimumSize(new java.awt.Dimension(400, 508));
        waveBg.setPreferredSize(new java.awt.Dimension(400, 508));
        waveBg.setSize(400,508);
        new SetImageLabel().SetImage(waveBg,"/resources/BgSmall2.png");
        getContentPane().add(waveBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 400, 508));

        panelFondoAzul.setBackground(Colors.darkBlue);
        panelFondoAzul.setPreferredSize(new java.awt.Dimension(200, 300));

        javax.swing.GroupLayout panelFondoAzulLayout = new javax.swing.GroupLayout(panelFondoAzul);
        panelFondoAzul.setLayout(panelFondoAzulLayout);
        panelFondoAzulLayout.setHorizontalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelFondoAzulLayout.setVerticalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(panelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        char[] passwordArray = passwordField.getPassword();
        String password = String.valueOf(passwordArray);
        String hashedPassword = Hasher.hash(password);
        String username = usernameField.getText();
        
        Message response = null;
        try {
            response = new Caller().loginUser(username, hashedPassword, true);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        User user = null;
        if (response.getStatus() == true) {
            try {
                user = new Caller().getUser(username, true);
   
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            dispose();
            // Implement session
            WelcomeView r1;
            try {
                r1 = new WelcomeView(user);
                r1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
        }       // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JLabel creamContainer;
    private javax.swing.JLabel inicioClienteLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoPic;
    private javax.swing.JPanel panelFondoAzul;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JFormattedTextField usernameField;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
