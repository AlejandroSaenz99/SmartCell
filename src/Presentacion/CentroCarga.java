/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Metodos.Metodos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author AlejandroSaenz
 */
public class CentroCarga extends javax.swing.JFrame {

    /**
     * Creates new form CentroCarga
     */
    public CentroCarga() {
        initComponents();
                setResizable(false);

        MostrarTabla();
    }
public void MostrarTabla(){
Metodos Met=new Metodos();
Met.MostrarTablaCentrosDeCarga(TablaCarga);
}
public void Procesar(){
if(txtCosto.getText().isEmpty()){JOptionPane.showMessageDialog(null, "Por favor establece una cantidad");}
else{
        Metodos M=new Metodos();
      M.ModificarCostoCentroCarga(txtCentro.getSelectedItem().toString(),Float.parseFloat(txtCosto.getText()));
      txtCosto.setText("");
      MostrarTabla();}}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Smart = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Servicios = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Productos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        CentroCarga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCarga = new javax.swing.JTable();
        Boton = new javax.swing.JLabel();
        txtCentro = new javax.swing.JComboBox<>();
        txtCosto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 705));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 705));

        Smart.setBackground(new java.awt.Color(204, 204, 0));
        Smart.setFont(new java.awt.Font("Arial Black", 0, 60)); // NOI18N
        Smart.setForeground(new java.awt.Color(255, 255, 255));
        Smart.setText(" SmartCell");
        Smart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Smart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SmartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SmartMouseExited(evt);
            }
        });

        Servicios.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setText("        Servicios");
        Servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ServiciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ServiciosMouseExited(evt);
            }
        });

        Productos.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Productos.setForeground(new java.awt.Color(255, 255, 255));
        Productos.setText("       Productos");
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductosMouseExited(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("      Contraseña");
        Contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaMouseExited(evt);
            }
        });

        CentroCarga.setBackground(new java.awt.Color(204, 204, 204));
        CentroCarga.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        CentroCarga.setForeground(new java.awt.Color(255, 255, 255));
        CentroCarga.setText("  Centro de carga");
        CentroCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CentroCarga.setOpaque(true);
        CentroCarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CentroCargaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CentroCargaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CentroCargaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Smart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator4)
                    .addComponent(Servicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CentroCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Smart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(Servicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña)
                .addGap(14, 14, 14)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CentroCarga)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        TablaCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaCarga);

        Boton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Boton.setText("   Modificar");
        Boton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        Boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMouseExited(evt);
            }
        });

        txtCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V8", "Tipo C", "Iphone", "Otro" }));

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        jLabel2.setText("Costo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseClicked
Procesar();
    }//GEN-LAST:event_BotonMouseClicked

    private void SmartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartMouseClicked
        
        dispose();
    }//GEN-LAST:event_SmartMouseClicked

    private void SmartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartMouseEntered
        Smart.setOpaque(true);
        Smart.setBackground(Color.LIGHT_GRAY);
        Smart.setFont(new java.awt.Font("Arial Black", 0, 62));
    }//GEN-LAST:event_SmartMouseEntered

    private void SmartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartMouseExited
        Smart.setOpaque(false);
        Smart.setBackground(Color.white);
        Smart.setFont(new java.awt.Font("Arial Black", 0, 60));
        Smart.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_SmartMouseExited

    private void ServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseClicked
        AñadirServicios A=new AñadirServicios();
        A.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ServiciosMouseClicked

    private void ServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseEntered

        Servicios.setOpaque(true);
        Servicios.setBackground(Color.LIGHT_GRAY);
        Servicios.setFont(new java.awt.Font("Arial Black", 0, 38));
    }//GEN-LAST:event_ServiciosMouseEntered

    private void ServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseExited
        Servicios.setOpaque(false);
        Servicios.setBackground(Color.white);
        Servicios.setFont(new java.awt.Font("Arial Black", 0, 36));        // TODO add your handling code here:
    }//GEN-LAST:event_ServiciosMouseExited

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
AñadirProductos P=new AñadirProductos();
P.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosMouseClicked

    private void ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseEntered
        Productos.setOpaque(true);
        Productos.setBackground(Color.LIGHT_GRAY);
        Productos.setFont(new java.awt.Font("Arial Black", 0, 38));        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosMouseEntered

    private void ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseExited
        Productos.setOpaque(false);
        Productos.setBackground(Color.white);
        Productos.setFont(new java.awt.Font("Arial Black", 0, 36));        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosMouseExited

    private void ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseClicked
        ModificarContraseña A=new ModificarContraseña();
        A.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaMouseClicked

    private void ContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseEntered
        Contraseña.setOpaque(true);
        Contraseña.setBackground(Color.LIGHT_GRAY);
        Contraseña.setFont(new java.awt.Font("Arial Black", 0, 38));         // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaMouseEntered

    private void ContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseExited
        Contraseña.setOpaque(false);
        Contraseña.setBackground(Color.white);
        Contraseña.setFont(new java.awt.Font("Arial Black", 0, 36));        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaMouseExited

    private void CentroCargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CentroCargaMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_CentroCargaMouseClicked

    private void CentroCargaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CentroCargaMouseEntered
                 // TODO add your handling code here:
    }//GEN-LAST:event_CentroCargaMouseEntered

    private void CentroCargaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CentroCargaMouseExited
       // TODO add your handling code here:
    }//GEN-LAST:event_CentroCargaMouseExited

    private void BotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseEntered
       Boton.setBackground(Color.black);
       Boton.setOpaque(true);
       Boton.setForeground(Color.white);
        Boton.setFont(new java.awt.Font("Tahoma Bold", 0, 15));
    }//GEN-LAST:event_BotonMouseEntered

    private void BotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseExited
Boton.setBackground(Color.white);
       Boton.setOpaque(false);
       Boton.setForeground(Color.black); 
 Boton.setFont(new java.awt.Font("Tahoma", 0, 15));       // TODO add your handling code here:
    }//GEN-LAST:event_BotonMouseExited

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
Procesar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
  char car = evt.getKeyChar();
        if (car != '.' && car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5' && car != '6' && car != '7' && car != '8' && car != '9') {
            evt.consume(); }             // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyTyped

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
            java.util.logging.Logger.getLogger(CentroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton;
    private javax.swing.JLabel CentroCarga;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel Smart;
    private javax.swing.JTable TablaCarga;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> txtCentro;
    private javax.swing.JTextField txtCosto;
    // End of variables declaration//GEN-END:variables
}
