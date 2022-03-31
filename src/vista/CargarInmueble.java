package vista;

import controlador.CargaDatosInmueble;
import controlador.LecturaArchivoInmueble;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import modelo.Casa;
import modelo.Departamento;
import modelo.Propiedad;

public class CargarInmueble extends javax.swing.JFrame {

    public CargarInmueble() {
        initComponents();
        this.setLocationRelativeTo(null);
        pisoPropiedad.setEditable(false);
        identificadorPropiedad.setEditable(false);
        antiguedadPropiedad.setEditable(false);
        pisoPropiedad.setText("");
        identificadorPropiedad.setText("");
        antiguedadPropiedad.setText("");
        pisoPropiedad.setBackground(Color.GRAY);
        identificadorPropiedad.setBackground(Color.GRAY);
        antiguedadPropiedad.setBackground(Color.GRAY);

    }

    HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();

    /*
    El boton de cargar no se habilita hasta que no se carguen todos los campos.
     */
    public void habilitarBoton() {
        if (!dniPropiedad.getText().isEmpty() && !direccionPropiedad.getText().isEmpty()
                && !valorTasacionPropiedad.getText().isEmpty() && !cantidadAmbientesPropiedad.getText().isEmpty()
                && !metrosCuadradosCubiertosPropiedad.getText().isEmpty() && !metrosCuadradosTotalesPropiedad.getText().isEmpty()
                && !pisoPropiedad.getText().isEmpty() && !identificadorPropiedad.getText().isEmpty()) {

            botonCargarDatosInmueble.setEnabled(true);

        } else if (!dniPropiedad.getText().isEmpty() && !direccionPropiedad.getText().isEmpty()
                && !valorTasacionPropiedad.getText().isEmpty() && !cantidadAmbientesPropiedad.getText().isEmpty()
                && !metrosCuadradosCubiertosPropiedad.getText().isEmpty() && !metrosCuadradosTotalesPropiedad.getText().isEmpty()
                && !antiguedadPropiedad.getText().isEmpty()) {

            botonCargarDatosInmueble.setEnabled(true);
        } else {
            botonCargarDatosInmueble.setEnabled(false);
        }
    }

    public void borrarDatos() {
        dniPropiedad.setText("");
        direccionPropiedad.setText("");
        valorTasacionPropiedad.setText("");
        cantidadAmbientesPropiedad.setText("");
        metrosCuadradosCubiertosPropiedad.setText("");
        metrosCuadradosTotalesPropiedad.setText("");
        antiguedadPropiedad.setText("");
        pisoPropiedad.setText("");
        identificadorPropiedad.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorCargarInmueble = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonVolverCargarInmuble = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dniPropiedad = new javax.swing.JTextField();
        direccionPropiedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorTasacionPropiedad = new javax.swing.JTextField();
        cantidadAmbientesPropiedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        metrosCuadradosCubiertosPropiedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        metrosCuadradosTotalesPropiedad = new javax.swing.JTextField();
        opcionTipoPropiedad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        antiguedadPropiedad = new javax.swing.JTextField();
        pisoPropiedad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        identificadorPropiedad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        botonCargarDatosInmueble = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenedorCargarInmueble.setBackground(new java.awt.Color(255, 255, 255));
        contenedorCargarInmueble.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));

        botonVolverCargarInmuble.setBackground(new java.awt.Color(0, 134, 190));
        botonVolverCargarInmuble.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonVolverCargarInmuble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_2.png"))); // NOI18N
        botonVolverCargarInmuble.setMnemonic('\u0006');
        botonVolverCargarInmuble.setText("  Volver");
        botonVolverCargarInmuble.setBorder(null);
        botonVolverCargarInmuble.setBorderPainted(false);
        botonVolverCargarInmuble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverCargarInmuble.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVolverCargarInmuble.setMaximumSize(new java.awt.Dimension(179, 129));
        botonVolverCargarInmuble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverCargarInmubleMouseClicked(evt);
            }
        });
        botonVolverCargarInmuble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverCargarInmubleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonVolverCargarInmuble, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolverCargarInmuble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorCargarInmueble.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel2.setText("CARGAR INMUEBLE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        contenedorCargarInmueble.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI de la Persona");
        contenedorCargarInmueble.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        dniPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        dniPropiedad.setForeground(new java.awt.Color(0, 0, 0));
        dniPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dniPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniPropiedadActionPerformed(evt);
            }
        });
        dniPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dniPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(dniPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 550, 25));

        direccionPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        direccionPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        direccionPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionPropiedadActionPerformed(evt);
            }
        });
        direccionPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(direccionPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 550, 25));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Direccion");
        contenedorCargarInmueble.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Valor tasación");
        contenedorCargarInmueble.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        valorTasacionPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        valorTasacionPropiedad.setToolTipText("");
        valorTasacionPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        valorTasacionPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorTasacionPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorTasacionPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(valorTasacionPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 550, 25));

        cantidadAmbientesPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        cantidadAmbientesPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cantidadAmbientesPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadAmbientesPropiedadActionPerformed(evt);
            }
        });
        cantidadAmbientesPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadAmbientesPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadAmbientesPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(cantidadAmbientesPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 550, 25));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad Ambientes");
        contenedorCargarInmueble.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Metros cubiertos");
        contenedorCargarInmueble.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        metrosCuadradosCubiertosPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        metrosCuadradosCubiertosPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        metrosCuadradosCubiertosPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                metrosCuadradosCubiertosPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                metrosCuadradosCubiertosPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(metrosCuadradosCubiertosPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, 25));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Metros totales");
        contenedorCargarInmueble.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        metrosCuadradosTotalesPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        metrosCuadradosTotalesPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        metrosCuadradosTotalesPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrosCuadradosTotalesPropiedadActionPerformed(evt);
            }
        });
        metrosCuadradosTotalesPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                metrosCuadradosTotalesPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                metrosCuadradosTotalesPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(metrosCuadradosTotalesPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 25));

        opcionTipoPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        opcionTipoPropiedad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        opcionTipoPropiedad.setForeground(new java.awt.Color(0, 0, 0));
        opcionTipoPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Casa", "Departamento" }));
        opcionTipoPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionTipoPropiedadActionPerformed(evt);
            }
        });
        opcionTipoPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                opcionTipoPropiedadKeyReleased(evt);
            }
        });
        contenedorCargarInmueble.add(opcionTipoPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 550, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo de inmueble");
        contenedorCargarInmueble.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Antigüedad");
        contenedorCargarInmueble.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        antiguedadPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        antiguedadPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        antiguedadPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguedadPropiedadActionPerformed(evt);
            }
        });
        antiguedadPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                antiguedadPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antiguedadPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(antiguedadPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 550, 25));

        pisoPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        pisoPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pisoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoPropiedadActionPerformed(evt);
            }
        });
        pisoPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pisoPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pisoPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(pisoPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 550, 25));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Piso");
        contenedorCargarInmueble.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        identificadorPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        identificadorPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        identificadorPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorPropiedadActionPerformed(evt);
            }
        });
        identificadorPropiedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                identificadorPropiedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identificadorPropiedadKeyTyped(evt);
            }
        });
        contenedorCargarInmueble.add(identificadorPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 550, 25));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Identificador");
        contenedorCargarInmueble.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        botonCargarDatosInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonCargarDatosInmueble.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonCargarDatosInmueble.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarDatosInmueble.setText("CARGAR DATOS");
        botonCargarDatosInmueble.setBorder(null);
        botonCargarDatosInmueble.setBorderPainted(false);
        botonCargarDatosInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCargarDatosInmueble.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCargarDatosInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCargarDatosInmuebleMouseClicked(evt);
            }
        });
        botonCargarDatosInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDatosInmuebleActionPerformed(evt);
            }
        });
        contenedorCargarInmueble.add(botonCargarDatosInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 140, 40));
        contenedorCargarInmueble.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 103, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorCargarInmueble, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorCargarInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverCargarInmubleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverCargarInmubleMouseClicked

    }//GEN-LAST:event_botonVolverCargarInmubleMouseClicked

    private void botonVolverCargarInmubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverCargarInmubleActionPerformed
        this.hide();
        Inmuebles h = new Inmuebles();
        h.setVisible(true);
        botonCargarDatosInmueble.setEnabled(false);
    }//GEN-LAST:event_botonVolverCargarInmubleActionPerformed

    private void dniPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniPropiedadActionPerformed

    private void direccionPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionPropiedadActionPerformed

    private void cantidadAmbientesPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadAmbientesPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadAmbientesPropiedadActionPerformed

    private void metrosCuadradosTotalesPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrosCuadradosTotalesPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metrosCuadradosTotalesPropiedadActionPerformed

    private void opcionTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionTipoPropiedadActionPerformed

        /*
        * Manejo del JcomboBox para bloquear los JtextFideld que no se usen 
         */
        String tipo = opcionTipoPropiedad.getSelectedItem().toString();

        if (tipo.equals("Casa")) {
            pisoPropiedad.setEditable(false);
            identificadorPropiedad.setEditable(false);
            antiguedadPropiedad.setEditable(true);
            pisoPropiedad.setText("");
            identificadorPropiedad.setText("");
            pisoPropiedad.setBackground(Color.GRAY);
            identificadorPropiedad.setBackground(Color.GRAY);
            antiguedadPropiedad.setBackground(Color.white);
        } else if (tipo.equals("Departamento")) {
            antiguedadPropiedad.setEditable(false);
            pisoPropiedad.setEditable(true);
            identificadorPropiedad.setEditable(true);
            antiguedadPropiedad.setText("");
            antiguedadPropiedad.setBackground(Color.GRAY);
            pisoPropiedad.setBackground(Color.white);
            identificadorPropiedad.setBackground(Color.white);
        } else {
            pisoPropiedad.setEditable(false);
            identificadorPropiedad.setEditable(false);
            antiguedadPropiedad.setEditable(false);
            pisoPropiedad.setText("");
            identificadorPropiedad.setText("");
            antiguedadPropiedad.setText("");
            pisoPropiedad.setBackground(Color.GRAY);
            identificadorPropiedad.setBackground(Color.GRAY);
            antiguedadPropiedad.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_opcionTipoPropiedadActionPerformed

    private void antiguedadPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguedadPropiedadActionPerformed


    }//GEN-LAST:event_antiguedadPropiedadActionPerformed

    private void pisoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisoPropiedadActionPerformed

    private void botonCargarDatosInmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCargarDatosInmuebleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCargarDatosInmuebleMouseClicked

    private void botonCargarDatosInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDatosInmuebleActionPerformed

        try {
            String dni = dniPropiedad.getText(); //leo el dni primero para hacer el control (Si ya esta cargado o no)

            LecturaArchivoInmueble m = new LecturaArchivoInmueble();
            m.cargarCasa(); //Traigo del archivo casas.txt los datos para usarlos
            m.cargarDepartemento(); //Traigo del archivo departementos.txt los datos para usarlos

            /**
             * Controlo que no este cargado el dni Le paso el dni por parametro
             *
             * @return 1 si existe
             *
             */
            int i = m.controlPropiedad(dni);
            int dniTemporal = 0;

            if (mapPropiedad.containsKey(dni)) {
                dniTemporal = 1;
            }

            if (i == 1 || dniTemporal == 1) {
                JOptionPane.showMessageDialog(rootPane, "El dni ya se encuentra cargado");
            } else {
                CargaDatosInmueble a = new CargaDatosInmueble();

                String direccion = direccionPropiedad.getText();
                String tasacion = valorTasacionPropiedad.getText();
                String ambientes = cantidadAmbientesPropiedad.getText();
                String metrosCubiertos = metrosCuadradosCubiertosPropiedad.getText();
                String metrosTotales = metrosCuadradosTotalesPropiedad.getText();

                String tipo = opcionTipoPropiedad.getSelectedItem().toString();

                if (tipo.equals("Casa")) {
                    String antiguedad = antiguedadPropiedad.getText();
                    a.cargaArchivoCasa(dni, antiguedad, tasacion, direccion, ambientes, metrosCubiertos, metrosTotales);
                    mapPropiedad.put(dni, new Casa(antiguedad, direccion, tasacion, ambientes, metrosCubiertos, metrosTotales));
                } else {
                    String piso = pisoPropiedad.getText();
                    String identificador = identificadorPropiedad.getText();
                    a.cargarDepartamento(dni, tasacion, direccion, ambientes, metrosCubiertos, metrosTotales, piso, identificador);
                    mapPropiedad.put(dni, new Departamento(direccion, tasacion, ambientes, metrosCubiertos, metrosTotales, piso, identificador));
                }

                JOptionPane.showMessageDialog(rootPane, "El inmueble se cargo exitosamente");
                borrarDatos();
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_botonCargarDatosInmuebleActionPerformed

    private void identificadorPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificadorPropiedadActionPerformed

    private void dniPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_dniPropiedadKeyReleased

    private void direccionPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_direccionPropiedadKeyReleased

    private void valorTasacionPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorTasacionPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_valorTasacionPropiedadKeyReleased

    private void cantidadAmbientesPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadAmbientesPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_cantidadAmbientesPropiedadKeyReleased

    private void metrosCuadradosCubiertosPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metrosCuadradosCubiertosPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_metrosCuadradosCubiertosPropiedadKeyReleased

    private void metrosCuadradosTotalesPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metrosCuadradosTotalesPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_metrosCuadradosTotalesPropiedadKeyReleased

    private void antiguedadPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antiguedadPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_antiguedadPropiedadKeyReleased

    private void pisoPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pisoPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_pisoPropiedadKeyReleased

    private void identificadorPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificadorPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_identificadorPropiedadKeyReleased

    private void opcionTipoPropiedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opcionTipoPropiedadKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_opcionTipoPropiedadKeyReleased

    private void dniPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniPropiedadKeyTyped

        int key = evt.getKeyChar(); //almaceno el codigo ascii de la letra ingresada
        System.out.println("key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;
        boolean punto = key == 46;

        if (!(numeros || borrar || espacio || enter || borrarCtrl || punto)) {
            evt.consume();
            dniPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            dniPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (dniPropiedad.getText().trim().length() == 8) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese un dni valido");
        }

    }//GEN-LAST:event_dniPropiedadKeyTyped

    private void direccionPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionPropiedadKeyTyped
        int key = evt.getKeyChar();
    }//GEN-LAST:event_direccionPropiedadKeyTyped

    private void valorTasacionPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorTasacionPropiedadKeyTyped
        int key = evt.getKeyChar();
        System.out.println("Key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;
        boolean punto = key == 46;

        if (!(numeros || borrar || espacio || enter || borrarCtrl || punto)) {
            evt.consume();
            valorTasacionPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            valorTasacionPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (valorTasacionPropiedad.getText().trim().length() == 100) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese un tasacion valida");
        }
    }//GEN-LAST:event_valorTasacionPropiedadKeyTyped

    private void cantidadAmbientesPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadAmbientesPropiedadKeyTyped
        int key = evt.getKeyChar();
        System.out.println("Key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;

        if (!(numeros || borrar || espacio || enter || borrarCtrl)) {
            evt.consume();
            cantidadAmbientesPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            cantidadAmbientesPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (cantidadAmbientesPropiedad.getText().trim().length() == 2) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese una cantidad valida");
        }
    }//GEN-LAST:event_cantidadAmbientesPropiedadKeyTyped

    private void metrosCuadradosCubiertosPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metrosCuadradosCubiertosPropiedadKeyTyped
        int key = evt.getKeyChar();
        System.out.println("Key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;
        boolean punto = key == 46;

        if (!(numeros || borrar || espacio || enter || borrarCtrl || punto)) {
            evt.consume();
            metrosCuadradosCubiertosPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            metrosCuadradosCubiertosPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (metrosCuadradosCubiertosPropiedad.getText().trim().length() == 10) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar mas de 10 numeros");
        }
    }//GEN-LAST:event_metrosCuadradosCubiertosPropiedadKeyTyped

    private void metrosCuadradosTotalesPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metrosCuadradosTotalesPropiedadKeyTyped
        int key = evt.getKeyChar();
        System.out.println("Key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;
        boolean punto = key == 46;

        if (!(numeros || borrar || espacio || enter || borrarCtrl || punto)) {
            evt.consume();
            metrosCuadradosTotalesPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            metrosCuadradosTotalesPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (metrosCuadradosTotalesPropiedad.getText().trim().length() == 10) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar mas de 10 numeros");
        }
    }//GEN-LAST:event_metrosCuadradosTotalesPropiedadKeyTyped

    private void antiguedadPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antiguedadPropiedadKeyTyped
        int key = evt.getKeyChar(); //almaceno el codigo ascii de la letra ingresada
        System.out.println("key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;

        if (!(numeros || borrar || espacio || enter || borrarCtrl)) {
            evt.consume();
            antiguedadPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            antiguedadPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (antiguedadPropiedad.getText().trim().length() == 5) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar mas de 5 numeros");
        }
    }//GEN-LAST:event_antiguedadPropiedadKeyTyped

    private void pisoPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pisoPropiedadKeyTyped
        int key = evt.getKeyChar(); //almaceno el codigo ascii de la letra ingresada
        System.out.println("key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;

        if (!(numeros || borrar || espacio || enter || borrarCtrl)) {
            evt.consume();
            pisoPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            pisoPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (pisoPropiedad.getText().trim().length() == 5) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar mas de 5 numeros");
        }
    }//GEN-LAST:event_pisoPropiedadKeyTyped

    private void identificadorPropiedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificadorPropiedadKeyTyped
        int key = evt.getKeyChar(); //almaceno el codigo ascii de la letra ingresada
        System.out.println("key: " + key);

        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean borrarCtrl = key == 127;
        boolean espacio = key == 32;
        boolean enter = key == 10;
        boolean letraMinusculas = key >= 97 && key <= 122;
        boolean letraMayuscula = key >= 65 && key <= 90;

        if (!(numeros || borrar || espacio || enter || borrarCtrl || letraMayuscula || letraMinusculas)) {
            evt.consume();
            identificadorPropiedad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores validos");
        } else {
            identificadorPropiedad.setBorder(BorderFactory.createLineBorder(Color.gray));

        }

        if (identificadorPropiedad.getText().trim().length() == 5) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar mas de 5 numeros");
        }
    }//GEN-LAST:event_identificadorPropiedadKeyTyped

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
            java.util.logging.Logger.getLogger(CargarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antiguedadPropiedad;
    private javax.swing.JButton botonCargarDatosInmueble;
    private javax.swing.JButton botonVolverCargarInmuble;
    private javax.swing.JTextField cantidadAmbientesPropiedad;
    private javax.swing.JPanel contenedorCargarInmueble;
    private javax.swing.JTextField direccionPropiedad;
    private javax.swing.JTextField dniPropiedad;
    private javax.swing.JTextField identificadorPropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField metrosCuadradosCubiertosPropiedad;
    private javax.swing.JTextField metrosCuadradosTotalesPropiedad;
    private javax.swing.JComboBox<String> opcionTipoPropiedad;
    private javax.swing.JTextField pisoPropiedad;
    private javax.swing.JTextField valorTasacionPropiedad;
    // End of variables declaration//GEN-END:variables
}
