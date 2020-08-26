/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ConexionBD.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danielferova
 */
public class VerProductos extends javax.swing.JInternalFrame {
    PreparedStatement ps = null;
     ResultSet rs = null;
    /**
     * Creates new form Ver 
     */
    public VerProductos() {
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
        nombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        buscarProducto = new javax.swing.JButton();
        lblCodigo1 = new javax.swing.JLabel();
        tienda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        codigo = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        buscarProducto1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 109, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PRODUCTOS\n");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre.setText("Nombre:");

        nombre.setBackground(new java.awt.Color(254, 254, 254));
        nombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        nombre.setForeground(new java.awt.Color(1, 1, 1));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo.setText("Código Producto:");

        buscarProducto.setBackground(new java.awt.Color(1, 1, 1));
        buscarProducto.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        buscarProducto.setForeground(new java.awt.Color(254, 254, 254));
        buscarProducto.setText("Buscar Producto");
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });

        lblCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo1.setText("Tienda:");

        tienda.setBackground(new java.awt.Color(254, 254, 254));
        tienda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        tienda.setForeground(new java.awt.Color(1, 1, 1));

        tablaProducto.setBackground(new java.awt.Color(254, 254, 254));
        tablaProducto.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        tablaProducto.setForeground(new java.awt.Color(1, 1, 1));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fabricante", "Código", "Cantidad", "Precion", "Código Tienda", "Descripción", "Garantía"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        codigo.setBackground(new java.awt.Color(254, 254, 254));
        codigo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        codigo.setForeground(new java.awt.Color(1, 1, 1));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre1.setText("Buscar por:");

        buscarProducto1.setBackground(new java.awt.Color(1, 1, 1));
        buscarProducto1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        buscarProducto1.setForeground(new java.awt.Color(254, 254, 254));
        buscarProducto1.setText("Ver todos los Productos");
        buscarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProducto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre1)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(buscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addGap(7, 7, 7)
                        .addComponent(lblNombre1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        // TODO add your handling code here:
        String campo = nombre.getText();
        String campo1 = codigo.getText();
        String campo2 = tienda.getText();
        String where = "";
        
        if(!"".equals(campo)||!"".equals(campo1)||!"".equals(campo2)){
            where = "WHERE Nombre_Producto = '" + campo + "' OR Id_Producto ='" + campo1 +"' OR Id_Tienda ='" + campo2 + "'";
               }
        try {
            DefaultTableModel model = new DefaultTableModel();
            tablaProducto.setModel(model);
            Conexion con = new Conexion();
            Connection c = con.conectandoBase();
            
            String sql = "SELECT * FROM PRODUCTO " + where ;
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            
            model.addColumn("Nombre");
            model.addColumn("Fabricante");
            model.addColumn("Código");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Código Tienda");
            model.addColumn("Descripción");
            model.addColumn("Garantía");
            while(rs.next()){
                
                Object [] filas = new Object[cantidadC];
                for(int i = 0; i< cantidadC; i++){
                  filas[i] = rs.getObject(i + 1);
            }
                model.addRow(filas);
                limpiarCampos();
            }
            
        }catch(SQLException ex) {     
        }
        
    }//GEN-LAST:event_buscarProductoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

         //metodo para limpiar
    public void limpiarCampos(){
        nombre.setText("");
        codigo.setText("");
        tienda.setText("");
    }
    
    
    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void buscarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProducto1ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = new DefaultTableModel();
            tablaProducto.setModel(model);
            Conexion con = new Conexion();
            Connection c = con.conectandoBase();
            
            String sql = "SELECT * FROM PRODUCTO ";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            
            model.addColumn("Nombre");
            model.addColumn("Fabricante");
            model.addColumn("Código");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Código Tienda");
            model.addColumn("Descripción");
            model.addColumn("Garantía");
            while(rs.next()){
                
                Object [] filas = new Object[cantidadC];
                for(int i = 0; i< cantidadC; i++){
                  filas[i] = rs.getObject(i + 1);
            }
                model.addRow(filas);
               
            }
            
        }catch(SQLException ex) {     
        }
    }//GEN-LAST:event_buscarProducto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProducto;
    private javax.swing.JButton buscarProducto1;
    private javax.swing.JTextField codigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField tienda;
    // End of variables declaration//GEN-END:variables
}
