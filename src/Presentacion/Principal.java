/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Color;

/**
 *
 * @author AlejandroSaenz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        Servi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        V = new javax.swing.JLabel();
        V1 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        EA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 241, 246));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Servi.setFont(new java.awt.Font("Tahoma", 0, 230)); // NOI18N
        Servi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.jpeg"))); // NOI18N
        Servi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Servi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ServiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ServiMouseExited(evt);
            }
        });
        panel.add(Servi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, 180));

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        V.setBackground(new java.awt.Color(255, 255, 255));
        V.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        V.setText("   Ventas");
        V.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V.setOpaque(true);
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VMouseExited(evt);
            }
        });

        V1.setBackground(new java.awt.Color(255, 255, 255));
        V1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        V1.setText("  Servicios");
        V1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V1.setOpaque(true);
        V1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                V1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                V1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 600, -1));

        Cerrar.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(102, 102, 102));
        Cerrar.setText("X");
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });

        EA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EA.setForeground(new java.awt.Color(0, 0, 255));
        EA.setText("Administrador >");
        EA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EAMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EA))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseClicked

    private void ServiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiMouseEntered

    }//GEN-LAST:event_ServiMouseEntered

    private void VMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseEntered
V.setOpaque(true);     
V.setBackground(Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_VMouseEntered

    private void ServiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiMouseExited
      // TODO add your handling code here:
    }//GEN-LAST:event_ServiMouseExited

    private void VMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseExited
V.setBackground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_VMouseExited

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
Cerrar.setOpaque(true);
Cerrar.setBackground(Color.red);
Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
Cerrar.setOpaque(false);
Cerrar.setBackground(Color.lightGray); 
Cerrar.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseExited

    private void VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseClicked
Ventas v=new Ventas();
v.setVisible(true);
dispose();
    }//GEN-LAST:event_VMouseClicked

    private void ServiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiMouseClicked
    }//GEN-LAST:event_ServiMouseClicked

    private void EAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAMouseEntered
EA.setOpaque(true);
        EA.setBackground(Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_EAMouseEntered

    private void EAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAMouseExited
EA.setOpaque(false);
        EA.setBackground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_EAMouseExited

    private void EAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAMouseClicked
Pass P=new Pass();
P.setVisible(true);

    }//GEN-LAST:event_EAMouseClicked

    private void V1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V1MouseClicked
Servicios S=new Servicios();
S.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_V1MouseClicked

    private void V1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V1MouseEntered
V1.setOpaque(true);     
V1.setBackground(Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_V1MouseEntered

    private void V1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V1MouseExited
V1.setBackground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_V1MouseExited

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel EA;
    private javax.swing.JLabel Servi;
    private javax.swing.JLabel V;
    private javax.swing.JLabel V1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
