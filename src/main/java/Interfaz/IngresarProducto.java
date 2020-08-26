/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EntidadesMapeo.CLIENTE;
import EntidadesMapeo.PRODUCTO;
import NuevosDatos_Entidades.NuevosClientes;
import NuevosDatos_Entidades.NuevosProducto;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author danielferova
 */
public class IngresarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ingresar Producto
     */
    public IngresarProducto() {
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

        desP = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        nombreP = new javax.swing.JTextField();
        lblCodigoFabricante = new javax.swing.JLabel();
        idP = new javax.swing.JTextField();
        lblGarantia1 = new javax.swing.JLabel();
        precioP = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        fabricanteP = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        cantidadP = new javax.swing.JTextField();
        lblGarantia = new javax.swing.JLabel();
        idTP = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        lblGarantia2 = new javax.swing.JLabel();
        garantiaP = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 123, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Producto");

        desP.setBackground(new java.awt.Color(254, 254, 254));
        desP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        desP.setForeground(new java.awt.Color(1, 1, 1));

        lblDescripcion.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(254, 254, 254));
        lblDescripcion.setText("Descripción:");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre.setText("Nombre:");

        nombreP.setBackground(new java.awt.Color(254, 254, 254));
        nombreP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        nombreP.setForeground(new java.awt.Color(1, 1, 1));
        nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePActionPerformed(evt);
            }
        });

        lblCodigoFabricante.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigoFabricante.setForeground(new java.awt.Color(254, 247, 247));
        lblCodigoFabricante.setText("Código Producto:");

        idP.setBackground(new java.awt.Color(254, 254, 254));
        idP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        idP.setForeground(new java.awt.Color(1, 1, 1));
        idP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPActionPerformed(evt);
            }
        });

        lblGarantia1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGarantia1.setForeground(new java.awt.Color(253, 251, 251));
        lblGarantia1.setText("Garantía:");

        precioP.setBackground(new java.awt.Color(254, 254, 254));
        precioP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        precioP.setForeground(new java.awt.Color(1, 1, 1));

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo.setText("Fabricante:");

        fabricanteP.setBackground(new java.awt.Color(254, 254, 254));
        fabricanteP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        fabricanteP.setForeground(new java.awt.Color(1, 1, 1));

        lblPrecio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(254, 254, 254));
        lblPrecio.setText("Cantidad:");

        cantidadP.setBackground(new java.awt.Color(254, 254, 254));
        cantidadP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        cantidadP.setForeground(new java.awt.Color(1, 1, 1));

        lblGarantia.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGarantia.setForeground(new java.awt.Color(254, 254, 254));
        lblGarantia.setText("Código Tienda:");

        idTP.setBackground(new java.awt.Color(254, 254, 254));
        idTP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        idTP.setForeground(new java.awt.Color(1, 1, 1));

        regresar.setBackground(new java.awt.Color(1, 1, 1));
        regresar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(254, 254, 254));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(1, 1, 1));
        registrar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(254, 254, 254));
        registrar.setText("Registrar Producto");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        lblGarantia2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGarantia2.setForeground(new java.awt.Color(253, 251, 251));
        lblGarantia2.setText("Precio:");

        garantiaP.setBackground(new java.awt.Color(254, 254, 254));
        garantiaP.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        garantiaP.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(lblCodigo)
                    .addComponent(lblCodigoFabricante)
                    .addComponent(lblPrecio)
                    .addComponent(lblGarantia2)
                    .addComponent(lblGarantia)
                    .addComponent(lblGarantia1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreP)
                        .addComponent(idP, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(fabricanteP))
                    .addComponent(garantiaP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTP, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desP, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(942, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(fabricanteP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoFabricante))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(cantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGarantia2)
                            .addComponent(precioP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGarantia)
                            .addComponent(idTP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(garantiaP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGarantia1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblDescripcion)
                        .addGap(28, 28, 28)
                        .addComponent(desP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePActionPerformed

    private void idPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        String nombre = nombreP.getText();
        String fabricante = fabricanteP.getText();
        String codigo = idP.getText();
        int cantidad = 0;
        Double precio = 0.0;
        String idTienda = idTP.getText();
        String descripcion = desP.getText();
        int garantia = 0;
        if(!cantidadP.getText().equals("")){
            cantidad = Integer.parseInt(cantidadP.getText());
        }
        if(!precioP.getText().equals("")){
            precio = Double.parseDouble(precioP.getText());
        }
         if(!garantiaP.getText().equals("")){
            garantia = Integer.parseInt(garantiaP.getText());
        }
      
        
        if(nombre.equals("") || fabricante.equals("") || codigo.equals("") || idTienda.equals("") ){
            JOptionPane.showMessageDialog(null, "Ingrese CAMPOS OBLIGATORIOS");
        }else{
            PRODUCTO ingresar = new PRODUCTO(nombre, fabricante, codigo, cantidad, precio , idTienda, descripcion, garantia);
            NuevosDatos_Entidades.NuevosProducto llamar = new NuevosProducto();
            if(!llamar.insertarProducto(ingresar))
                {
                   JOptionPane.showMessageDialog(null, "ERROR NO SE PUEDE INGRESAR" + nombre + "Datos errones o repetidos"+ fabricante + "Datos errones o repetidos" 
                           + codigo + "Datos errones o repetidos" + cantidad + "Datos errones o repetidos" + precio + "Datos errones o repetidos" + idTienda + "Datos errones o repetidos" + descripcion + "Datos errones o repetidos" + garantia + "Datos errones o repetidos");
                   
                }else{
                JOptionPane.showMessageDialog(null, "PRODUCTO agregado");
                EmpleadosMenu regresar = new EmpleadosMenu();
                regresar.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadP;
    private javax.swing.JTextField desP;
    private javax.swing.JTextField fabricanteP;
    private javax.swing.JTextField garantiaP;
    private javax.swing.JTextField idP;
    private javax.swing.JTextField idTP;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoFabricante;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblGarantia1;
    private javax.swing.JLabel lblGarantia2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField nombreP;
    private javax.swing.JTextField precioP;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
