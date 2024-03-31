package proyecto.views;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import proyecto.db.Caller;
import proyecto.db.Hasher;
import proyecto.entities.User;
import proyecto.utils.Colors;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.RoundedLineBorderVoid;
import proyecto.utils.SetImageLabel;
import proyecto.utils.ShowHint;
import proyecto.utils.Verify;
import proyecto.verifications.KeyVerifications;


public class EditProfile extends javax.swing.JFrame {
    private User user;
    public EditProfile(User user) throws SQLException{
        this.user = user;
        initComponents();
        nameField.setText(user.getName());
        nameField.setCaretPosition(0);
        
        cedulaField.setText(user.getCi());
        cedulaField.setCaretPosition(0);
        
        usernameField.setText(user.getUsername());
        usernameField.setCaretPosition(0);
        
        emailField.setText(user.getEmail());
        emailField.setCaretPosition(0);  
        
        KeyVerifications kVerificator = new KeyVerifications();
        kVerificator.verifyUsermane(usernameField);
        kVerificator.verifyName(nameField);
        kVerificator.verifyEmail(emailField);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPicButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        nameIcon = new javax.swing.JLabel();
        nameField = new javax.swing.JFormattedTextField();
        cedulaIcon = new javax.swing.JLabel();
        cedulaField = new javax.swing.JFormattedTextField();
        usernameIcon = new javax.swing.JLabel();
        usernameField = new javax.swing.JFormattedTextField();
        emailIcon = new javax.swing.JLabel();
        emailField = new javax.swing.JFormattedTextField();
        passwordIcon = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        newPasswordIcon = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        repPasswordIcon = new javax.swing.JLabel();
        repPasswordField = new javax.swing.JPasswordField();
        bienvenidoLabel = new javax.swing.JLabel();
        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        panelFondoAzul = new javax.swing.JPanel();
        logoPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Perfil");
        setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPicButton.setBorderPainted(false);
        logoPicButton.setContentAreaFilled(false);
        logoPicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoPicButton.setFocusPainted(false);
        logoPicButton.setFocusable(false);
        logoPicButton.setPreferredSize(new java.awt.Dimension(397, 132));
        logoPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoPicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoPicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginButton.setBackground(Colors.darkBlue);
        loginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginButton.setForeground(Colors.creamWhiteText);
        loginButton.setText("CONFIRMAR CAMBIOS");
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
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 180, 40));

        nameIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        nameIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        nameIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        nameIcon.setSize(34,36);
        new SetImageLabel().SetImage(nameIcon,"/resources/ProfileIcon.png");
        getContentPane().add(nameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 220, -1, -1));

        nameField.setBackground(Colors.creamWhite);
        Border line = javax.swing.BorderFactory.createLineBorder(Colors.darkBlue);
        Border empty = new EmptyBorder(2, 20, 2, 2);
        CompoundBorder border = new CompoundBorder(line, empty);
        nameField.setBorder(border);
        nameField.setForeground(Colors.darkBlue);
        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameField.setOpaque(false);
        nameField.setPreferredSize(new java.awt.Dimension(200, 36));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("NOMBRE", nameField);
        nameField.setInputVerifier(new Verify.NameVerifier());
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        cedulaIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setSize(34,36);
        new SetImageLabel().SetImage(cedulaIcon,"/resources/IdIcon.png");
        getContentPane().add(cedulaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 260, -1, -1));

        cedulaField.setBackground(Colors.creamWhite);
        cedulaField.setBorder(border);
        cedulaField.setForeground(Colors.darkBlue);
        cedulaField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaField.setEnabled(false);
        cedulaField.setFocusable(false);
        cedulaField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cedulaField.setOpaque(false);
        cedulaField.setPreferredSize(new java.awt.Dimension(200, 36));
        cedulaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("CÉDULA", cedulaField);
        cedulaField.setInputVerifier(new Verify.CedulaVerifier());
        getContentPane().add(cedulaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, -1));

        usernameIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        usernameIcon.setSize(34,36);
        new SetImageLabel().SetImage(usernameIcon,"/resources/ProfileIcon.png");
        getContentPane().add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 300, -1, -1));

        usernameField.setBackground(Colors.creamWhite);
        usernameField.setBorder(border);
        usernameField.setForeground(Colors.darkBlue);
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameField.setOpaque(false);
        usernameField.setPreferredSize(new java.awt.Dimension(200, 36));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("USUARIO", usernameField);
        usernameField.setInputVerifier(new Verify.UsernameVerifier());
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        emailIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        emailIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        emailIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        emailIcon.setSize(34,36);
        new SetImageLabel().SetImage(emailIcon,"/resources/MailIcon.png");
        getContentPane().add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 340, -1, -1));

        emailField.setBackground(Colors.creamWhite);
        emailField.setBorder(border);
        emailField.setForeground(Colors.darkBlue);
        emailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailField.setOpaque(false);
        emailField.setPreferredSize(new java.awt.Dimension(200, 36));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("EMAIL", emailField);
        emailField.setInputVerifier(new Verify.EmailVerifier());
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        passwordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        passwordIcon.setSize(34,36);
        new SetImageLabel().SetImage(passwordIcon,"/resources/PasswordIcon.png");
        getContentPane().add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 380, -1, -1));

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordField.setForeground(Colors.darkBlue);
        passwordField.setBackground(Colors.creamWhite);
        passwordField.setBorder(border);
        passwordField.setOpaque(false);
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setMaximumSize(new java.awt.Dimension(152, 36));
        passwordField.setMinimumSize(new java.awt.Dimension(152, 36));
        passwordField.setPreferredSize(new java.awt.Dimension(200, 36));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("CONTRASEÑA", passwordField);
        passwordField.setInputVerifier(new Verify.PasswordVerifier());
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        newPasswordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        newPasswordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        newPasswordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        newPasswordIcon.setSize(34,36);
        new SetImageLabel().SetImage(newPasswordIcon,"/resources/PasswordIcon.png");
        getContentPane().add(newPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 420, -1, -1));

        newPasswordField.setFont(new java.awt.Font("Arial", 1, 14));
        newPasswordField.setForeground(Colors.darkBlue);
        newPasswordField.setBackground(Colors.creamWhite);
        newPasswordField.setBorder(border);
        newPasswordField.setOpaque(false);
        newPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newPasswordField.setMaximumSize(new java.awt.Dimension(152, 36));
        newPasswordField.setMinimumSize(new java.awt.Dimension(152, 36));
        newPasswordField.setPreferredSize(new java.awt.Dimension(200, 36));
        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("NUEVA CONTRASEÑA", newPasswordField);
        newPasswordField.setInputVerifier(new Verify.PasswordVerifier());
        getContentPane().add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        repPasswordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setSize(34,36);
        new SetImageLabel().SetImage(repPasswordIcon,"/resources/RepPasswordIcon.png");
        getContentPane().add(repPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 460, -1, -1));

        repPasswordField.setFont(new java.awt.Font("Arial", 1, 14));
        repPasswordField.setForeground(Colors.darkBlue);
        repPasswordField.setBackground(Colors.creamWhite);
        repPasswordField.setBorder(border);
        repPasswordField.setOpaque(false);
        repPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        repPasswordField.setMaximumSize(new java.awt.Dimension(152, 36));
        repPasswordField.setMinimumSize(new java.awt.Dimension(152, 36));
        repPasswordField.setPreferredSize(new java.awt.Dimension(200, 36));
        repPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repPasswordFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("REPETIR CONTRASEÑA", repPasswordField);
        repPasswordField.setInputVerifier(new Verify.PasswordVerifier());
        getContentPane().add(repPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        bienvenidoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bienvenidoLabel.setForeground(Colors.darkBlue);
        bienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidoLabel.setText("EDITAR PERFIL");
        bienvenidoLabel.setToolTipText("");
        bienvenidoLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(bienvenidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, -1));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new java.awt.Dimension(297, 391));
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 430));

        waveBg.setMaximumSize(new java.awt.Dimension(400, 508));
        waveBg.setMinimumSize(new java.awt.Dimension(400, 508));
        waveBg.setPreferredSize(new java.awt.Dimension(400, 508));
        waveBg.setSize(400,508);
        new SetImageLabel().SetImage(waveBg,"/resources/BgSmall2.png");
        getContentPane().add(waveBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 400, 508));

        panelFondoAzul.setBackground(Colors.darkBlue);
        panelFondoAzul.setPreferredSize(new java.awt.Dimension(200, 300));

        logoPic.setMaximumSize(new java.awt.Dimension(397, 132));
        logoPic.setMinimumSize(new java.awt.Dimension(397, 132));
        logoPic.setPreferredSize(new java.awt.Dimension(397, 132));

        javax.swing.GroupLayout panelFondoAzulLayout = new javax.swing.GroupLayout(panelFondoAzul);
        panelFondoAzul.setLayout(panelFondoAzulLayout);
        panelFondoAzulLayout.setHorizontalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoAzulLayout.createSequentialGroup()
                .addComponent(logoPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFondoAzulLayout.setVerticalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoAzulLayout.createSequentialGroup()
                .addComponent(logoPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        logoPic.setSize(397, 132);
        new SetImageLabel().SetImage(logoPic, "/resources/Logo3.png");

        getContentPane().add(panelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
         String name = nameField.getText();
        String username = usernameField.getText();
        String email = emailField.getText();
        String currentPassword = user.getPasswordHash();
        String enteredPassword = String.valueOf(passwordField.getPassword()); 
        String verifyPassword = Hasher.hash(enteredPassword);
        
        String newPassword = String.valueOf(newPasswordField.getPassword());
        String repNewPassword = String.valueOf(repPasswordField.getPassword());
        
        String hashedNewPassword = Hasher.hash(newPassword);
        int currentUid = user.getId(); 
        
        
        
        //name password username email false
        

        if (name.isEmpty() || username.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Asegúrese de llenar los campos de nombre, nombre de usuario e email", "Alerta:", JOptionPane.WARNING_MESSAGE);
        return;
        }
        System.out.println("Contrasenai ingresada" + enteredPassword);
        System.out.println("CONTRASEÑA ACTUAL: "+currentPassword);
        System.out.println("CONTRASE;A INGRESADA: "+verifyPassword);
        
        if(currentPassword.equals(verifyPassword)) {
            if(newPassword.isEmpty() && repNewPassword.isEmpty()) {
                //modify with current password
                try {
                    new Caller().modifyUser(name, currentPassword, username, email, currentUid, true);
                    user.setName(name);
                    user.setUsername(username);
                    user.setEmail(email);
                    dispose();
                    new EditProfile(user).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
                
              
            }
            else {
                if(newPassword.equals(repNewPassword)) {
                    try {
                    new Caller().modifyUser(name, hashedNewPassword, username, email, currentUid, true);
                    user.setName(name);
                    user.setPasswordHash(hashedNewPassword);
                    user.setUsername(username);
                    user.setEmail(email);
                    dispose();
                    new EditProfile(user).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
                   
                }
                }
                else {
                JOptionPane.showMessageDialog(null, "La nueva contraseña y su verificación no coinciden", "Alerta:", JOptionPane.WARNING_MESSAGE);
                }
            }
        
        }
        else {
            if(enteredPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Introduzca su contraseña para modificar el perfil", "Alerta:", JOptionPane.WARNING_MESSAGE);       
            }
            else{
                System.out.println(enteredPassword);
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Alerta:", JOptionPane.WARNING_MESSAGE);
            }
            

        }

   
        
        nameField.setText(user.getName());
        nameField.setCaretPosition(0);
        
        cedulaField.setText(user.getCi());
        cedulaField.setCaretPosition(0);
        
        usernameField.setText(user.getUsername());
        usernameField.setCaretPosition(0);
        
        emailField.setText(user.getEmail());
        emailField.setCaretPosition(0);     
        
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void cedulaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaFieldActionPerformed

    private void repPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repPasswordFieldActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void logoPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoPicButtonActionPerformed

        dispose();

        try {
            new WelcomeView(user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoPicButtonActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JFormattedTextField cedulaField;
    private javax.swing.JLabel cedulaIcon;
    private javax.swing.JLabel creamContainer;
    private javax.swing.JFormattedTextField emailField;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoPic;
    private javax.swing.JButton logoPicButton;
    private javax.swing.JFormattedTextField nameField;
    private javax.swing.JLabel nameIcon;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordIcon;
    private javax.swing.JPanel panelFondoAzul;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPasswordField repPasswordField;
    private javax.swing.JLabel repPasswordIcon;
    private javax.swing.JFormattedTextField usernameField;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
