/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import CargaArchivo.archivoCarga;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author danielferova
 */
public class inicioArchivo extends javax.swing.JFrame {
     javax.swing.JFileChooser buscador = new JFileChooser();
     String imagen =  "intelaf2.png";

    /**
     * Creates new form inicioArchivo
     */
    public inicioArchivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        cargarIcono(imagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextArchivo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        intelaf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cargar.setBackground(new java.awt.Color(1, 1, 1));
        Cargar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Cargar.setForeground(new java.awt.Color(246, 242, 242));
        Cargar.setText("Cargar Archivo");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 242, 242));
        jLabel1.setText("Seleccione el Archivo TXT");

        Buscar.setBackground(new java.awt.Color(23, 16, 16));
        Buscar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(252, 245, 245));
        Buscar.setText("Buscar Archivo");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 243, 243));
        jLabel2.setText("Archivo TXT:");

        jTextArchivo.setBackground(new java.awt.Color(247, 228, 228));

        salir.setBackground(new java.awt.Color(5, 5, 5));
        salir.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(247, 245, 245));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        intelaf.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(intelaf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intelaf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
         buscador.showOpenDialog(buscador);
         jTextArchivo.setText(buscador.getSelectedFile().getName());
    }//GEN-LAST:event_BuscarActionPerformed
 public void cargarIcono(String NombreImagen)
    {
       ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(NombreImagen));
       ImageIcon imageIconFinal = new ImageIcon(imageIcon.getImage().getScaledInstance(intelaf.getWidth(), intelaf.getHeight(), Image.SCALE_DEFAULT));
       intelaf.setIcon(imageIconFinal);
    }
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
          File txt;
          try {
            String path = buscador.getSelectedFile().getAbsolutePath();
            String lectura = "";
            txt = new File(path);
            archivoCarga cargar = new archivoCarga();
                    cargar.llamandoArchivo(txt);
            
        } catch (Exception e) {
        }
          
           this.setVisible(false);
        new IngresarUsuario().setVisible(true);
    }//GEN-LAST:event_CargarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //System.exit(0);
        // this.setVisible(false);
        //new IngresarUsuario().setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cargar;
    private javax.swing.JLabel intelaf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextArchivo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}