package vista;

import controlador.LecturaArchivoUsuario;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    //Se crea una clase ManejoArchivoUsuario para poder manejar las cuentas
    LecturaArchivoUsuario archivoUsuario = new LecturaArchivoUsuario();

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null); //centrar ventana al medio de la pantalla
        archivoUsuario.cargarUsuario(); //al compilar el proyecto se ejecuta
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        entrarInicioSesionInvitado = new javax.swing.JButton();
        usuarioInicioSesion = new javax.swing.JTextField();
        contraseñaInicioSesion = new javax.swing.JPasswordField();
        entrarInicioSesion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        contenedorInicio.setBackground(new java.awt.Color(255, 255, 255));
        contenedorInicio.setMinimumSize(new java.awt.Dimension(800, 500));
        contenedorInicio.setPreferredSize(new java.awt.Dimension(800, 500));
        contenedorInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Banco");
        contenedorInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-edificio-del-banco-100.png"))); // NOI18N
        contenedorInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 144, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        contenedorInicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INICIAR SESION ");
        contenedorInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("USUARIO");
        contenedorInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        contenedorInicio.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 430, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CONTRASEÑA");
        contenedorInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));
        contenedorInicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 430, -1));

        entrarInicioSesionInvitado.setBackground(new java.awt.Color(0, 134, 190));
        entrarInicioSesionInvitado.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        entrarInicioSesionInvitado.setForeground(new java.awt.Color(0, 0, 0));
        entrarInicioSesionInvitado.setText("ENTRAR COMO INVITADO");
        entrarInicioSesionInvitado.setBorder(null);
        entrarInicioSesionInvitado.setBorderPainted(false);
        entrarInicioSesionInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarInicioSesionInvitado.setMargin(new java.awt.Insets(0, 0, 0, 0));
        entrarInicioSesionInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarInicioSesionInvitadoMouseClicked(evt);
            }
        });
        entrarInicioSesionInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarInicioSesionInvitadoActionPerformed(evt);
            }
        });
        contenedorInicio.add(entrarInicioSesionInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 180, 40));

        usuarioInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        usuarioInicioSesion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        usuarioInicioSesion.setBorder(null);
        usuarioInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioInicioSesionActionPerformed(evt);
            }
        });
        contenedorInicio.add(usuarioInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 430, 30));

        contraseñaInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        contraseñaInicioSesion.setBorder(null);
        contenedorInicio.add(contraseñaInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 430, 30));

        entrarInicioSesion.setBackground(new java.awt.Color(0, 134, 190));
        entrarInicioSesion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        entrarInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        entrarInicioSesion.setText("ENTRAR");
        entrarInicioSesion.setBorder(null);
        entrarInicioSesion.setBorderPainted(false);
        entrarInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarInicioSesion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        entrarInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarInicioSesionMouseClicked(evt);
            }
        });
        entrarInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarInicioSesionActionPerformed(evt);
            }
        });
        contenedorInicio.add(entrarInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 140, 40));
        contenedorInicio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarInicioSesionInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarInicioSesionInvitadoActionPerformed
        Home a = new Home();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_entrarInicioSesionInvitadoActionPerformed

    private void usuarioInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioInicioSesionActionPerformed

    }//GEN-LAST:event_usuarioInicioSesionActionPerformed

    private void entrarInicioSesionInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarInicioSesionInvitadoMouseClicked

    }//GEN-LAST:event_entrarInicioSesionInvitadoMouseClicked

    private void entrarInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarInicioSesionActionPerformed
        String usuario = usuarioInicioSesion.getText();
        String contraseña = contraseñaInicioSesion.getText();

        int i = archivoUsuario.controlUsuario(usuario, contraseña);

        if (i == 1) {
            Home a = new Home();
            a.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no existe o la clave es incorrecta");
        }
    }//GEN-LAST:event_entrarInicioSesionActionPerformed

    private void entrarInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarInicioSesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarInicioSesionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorInicio;
    private javax.swing.JPasswordField contraseñaInicioSesion;
    private javax.swing.JButton entrarInicioSesion;
    private javax.swing.JButton entrarInicioSesionInvitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField usuarioInicioSesion;
    // End of variables declaration//GEN-END:variables

}
