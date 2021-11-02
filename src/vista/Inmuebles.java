/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.HashMap;
import modelo.Propiedad;

/**
 *
 * @author MultiRepair
 */
public class Inmuebles extends javax.swing.JFrame {

    /**
     * Creates new form Inmuebles
     */
    public Inmuebles() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorInmuebles = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonVolverInmueble = new javax.swing.JButton();
        contenedorPrestamos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        botonVerInmueble = new javax.swing.JButton();
        botonCargarInmueble = new javax.swing.JButton();
        botonModificarInmueble = new javax.swing.JButton();
        botonEliminarInmueble = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenedorInmuebles.setBackground(new java.awt.Color(255, 255, 255));
        contenedorInmuebles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 134, 190));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setText("INMUEBLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        contenedorInmuebles.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));

        botonVolverInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonVolverInmueble.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonVolverInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_2.png"))); // NOI18N
        botonVolverInmueble.setMnemonic('\u0006');
        botonVolverInmueble.setText("  Volver");
        botonVolverInmueble.setBorder(null);
        botonVolverInmueble.setBorderPainted(false);
        botonVolverInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverInmueble.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVolverInmueble.setMaximumSize(new java.awt.Dimension(179, 129));
        botonVolverInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverInmuebleMouseClicked(evt);
            }
        });
        botonVolverInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverInmuebleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonVolverInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolverInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorInmuebles.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        contenedorPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        contenedorPrestamos.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel4.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        contenedorPrestamos.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        botonVerInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonVerInmueble.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        botonVerInmueble.setText("Ver Inmueble");
        botonVerInmueble.setBorder(null);
        botonVerInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonVerInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInmuebleActionPerformed(evt);
            }
        });
        contenedorPrestamos.add(botonVerInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 280, 50));

        botonCargarInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonCargarInmueble.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        botonCargarInmueble.setText("Cargar Inmueble");
        botonCargarInmueble.setBorder(null);
        botonCargarInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCargarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInmuebleActionPerformed(evt);
            }
        });
        contenedorPrestamos.add(botonCargarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 280, 50));

        botonModificarInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonModificarInmueble.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        botonModificarInmueble.setText("Modificar Inmueble");
        botonModificarInmueble.setBorder(null);
        botonModificarInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonModificarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarInmuebleActionPerformed(evt);
            }
        });
        contenedorPrestamos.add(botonModificarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 280, 50));

        botonEliminarInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonEliminarInmueble.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        botonEliminarInmueble.setText("Eliminar Inmueble");
        botonEliminarInmueble.setBorder(null);
        botonEliminarInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonEliminarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarInmuebleActionPerformed(evt);
            }
        });
        contenedorPrestamos.add(botonEliminarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 280, 50));

        contenedorInmuebles.add(contenedorPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInmuebles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerInmuebleActionPerformed

    }//GEN-LAST:event_botonVerInmuebleActionPerformed

    private void botonCargarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarInmuebleActionPerformed
        CargarInmueble a = new CargarInmueble();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCargarInmuebleActionPerformed

    private void botonModificarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarInmuebleActionPerformed
       
    }//GEN-LAST:event_botonModificarInmuebleActionPerformed

    private void botonVolverInmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverInmuebleMouseClicked

    }//GEN-LAST:event_botonVolverInmuebleMouseClicked

    private void botonVolverInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverInmuebleActionPerformed
        this.hide();
        Home h=new Home();
        h.setVisible(true);
    }//GEN-LAST:event_botonVolverInmuebleActionPerformed

    private void botonEliminarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarInmuebleActionPerformed

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
            java.util.logging.Logger.getLogger(Inmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inmuebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarInmueble;
    private javax.swing.JButton botonEliminarInmueble;
    private javax.swing.JButton botonModificarInmueble;
    private javax.swing.JButton botonVerInmueble;
    private javax.swing.JButton botonVolverInmueble;
    private javax.swing.JPanel contenedorInmuebles;
    private javax.swing.JPanel contenedorPrestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}