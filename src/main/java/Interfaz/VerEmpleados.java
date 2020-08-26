/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import EntidadesMapeo.EMPLEADO;
import NuevosDatos_Entidades.NuevosEmpleados;
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
public class VerEmpleados extends javax.swing.JInternalFrame {
     PreparedStatement ps = null;
     ResultSet rs = null;
     

    /**
     * Creates new form VerEmpleados
     */
    public VerEmpleados() {
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

        codigoEmpleado = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        buscarEmpleados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        codigoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreE = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        lblCodigo1 = new javax.swing.JLabel();

        codigoEmpleado.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        codigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEmpleadoActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 111, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMPLEADOS\n");

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo.setText("Nombre:");

        buscarEmpleados.setBackground(new java.awt.Color(1, 1, 1));
        buscarEmpleados.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        buscarEmpleados.setForeground(new java.awt.Color(254, 254, 254));
        buscarEmpleados.setText("Buscar Empleado");
        buscarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadosActionPerformed(evt);
            }
        });

        tablaEmpleados.setBackground(new java.awt.Color(254, 254, 254));
        tablaEmpleados.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        tablaEmpleados.setForeground(new java.awt.Color(1, 1, 1));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Código", "Teléfono", "DPI", "NIT", "Correo Electrónico", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
        }

        codigoNombre.setBackground(new java.awt.Color(253, 251, 251));
        codigoNombre.setForeground(new java.awt.Color(1, 1, 1));
        codigoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Buscar por:");

        nombreE.setBackground(new java.awt.Color(254, 254, 254));
        nombreE.setForeground(new java.awt.Color(1, 1, 1));

        regresar.setBackground(new java.awt.Color(1, 1, 1));
        regresar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(254, 254, 254));
        regresar.setText("Ver todos los Empleados");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        lblCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(254, 254, 254));
        lblCodigo1.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(lblCodigo1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCodigo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(nombreE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(350, 350, 350))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(buscarEmpleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(regresar)))
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         //en mi boton 
    private void buscarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadosActionPerformed
        // TODO add your handling code here:
        String campo = codigoNombre.getText();
        String campo1 = nombreE.getText();
        String where = "";
        
        if(!"".equals(campo)||!"".equals(campo1)){
            where = "WHERE Id_Empleado = '" + campo + "' OR Nombre_Empleado = '" + campo1 +"'";
               }
        try {
            DefaultTableModel model = new DefaultTableModel();
            tablaEmpleados.setModel(model);
            Conexion con = new Conexion();
            Connection c = con.conectandoBase();
            
            String sql = "SELECT * FROM EMPLEADO " + where ;
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            
            model.addColumn("Nombre");
            model.addColumn("Código");
            model.addColumn("Teléfono");
            model.addColumn("DPI");
            model.addColumn("NIT");
            model.addColumn("Correo Eléctronico");
            model.addColumn("Dirección");
            
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
    }//GEN-LAST:event_buscarEmpleadosActionPerformed

    private void codigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEmpleadoActionPerformed

    private void codigoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codigoNombreActionPerformed

        //metodo para limpiar
    public void limpiarCampos(){
        codigoNombre.setText("");
        nombreE.setText("");
    }
    
    
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
         try {
            DefaultTableModel model = new DefaultTableModel();
            tablaEmpleados.setModel(model);
            Conexion con = new Conexion();
            Connection c = con.conectandoBase();
            
            String sql = "SELECT * FROM EMPLEADO";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            
            model.addColumn("Nombre");
            model.addColumn("Código");
            model.addColumn("Teléfono");
            model.addColumn("DPI");
            model.addColumn("NIT");
            model.addColumn("Correo Eléctronico");
            model.addColumn("Dirección");
            
            while(rs.next()){
                
                Object [] filas = new Object[cantidadC];
                for(int i = 0; i< cantidadC; i++){
                  filas[i] = rs.getObject(i + 1);
            }
                model.addRow(filas);
                
            }
            
        }catch(SQLException ex) {     
        }
       
    }//GEN-LAST:event_regresarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarEmpleados;
    private javax.swing.JTextField codigoEmpleado;
    private javax.swing.JTextField codigoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JTextField nombreE;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables

    private Connection conectandoBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
