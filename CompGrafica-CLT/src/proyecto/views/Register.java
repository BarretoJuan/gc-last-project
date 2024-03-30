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
import static proyecto.db.Hasher.hash;
import proyecto.utils.Colors;
import proyecto.utils.RoundedLineBorder;
import proyecto.utils.RoundedLineBorderVoid;
import proyecto.utils.SetImageLabel;
import proyecto.utils.ShowHint;
import proyecto.utils.Verify;


public class Register extends javax.swing.JFrame {
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        nameIcon = new javax.swing.JLabel();
        nameField = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        cedulaIcon = new javax.swing.JLabel();
        cedulaField = new javax.swing.JFormattedTextField();
        usernameIcon = new javax.swing.JLabel();
        usernameField = new javax.swing.JFormattedTextField();
        emailIcon = new javax.swing.JLabel();
        emailField = new javax.swing.JFormattedTextField();
        passwordIcon = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        repPasswordIcon = new javax.swing.JLabel();
        repPasswordField = new javax.swing.JPasswordField();
        inicioClienteLabel = new javax.swing.JLabel();
        bienvenidoLabel = new javax.swing.JLabel();
        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        panelFondoAzul = new javax.swing.JPanel();
        logoPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente - Register");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(Colors.darkBlue);
        loginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginButton.setForeground(Colors.creamWhiteText);
        loginButton.setText("REGISTRAR");
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
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 460, -1, -1));

        registerButton.setBackground(Colors.creamWhite);
        registerButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registerButton.setForeground(Colors.darkBlue);
        registerButton.setText("¡Inicia sesión aquí!");
        registerButton.setBorder(new RoundedLineBorderVoid(Colors.darkBlue, 1, 25, true));
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setFocusable(false);
        registerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerButton.setIconTextGap(1);
        registerButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        registerButton.setPreferredSize(new java.awt.Dimension(33, 28));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        registerButton.setSize(50,28);
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 120, 28));

        registerLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registerLabel.setForeground(Colors.darkBlue);
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("¿Ya tienes una cuenta? ");
        registerLabel.setToolTipText("");
        registerLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 500, 400, -1));

        nameIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        nameIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        nameIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        nameIcon.setSize(34,36);
        new SetImageLabel().SetImage(nameIcon,"/resources/ProfileIcon.png");
        getContentPane().add(nameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 210, -1, -1));

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
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jComboBox1.setBackground(Colors.creamWhite);
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setForeground(Colors.darkBlue);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " V", " E" }));
        jComboBox1.setFocusable(false);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(false);
        jComboBox1.setPreferredSize(new java.awt.Dimension(33, 36));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 50, -1));

        cedulaIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        cedulaIcon.setSize(34,36);
        new SetImageLabel().SetImage(cedulaIcon,"/resources/IdIcon.png");
        getContentPane().add(cedulaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 250, -1, -1));

        cedulaField.setBackground(Colors.creamWhite);
        cedulaField.setBorder(border);
        cedulaField.setForeground(Colors.darkBlue);
        cedulaField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cedulaField.setOpaque(false);
        cedulaField.setPreferredSize(new java.awt.Dimension(167, 36));
        cedulaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaFieldActionPerformed(evt);
            }
        });
        ShowHint.setHint("CÉDULA", cedulaField);
        cedulaField.setInputVerifier(new Verify.CedulaVerifier());
        getContentPane().add(cedulaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, -1));

        usernameIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        usernameIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        usernameIcon.setSize(34,36);
        new SetImageLabel().SetImage(usernameIcon,"/resources/ProfileIcon.png");
        getContentPane().add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 290, -1, -1));

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
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        emailIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        emailIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        emailIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        emailIcon.setSize(34,36);
        new SetImageLabel().SetImage(emailIcon,"/resources/MailIcon.png");
        getContentPane().add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 330, -1, -1));

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
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        passwordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        passwordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        passwordIcon.setSize(34,36);
        new SetImageLabel().SetImage(passwordIcon,"/resources/PasswordIcon.png");
        getContentPane().add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 370, -1, -1));

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
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        repPasswordIcon.setMaximumSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setMinimumSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setPreferredSize(new java.awt.Dimension(34, 36));
        repPasswordIcon.setSize(34,36);
        new SetImageLabel().SetImage(repPasswordIcon,"/resources/RepPasswordIcon.png");
        getContentPane().add(repPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 410, -1, -1));

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
        getContentPane().add(repPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        inicioClienteLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inicioClienteLabel.setForeground(Colors.darkBlue);
        inicioClienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioClienteLabel.setText("Registro de cliente");
        inicioClienteLabel.setToolTipText("");
        inicioClienteLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(inicioClienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 400, -1));

        bienvenidoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bienvenidoLabel.setForeground(Colors.darkBlue);
        bienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidoLabel.setText("BIENVENIDO");
        bienvenidoLabel.setToolTipText("");
        bienvenidoLabel.setPreferredSize(new java.awt.Dimension(151, 28));
        getContentPane().add(bienvenidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, -1));

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setBorder(new RoundedLineBorder(Colors.creamWhite, 1, 50, true));
        creamContainer.setPreferredSize(new java.awt.Dimension(297, 391));
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

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
                .addGap(0, 3, Short.MAX_VALUE))
        );
        panelFondoAzulLayout.setVerticalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoAzulLayout.createSequentialGroup()
                .addComponent(logoPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 468, Short.MAX_VALUE))
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

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        System.out.println("hehe"); 
        dispose();
        Login r1 = new Login();
        r1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       String nombre = nameField.getText();
       
       int index = jComboBox1.getSelectedIndex();
       String tipoId=null;
       if (index == 0) {
           tipoId = "V";             
       }
       else if (index ==1) {
           tipoId = "E";
       }
       
       String usuario = usernameField.getText();
       String rawId = cedulaField.getText();
       String id = tipoId+cedulaField.getText();
       String email = emailField.getText();
       
       char[] passwordArray = passwordField.getPassword();
       String password = String.valueOf(passwordArray);
       char[] confirmPasswordArray = repPasswordField.getPassword();
       String confirmPassword = String.valueOf(confirmPasswordArray);

       if(rawId.isEmpty() || usuario.isEmpty() || email.isEmpty() || nombre.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Rellene todos los campos para registrar a un usuario", "Alerta:", JOptionPane.WARNING_MESSAGE);  
       }
       else {
           if (password.equals(confirmPassword)) {
           String hashedPassword = hash(password);
           try {
               new Caller().insertClient(nombre,id,hashedPassword,usuario,email);
           } catch (SQLException ex) {
               Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
           }
           dispose();
           new Login().setVisible(true);
         }
       else {
        JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no coinciden", "Alerta:", JOptionPane.WARNING_MESSAGE);
       }
       }

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void repPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repPasswordFieldActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JFormattedTextField cedulaField;
    private javax.swing.JLabel cedulaIcon;
    private javax.swing.JLabel creamContainer;
    private javax.swing.JFormattedTextField emailField;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel inicioClienteLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoPic;
    private javax.swing.JFormattedTextField nameField;
    private javax.swing.JLabel nameIcon;
    private javax.swing.JPanel panelFondoAzul;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPasswordField repPasswordField;
    private javax.swing.JLabel repPasswordIcon;
    private javax.swing.JFormattedTextField usernameField;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
