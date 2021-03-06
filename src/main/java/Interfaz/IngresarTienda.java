/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EntidadesMapeo.TIENDA;
import NuevosDatos_Entidades.NuevosTienda;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author danielferova
 */
public class IngresarTienda extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresarTienda
     */
    public IngresarTienda() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        tiendaNombre = new javax.swing.JTextField();
        lblCodigoFabricante = new javax.swing.JLabel();
        codigoTienda = new javax.swing.JTextField();
        lblGarantia1 = new javax.swing.JLabel();
        telefono2Tienda = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        direccionTienda = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        telefonoTienda = new javax.swing.JTextField();
        lblGarantia = new javax.swing.JLabel();
        horarioTienda = new javax.swing.JTextField();
        lbCorreo = new javax.swing.JLabel();
        correoTienda = new javax.swing.JTextField();
        Tiendaregistrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 129, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Tienda");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre.setText("Nombre:");

        tiendaNombre.setBackground(new java.awt.Color(254, 254, 254));
        tiendaNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        tiendaNombre.setForeground(new java.awt.Color(1, 1, 1));
        tiendaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendaNombreActionPerformed(evt);
            }
        });

        lblCodigoFabricante.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigoFabricante.setForeground(new java.awt.Color(254, 247, 247));
        lblCodigoFabricante.setText("Código Tienda:");

        codigoTienda.setBackground(new java.awt.Color(254, 254, 254));
        codigoTienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        codigoTienda.setForeground(new java.awt.Color(1, 1, 1));
        codigoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTiendaActionPerformed(evt);
            }
        });

        lblGarantia1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGarantia1.setForeground(new java.awt.Color(253, 251, 251));
        lblGarantia1.setText("Teléfono2:");

        telefono2Tienda.setBackground(new java.awt.Color(254, 254, 254));
        telefono2Tienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        telefono2Tienda.setForeground(new java.awt.Color(1, 1, 1));

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo.setText("Dirección:");

        direccionTienda.setBackground(new java.awt.Color(254, 254, 254));
        direccionTienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        direccionTienda.setForeground(new java.awt.Color(1, 1, 1));

        lblPrecio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(254, 254, 254));
        lblPrecio.setText("Teléfono1:");

        telefonoTienda.setBackground(new java.awt.Color(254, 254, 254));
        telefonoTienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        telefonoTienda.setForeground(new java.awt.Color(1, 1, 1));

        lblGarantia.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGarantia.setForeground(new java.awt.Color(254, 254, 254));
        lblGarantia.setText("Horario:");

        horarioTienda.setBackground(new java.awt.Color(254, 254, 254));
        horarioTienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        horarioTienda.setForeground(new java.awt.Color(1, 1, 1));

        lbCorreo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbCorreo.setForeground(new java.awt.Color(254, 254, 254));
        lbCorreo.setText("Correo Electrónico:");

        correoTienda.setBackground(new java.awt.Color(254, 254, 254));
        correoTienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        correoTienda.setForeground(new java.awt.Color(1, 1, 1));

        Tiendaregistrar.setBackground(new java.awt.Color(1, 1, 1));
        Tiendaregistrar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Tiendaregistrar.setForeground(new java.awt.Color(254, 254, 254));
        Tiendaregistrar.setText("Registrar Tienda");
        Tiendaregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiendaregistrarActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(1, 1, 1));
        regresar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(254, 254, 254));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(Tiendaregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(direccionTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigoFabricante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPrecio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefonoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tiendaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblGarantia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono2Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGarantia)
                            .addComponent(lbCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horarioTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiendaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(direccionTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblCodigoFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono2Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGarantia1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGarantia)
                    .addComponent(horarioTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tiendaregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiendaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiendaNombreActionPerformed

    private void codigoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTiendaActionPerformed

    private void TiendaregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiendaregistrarActionPerformed
        // TODO add your handling code here:
        String nombreTienda = tiendaNombre.getText();
        String direccion = direccionTienda.getText();
        String idTienda = codigoTienda.getText();
        String telefono1 = telefonoTienda.getText();
        String telefono2 = telefono2Tienda.getText();
        String correo = correoTienda.getText();
        String horario = horarioTienda.getText();
        if(nombreTienda.equals("") || direccion.equals("") || idTienda.equals("") || telefono1.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese CAMPOS OBLIGATORIOS");
        }else{
            TIENDA ingresar = new TIENDA(nombreTienda, direccion, idTienda, telefono1, telefono2, correo, horario);
            NuevosDatos_Entidades.NuevosTienda llamar = new NuevosTienda();
            if(!llamar.insertarTienda(ingresar))
                {
                   JOptionPane.showMessageDialog(null, "ERROR NO SE PUEDE INGRESAR" + nombreTienda + "Datos errones o repetidos"+direccion + "" + idTienda + "" + telefono1 + "" + telefono2 + "" + correo+ "" +horario+"");
                }else{
                JOptionPane.showMessageDialog(null, "TIENDA agregada");
                EmpleadosMenu regresar = new EmpleadosMenu();
                regresar.setVisible(true);
                this.setVisible(false);
            }
        }
        
        
    }//GEN-LAST:event_TiendaregistrarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
          EmpleadosMenu regresar = new EmpleadosMenu();
                regresar.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tiendaregistrar;
    private javax.swing.JTextField codigoTienda;
    private javax.swing.JTextField correoTienda;
    private javax.swing.JTextField direccionTienda;
    private javax.swing.JTextField horarioTienda;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoFabricante;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblGarantia1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField telefono2Tienda;
    private javax.swing.JTextField telefonoTienda;
    private javax.swing.JTextField tiendaNombre;
    // End of variables declaration//GEN-END:variables
}
