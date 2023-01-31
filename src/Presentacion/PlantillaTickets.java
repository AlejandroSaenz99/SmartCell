/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.DRegistros;
import Metodos.Metodos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author AlejandroSaenz
 */
public class PlantillaTickets extends javax.swing.JPanel implements Printable {

   String nombreImagen="";
    BufferedImage imagen;
    public PlantillaTickets() {
        initComponents();
    }
    public ImageIcon GenerarCodigo(String valor){
        try {
            Barcode codigo=null;
            
            codigo=BarcodeFactory.createCode128(valor);
            codigo.setDrawingText(false);
            codigo.setBarWidth(1);
            codigo.setBarHeight(45);
            imagen=new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g= (Graphics2D) imagen.getGraphics();
            codigo.draw(g, 5,20);
        } catch (BarcodeException | OutputException ex) {
            Logger.getLogger(AñadirProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon img=new ImageIcon(imagen);
        return img;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Modelo = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        C = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        CID = new javax.swing.JLabel();
        NS = new javax.swing.JLabel();
        JLFecha = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtServicio1 = new javax.swing.JLabel();
        lbImagenCodigo = new javax.swing.JLabel();
        txtTipo1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        txtTotal1 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JLabel();
        txtAnticipo1 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Facebook1 = new javax.swing.JLabel();
        Facebook2 = new javax.swing.JLabel();
        Facebook3 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtId.setText("00001");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel12.setText("Marca:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 40, -1));

        Modelo.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Modelo.setText("Modelo:");
        add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        H.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        H.setText("Servicio:");
        add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, -1));

        txtNota1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, 20));

        C.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        C.setText("Costo  total:");
        add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, -1));

        A.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A.setText("Anticipo:");
        add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, -1));

        CID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        CID.setText("00000");
        add(CID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        NS.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        NS.setText("Numero de servicio:");
        add(NS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        JLFecha.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        JLFecha.setText("10/04/2022");
        add(JLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, -1));

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Nombre.setText("Nombre:");
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 20));

        Telefono.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Telefono.setText("Telefono:");
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        txtNombre1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtNombre1.setText("Esperando");
        txtNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombre1MouseClicked(evt);
            }
        });
        add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

        txtTelefono1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtTelefono1.setText("Esperando");
        txtTelefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefono1MouseClicked(evt);
            }
        });
        add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, -1));

        Fecha1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Fecha1.setText("Fecha:");
        add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtModelo1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtModelo1.setText("Esperando");
        txtModelo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModelo1MouseClicked(evt);
            }
        });
        add(txtModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 60, -1));

        txtMarca1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtMarca1.setText("Esperando");
        txtMarca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMarca1MouseClicked(evt);
            }
        });
        add(txtMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));

        A1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A1.setText("Pendiente:");
        add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setText("lineas en pantalla o golpes.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setText("conociendo el riesgo que este lleva");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setText("caso de cualquier daño.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setText("estrellada, dispositivos con humedad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 140, -1));

        txtTipo.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        txtTipo.setText("Tipo:");
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Facebook.setFont(new java.awt.Font("Tahoma", 0, 6)); // NOI18N
        Facebook.setText("SmartCell  Cardenas");
        add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Autorizo que SmartCell realice la ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("reparacion pertinente en el dispositivo,");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setText("sin hacer responsable a SmartCell en ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("*Garantia unicamente por defectos de");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel10.setText("fabrica no aplica casos de pantalla ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 130, -1));

        txtServicio1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtServicio1.setText("Esperando");
        add(txtServicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, -1));

        lbImagenCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lbImagenCodigo.setOpaque(true);
        add(lbImagenCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 110, 69));

        txtTipo1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtTipo1.setText("Esperando");
        txtTipo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTipo1MouseClicked(evt);
            }
        });
        add(txtTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 10));

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtEstado.setText("Esperando");
        txtEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEstadoMouseClicked(evt);
            }
        });
        add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 50, -1));

        txtTotal1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtTotal1.setText("Esperando");
        add(txtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 70, -1));

        txtPrecio1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtPrecio1.setText("Esperando");
        add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 70, -1));

        txtAnticipo1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtAnticipo1.setText("Esperando");
        add(txtAnticipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 70, -1));

        F1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        F1.setText("Nota:");
        add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel11.setText("Estado:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        Facebook1.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        Facebook1.setText("Facebook:");
        add(Facebook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Facebook2.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        Facebook2.setText("Whatsapp:");
        add(Facebook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Facebook3.setFont(new java.awt.Font("Tahoma", 0, 6)); // NOI18N
        Facebook3.setText("(639)1047612");
        add(Facebook3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 38, 50, 10));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REal2 - Copy.jpeg"))); // NOI18N
        add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel13.setText("Después de 30 dias no nos hacemos");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setText("responsables por equipos.");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombre1MouseClicked
        //escribir.setVisible(true);
        txtNombre1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1MouseClicked

    private void txtTelefono1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefono1MouseClicked
        txtTelefono1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1MouseClicked

    private void txtModelo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModelo1MouseClicked
        txtModelo1.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModelo1MouseClicked

    private void txtMarca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarca1MouseClicked
        txtMarca1.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_txtMarca1MouseClicked

    private void txtTipo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipo1MouseClicked

    private void txtEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel C;
    public javax.swing.JLabel CID;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel Facebook1;
    private javax.swing.JLabel Facebook2;
    private javax.swing.JLabel Facebook3;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel H;
    public javax.swing.JLabel JLFecha;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel NS;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel lbImagenCodigo;
    public javax.swing.JLabel txtAnticipo1;
    public javax.swing.JLabel txtEstado;
    public javax.swing.JLabel txtId;
    public javax.swing.JLabel txtMarca1;
    public javax.swing.JLabel txtModelo1;
    public javax.swing.JLabel txtNombre1;
    public javax.swing.JTextField txtNota1;
    public javax.swing.JLabel txtPrecio1;
    public javax.swing.JLabel txtServicio1;
    public javax.swing.JLabel txtTelefono1;
    private javax.swing.JLabel txtTipo;
    public javax.swing.JLabel txtTipo1;
    public javax.swing.JLabel txtTotal1;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
if(pageIndex==0){
    Graphics2D graphics2d=(Graphics2D) graphics;
    graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    printAll(graphics2d);
    return PAGE_EXISTS;
}
else{
    return NO_SUCH_PAGE;
}
    }
}