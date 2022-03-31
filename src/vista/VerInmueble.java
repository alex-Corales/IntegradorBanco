/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.LecturaArchivoInmueble;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Casa;
import modelo.Departamento;
import modelo.Propiedad;

/**
 *
 * @author MultiRepair
 */
public class VerInmueble extends javax.swing.JFrame {

    /**
     * Creates new form VerInmueble
     */
    public void cambioPantalla(String dni) {
        this.hide();
        buscarDni h = new buscarDni();
        h.setVisible(true);
        h.mostrarDni(dni);
    }

    public VerInmueble() {
        initComponents();
        jTable1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 2) {
                    String dni = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
                    cambioPantalla(dni);
                }
            }
        });
        this.setLocationRelativeTo(null);

    }

    public void mostrarListaValorTasacion(String dato) {
        HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();
        LecturaArchivoInmueble a = new LecturaArchivoInmueble();

        mapPropiedad = a.propiedadCargadaMapa();
        String matris[][] = new String[mapPropiedad.size()][10];

        Set<String> keys = mapPropiedad.keySet();

        int i = 0;
        boolean auxCont = false;

        for (String key : keys) {
            String temp = mapPropiedad.get(key).getDireccion();
            if (dato.equals(temp)) {
                auxCont = true;
                Propiedad p = LecturaArchivoInmueble.accesoADatos().get(key);
                if (p instanceof Casa) {
                    String keyControl = mapPropiedad.get(key).getDireccion();
                    if (keyControl != null) {
                        matris[i][0] = "Casa";
                        matris[i][1] = key;
                        matris[i][2] = mapPropiedad.get(key).getValorTasacion();
                        matris[i][3] = mapPropiedad.get(key).getDireccion();
                        matris[i][4] = mapPropiedad.get(key).getCantAmbientes();
                        matris[i][5] = mapPropiedad.get(key).getMetrosCuadradosCubiertos();
                        matris[i][6] = mapPropiedad.get(key).getMetrosCuadradosTotales();
                        matris[i][7] = ((Casa) p).getAntiguedad() + " Años";
                    }
                } else if (p instanceof Departamento) {
                    String keyControl = mapPropiedad.get(key).getDireccion();
                    if (keyControl != null) {
                        matris[i][0] = "Departamento";
                        matris[i][1] = key;
                        matris[i][2] = mapPropiedad.get(key).getValorTasacion();
                        matris[i][3] = mapPropiedad.get(key).getDireccion();
                        matris[i][4] = mapPropiedad.get(key).getCantAmbientes();
                        matris[i][5] = mapPropiedad.get(key).getMetrosCuadradosCubiertos();
                        matris[i][6] = mapPropiedad.get(key).getMetrosCuadradosTotales();
                        matris[i][8] = ((Departamento) p).getPiso();
                        matris[i][9] = ((Departamento) p).getNumero();
                    }
                }
                i++;
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String[]{
                        "Tipo", "Dni", "Direccion", "Valor tasacion", "Cantidad ambientes", "Metros cuadrados cubiertos", "Metros cuadrados totales", "Antiguedad", "Piso", "Identificador"
                    }
            ));
        }

        if (!auxCont) {
            JOptionPane.showMessageDialog(this, "No existe el inmueble de este propietario");
        }

    }

    public void mostrarLista() {
        HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();
        LecturaArchivoInmueble a = new LecturaArchivoInmueble();

        mapPropiedad = a.propiedadCargadaMapa();
        String matris[][] = new String[mapPropiedad.size()][10];

        Set<String> keys = mapPropiedad.keySet();

        int i = 0;

        for (String key : keys) {

            Propiedad p = LecturaArchivoInmueble.accesoADatos().get(key);

            if (p instanceof Casa) {
                String keyControl = mapPropiedad.get(key).getDireccion();
                if (keyControl != null) {
                    matris[i][0] = "Casa";
                    matris[i][1] = key;
                    matris[i][2] = mapPropiedad.get(key).getValorTasacion();
                    matris[i][3] = mapPropiedad.get(key).getDireccion();
                    matris[i][4] = mapPropiedad.get(key).getCantAmbientes();
                    matris[i][5] = mapPropiedad.get(key).getMetrosCuadradosCubiertos();
                    matris[i][6] = mapPropiedad.get(key).getMetrosCuadradosTotales();
                    matris[i][7] = ((Casa) p).getAntiguedad() + " Años";
                }
            } else if (p instanceof Departamento) {
                String keyControl = mapPropiedad.get(key).getDireccion();
                if (keyControl != null) {
                    matris[i][0] = "Departamento";
                    matris[i][1] = key;
                    matris[i][2] = mapPropiedad.get(key).getValorTasacion();
                    matris[i][3] = mapPropiedad.get(key).getDireccion();
                    matris[i][4] = mapPropiedad.get(key).getCantAmbientes();
                    matris[i][5] = mapPropiedad.get(key).getMetrosCuadradosCubiertos();
                    matris[i][6] = mapPropiedad.get(key).getMetrosCuadradosTotales();
                    matris[i][8] = ((Departamento) p).getPiso();
                    matris[i][9] = ((Departamento) p).getNumero();
                }
            }
            i++;

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Tipo", "Dni", "Direccion", "Valor tasacion", "Cantidad ambientes", "Metros cuadrados cubiertos", "Metros cuadrados totales", "Antiguedad", "Piso", "Identificador"
                }
        ));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorVerInmueble = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonVolverVerInmueble = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonBuscarValorTasacion = new javax.swing.JButton();
        botonVerLista = new javax.swing.JButton();
        tasacionInmueble = new javax.swing.JTextField();
        botonBuscarDni1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenedorVerInmueble.setBackground(new java.awt.Color(255, 255, 255));
        contenedorVerInmueble.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel2.setText("VER INMUEBLE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedorVerInmueble.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));

        botonVolverVerInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonVolverVerInmueble.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonVolverVerInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_2.png"))); // NOI18N
        botonVolverVerInmueble.setMnemonic('\u0006');
        botonVolverVerInmueble.setText("  Volver");
        botonVolverVerInmueble.setBorder(null);
        botonVolverVerInmueble.setBorderPainted(false);
        botonVolverVerInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverVerInmueble.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVolverVerInmueble.setMaximumSize(new java.awt.Dimension(179, 129));
        botonVolverVerInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverVerInmuebleMouseClicked(evt);
            }
        });
        botonVolverVerInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverVerInmuebleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonVolverVerInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolverVerInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorVerInmueble.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Dni", "Direccion", "Valor tasacion", "Cantidad ambientes", "Metros cuadrados cubiertos", "Metros cuadrados totales", "Antiguedad", "Piso", "Identificador"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        contenedorVerInmueble.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 780, 270));

        botonBuscarValorTasacion.setBackground(new java.awt.Color(0, 134, 190));
        botonBuscarValorTasacion.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        botonBuscarValorTasacion.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscarValorTasacion.setMnemonic('\u0006');
        botonBuscarValorTasacion.setText("Buscar por valor de tasacion");
        botonBuscarValorTasacion.setBorder(null);
        botonBuscarValorTasacion.setBorderPainted(false);
        botonBuscarValorTasacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarValorTasacion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonBuscarValorTasacion.setMaximumSize(new java.awt.Dimension(179, 129));
        botonBuscarValorTasacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarValorTasacionMouseClicked(evt);
            }
        });
        botonBuscarValorTasacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarValorTasacionActionPerformed(evt);
            }
        });
        contenedorVerInmueble.add(botonBuscarValorTasacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 190, 30));

        botonVerLista.setBackground(new java.awt.Color(0, 134, 190));
        botonVerLista.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonVerLista.setForeground(new java.awt.Color(0, 0, 0));
        botonVerLista.setMnemonic('\u0006');
        botonVerLista.setText("Ver inmuebles");
        botonVerLista.setBorder(null);
        botonVerLista.setBorderPainted(false);
        botonVerLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerLista.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVerLista.setMaximumSize(new java.awt.Dimension(179, 129));
        botonVerLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerListaMouseClicked(evt);
            }
        });
        botonVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerListaActionPerformed(evt);
            }
        });
        contenedorVerInmueble.add(botonVerLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 388, 120, 40));

        tasacionInmueble.setBackground(new java.awt.Color(255, 255, 255));
        tasacionInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasacionInmuebleActionPerformed(evt);
            }
        });
        contenedorVerInmueble.add(tasacionInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 160, 30));

        botonBuscarDni1.setBackground(new java.awt.Color(0, 134, 190));
        botonBuscarDni1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonBuscarDni1.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscarDni1.setMnemonic('\u0006');
        botonBuscarDni1.setText("Buscar por dni");
        botonBuscarDni1.setBorder(null);
        botonBuscarDni1.setBorderPainted(false);
        botonBuscarDni1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarDni1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonBuscarDni1.setMaximumSize(new java.awt.Dimension(179, 129));
        botonBuscarDni1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarDni1MouseClicked(evt);
            }
        });
        botonBuscarDni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarDni1ActionPerformed(evt);
            }
        });
        contenedorVerInmueble.add(botonBuscarDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorVerInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorVerInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverVerInmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverVerInmuebleMouseClicked

    }//GEN-LAST:event_botonVolverVerInmuebleMouseClicked

    private void botonVolverVerInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverVerInmuebleActionPerformed
        this.hide();
        Inmuebles h = new Inmuebles();
        h.setVisible(true);

    }//GEN-LAST:event_botonVolverVerInmuebleActionPerformed

    private void botonBuscarValorTasacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarValorTasacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarValorTasacionMouseClicked

    private void botonBuscarValorTasacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarValorTasacionActionPerformed
        mostrarListaValorTasacion(tasacionInmueble.getText());
        System.out.println(tasacionInmueble.getText());
    }//GEN-LAST:event_botonBuscarValorTasacionActionPerformed

    private void botonVerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerListaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerListaMouseClicked

    private void botonVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerListaActionPerformed
        mostrarLista();
    }//GEN-LAST:event_botonVerListaActionPerformed

    private void tasacionInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasacionInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tasacionInmuebleActionPerformed

    private void botonBuscarDni1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarDni1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarDni1MouseClicked

    private void botonBuscarDni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarDni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarDni1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarDni1;
    private javax.swing.JButton botonBuscarValorTasacion;
    private javax.swing.JButton botonVerLista;
    private javax.swing.JButton botonVolverVerInmueble;
    private javax.swing.JPanel contenedorVerInmueble;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tasacionInmueble;
    // End of variables declaration//GEN-END:variables
}
