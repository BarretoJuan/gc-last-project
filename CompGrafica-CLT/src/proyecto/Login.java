package proyecto;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creamContainer = new javax.swing.JLabel();
        waveBg = new javax.swing.JLabel();
        panelFondoAzul = new javax.swing.JPanel();
        logoPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente - Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creamContainer.setBackground(Colors.creamWhite);
        creamContainer.setText("jLabel2");
        creamContainer.setOpaque(true);
        creamContainer.setPreferredSize(new java.awt.Dimension(297, 297));
        getContentPane().add(creamContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        waveBg.setMaximumSize(new java.awt.Dimension(400, 508));
        waveBg.setMinimumSize(new java.awt.Dimension(400, 508));
        waveBg.setPreferredSize(new java.awt.Dimension(400, 508));
        waveBg.setSize(400,508);
        new SetImageLabel().SetImage(waveBg,"/resources/BgSmall2.png");
        getContentPane().add(waveBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 400, 508));

        panelFondoAzul.setBackground(Colors.darkBlue);

        logoPic.setText("jLabel1");
        logoPic.setMaximumSize(new java.awt.Dimension(249, 167));
        logoPic.setMinimumSize(new java.awt.Dimension(249, 167));
        logoPic.setPreferredSize(new java.awt.Dimension(249, 167));

        javax.swing.GroupLayout panelFondoAzulLayout = new javax.swing.GroupLayout(panelFondoAzul);
        panelFondoAzul.setLayout(panelFondoAzulLayout);
        panelFondoAzulLayout.setHorizontalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoAzulLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(logoPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panelFondoAzulLayout.setVerticalGroup(
            panelFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        logoPic.setSize(249,167);
        new SetImageLabel().SetImage(logoPic, "/resources/Logo1.png");

        getContentPane().add(panelFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creamContainer;
    private javax.swing.JLabel logoPic;
    private javax.swing.JPanel panelFondoAzul;
    private javax.swing.JLabel waveBg;
    // End of variables declaration//GEN-END:variables
}
