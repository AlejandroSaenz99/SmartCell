/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Datos.ConexionBD;
import Datos.DMarcas;
import Datos.DModelos;
import Datos.DProductos;
import Datos.DRegistros;
import Datos.DServicios;
import Datos.DVentas;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlejandroSaenz
 */
public class Metodos {

    Statement sentenciaSQL;

    ConexionBD con;

    public static PreparedStatement sentencia_preparada;

    public static ResultSet resultado;

    public static String url;

    public static int Resultado_numero = 0;

    public void GuardarMarca(DMarcas pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO Marcas (Marca) VALUES(?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setString(1, pdto.getMarca());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Marca registrada", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void GuardarVentas(DVentas pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO ventas (Folio,Descripcion,Precio) VALUES(?,?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setInt(1, pdto.getFolio());
            sentencia_preparada.setString(2, pdto.getDescripcion());
            sentencia_preparada.setFloat(3, pdto.getPrecio());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                this.con.CerrarConexion();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void GuardarRegistros(DRegistros pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO registros (Numero_De_Servicio,Fecha,Nombre,Telefono,Tipo,Marca,Modelo,Estado,Servicio,Nota,Precio,Anticipo,Total,Status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setInt(1, pdto.getNumero_De_Servicio());
            sentencia_preparada.setString(2, pdto.getFecha());
            sentencia_preparada.setString(3, pdto.getNombre());
            sentencia_preparada.setString(4, pdto.getTelefono());
            sentencia_preparada.setString(5, pdto.getTipo());
            sentencia_preparada.setString(6, pdto.getMarca());
            sentencia_preparada.setString(7, pdto.getModelo());
            sentencia_preparada.setString(8, pdto.getEstado());
            sentencia_preparada.setString(9, pdto.getServicio());
            sentencia_preparada.setString(10, pdto.getNota());
            sentencia_preparada.setFloat(11, pdto.getPrecio());
            sentencia_preparada.setFloat(12, pdto.getAnticipo());
            sentencia_preparada.setFloat(13, pdto.getTotal());
            sentencia_preparada.setString(14, pdto.getStatus());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Completado", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void GuardarProducto(DProductos pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO Productos (Id,Descripcion,Precio) VALUES(?,?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setInt(1, pdto.getId());
            sentencia_preparada.setString(2, pdto.getDescripcion());
            sentencia_preparada.setFloat(3, pdto.getPrecio());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Producto registrado", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void GuardarServicio(DServicios pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO Servicios (Marca,Modelo,Servicio,Precio) VALUES(?,?,?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setString(1, pdto.getMarca());
            sentencia_preparada.setString(2, pdto.getModelo());
            sentencia_preparada.setString(3, pdto.getServicio());
            sentencia_preparada.setFloat(4, pdto.getPrecio());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Servicio registrado ", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void GuardarModelo(DModelos pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO Modelos (Marca,Modelo) VALUES(?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setString(1, pdto.getMarca());
            sentencia_preparada.setString(2, pdto.getModelo());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Modelo registrado", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public static String Buscar_Marca(String Marca) {

        String Busqueda_Ticket = null;
        Connection conexion = null;
        try {
            ConexionBD con = new ConexionBD();
            String Sentencia_Buscar_Ticket = "SELECT Marca FROM Marcas WHERE Marca='" + Marca + "'";

            PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Ticket);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {

                Busqueda_Ticket = "Marca ya existe";
            } else {

                Busqueda_Ticket = "Marca no existe";
            }
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Busqueda_Ticket;
    }

    public static String Buscar_Modelo(String Marca, String Modelo) {
        String Busqueda_Ticket = null;
        Connection conexion = null;
        try {
            ConexionBD con = new ConexionBD();
            String Sentencia_Buscar_Ticket = "SELECT * FROM Modelos WHERE Marca='" + Marca + "' AND Modelo='" + Modelo + "'";

            PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Ticket);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {

                Busqueda_Ticket = "Datos encontrados";
            } else {

                Busqueda_Ticket = "Marca no existe";
            }
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return Busqueda_Ticket;
    }

    public TextAutoCompleter autocompletarMarca(JTextField texto) {
        TextAutoCompleter ac2 = null;
        ac2 = new TextAutoCompleter(texto);
        try {
            String sql = "SELECT Marca FROM Marcas";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            while (rs.next()) {
                ac2.addItem(rs.getString("Marca"));
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ac2;
    }

    public TextAutoCompleter autocompletarModelo(String Marca, JTextField texto) {
        TextAutoCompleter ac2 = null;
        ac2 = new TextAutoCompleter(texto);
        try {
            String sql = "SELECT * FROM Modelos Where Marca='" + Marca + "'";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            while (rs.next()) {
                ac2.addItem(rs.getString("Modelo"));
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ac2;
    }

    public ComboBoxModel LlenarComboMarca() {
        JComboBox combo = null;
        combo = new JComboBox();
        combo.addItem("Marca");
        try {

            String sql = "SELECT Marca FROM Marcas Order by Marca";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            while (rs.next()) {

                combo.addItem(rs.getString("Marca"));
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
        return combo.getModel();
    }

    public ComboBoxModel LlenarComboModelo(String Marca) {
        JComboBox combo = null;
        combo = new JComboBox();
        combo.addItem("Modelo");
        try {

            String sql = "SELECT * FROM modelos Where Marca='" + Marca + "'";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            while (rs.next()) {

                combo.addItem(rs.getString("modelo"));
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
        return combo.getModel();
    }

    public void EliminarMarca(String Marca) {
        try {
            String sql = "DELETE FROM Marcas WHERE Marca='" + Marca + "'";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            int n = this.sentenciaSQL.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado: ", "Confimacion", 1);
            }
            this.con.CerrarConexion();
            this.sentenciaSQL.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error 1: " + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error 2: " + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Error 3: " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4: " + ex);
        }
    }

    public void EliminarServicio(String Marca, String Modelo, String Servicio, float Precio) {
        try {
            String sql = "DELETE FROM servicios WHERE Marca='" + Marca + "' AND Modelo='" + Modelo + "' AND Servicio='" + Servicio + "' AND Precio=" + Precio + "";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            int n = this.sentenciaSQL.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado: ", "Confimacion", 1);
            }
            this.con.CerrarConexion();
            this.sentenciaSQL.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error 1: " + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error 2: " + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Error 3: " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4: " + ex);
        }
    }

    public void EliminarModelo(String Marca, String Modelo) {
        try {
            System.out.println(Marca + " " + Modelo);
            String sql = "DELETE FROM modelos WHERE marca='" + Marca + "' AND modelo='" + Modelo + "'";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            int n = this.sentenciaSQL.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Modelo Eliminado: ", "Confimacion", 1);
            }
            this.con.CerrarConexion();
            this.sentenciaSQL.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error 1: " + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error 2: " + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Error 3: " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4: " + ex);
        }
    }

    public void EliminarProductos(int ID) {
        try {
            String sql = "DELETE FROM productos WHERE Id=" + ID + "";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            int n = this.sentenciaSQL.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado: ", "Atencion", 1);
            }
            this.con.CerrarConexion();
            this.sentenciaSQL.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error 1: " + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error 2: " + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Error 3: " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4: " + ex);
        }
    }

    public JTable MostrarTablaCentrosDeCarga(JTable TablaCentro) {
        try {

            String sql = "SELECT * FROM centrocarga";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaCentro.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaCentro;
    }

    public JTable MostrarTablaMarcas(JTable TablaCentro, String Marcas) {
        try {

            String sql = "SELECT * FROM Servicios where Marca='" + Marcas + "'";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaCentro.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaCentro;
    }

    public JTable MostrarTablaServicios(JTable TablaServicios, String Marca, String Modelo) {
        try {

            String sql = "SELECT * FROM Servicios Where marca='" + Marca + "' AND Modelo='" + Modelo + "' ";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaServicios.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaServicios;
    }

    public JTable MostrarTablaProductos(JTable TablaP) {
        try {

            String sql = "SELECT * FROM Productos";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaP.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaP;
    }

    public JTable ConsultarPrecios(int Codigo, JTable TablaP) {
        try {

            String sql = "SELECT * FROM productos Where Id=" + Codigo + "";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaP.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaP;
    }

    public static String VerificarContraseñaActual(String Actual) {
        /*  99 */ String Busqueda_Usuario = null;
        /* 100 */ Connection conexion = null;
        /*     */ try {
            /* 102 */ ConexionBD con = new ConexionBD();
            /* 103 */ String Sentencia_Buscar_Usuario = "SELECT * FROM pass WHERE Contraseña='" + Actual + "'";
            /*     */
 /* 105 */ PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Usuario);
            /* 106 */ resultado = sentencia_preparada.executeQuery();
            /* 107 */ if (resultado.next()) {
                /*     */
 /* 109 */ Busqueda_Usuario = "Contraseña encontrada";
                /*     */            } else {
                /*     */
 /* 112 */ Busqueda_Usuario = "Contraseña no encontrado";
                /*     */            }
            /* 114 */ sentencia_preparada.close();
            /* 115 */ conexion.close();
            /* 116 */        } catch (Exception e) {
            /* 117 */ System.out.println(e);
            /*     */        }
        /* 119 */ return Busqueda_Usuario;
        /*     */    }

    public void ModificarContraseña(String Nueva) {
        String sql = "UPDATE pass SET Contraseña=? WHERE Id=0";
        try {
            this.con = new ConexionBD();
            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
            sentencia_preparada.setString(1, Nueva);

            int n = sentencia_preparada.executeUpdate();
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Contraseña Actualizada", "Atencion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public void ModificarCostoCentroCarga(String Modelo, float Precio) {
        String sql = "UPDATE centrocarga SET Precio=? WHERE Tipo='" + Modelo + "'";
        try {
            this.con = new ConexionBD();
            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
            sentencia_preparada.setFloat(1, Precio);

            int n = sentencia_preparada.executeUpdate();
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Precio Actualizado", "Atencion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public int ConsultarNumeroServicio() {
        int Id = 10000;
        try {
            String sql = "SELECT * FROM registros ORDER BY Numero_De_Servicio Desc limit 1";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.first()) {
                Id = rs.getInt("Numero_De_Servicio");
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return Id + 1;
    }

    public int ConsultarFolio() {
        int Folio = 0;
        try {
            String sql = "SELECT * FROM ventas ORDER BY Folio Desc limit 1";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.first()) {
                Folio = rs.getInt("Folio");
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return Folio + 1;
    }

    public int ConsultarIdProductos() {
        int Id = 1000;
        try {
            String sql = "SELECT * FROM Productos ORDER BY Id Desc limit 1";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.first()) {
                Id = rs.getInt("Id");
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return Id + 1;
    }

    public static String BuscarProducto(String Producto) {
        /*  99 */ String Busqueda_Producto = null;
        /* 100 */ Connection conexion = null;
        /*     */ try {
            /* 102 */ ConexionBD con = new ConexionBD();
            /* 103 */ String Sentencia_Buscar_Producto = "SELECT Descripcion FROM productos WHERE Descripcion='" + Producto + "'";
            /*     */
 /* 105 */ PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Producto);
            /* 106 */ resultado = sentencia_preparada.executeQuery();
            /* 107 */ if (resultado.next()) {
                /*     */
 /* 109 */ Busqueda_Producto = "Producto ya existe";
                /*     */            } else {
                /*     */
 /* 112 */ Busqueda_Producto = "Producto no existe";
                /*     */            }
            System.out.println(Busqueda_Producto);
            /* 114 */ sentencia_preparada.close();
            /* 115 */ conexion.close();
            /* 116 */        } catch (Exception e) {
            /* 117 */ System.out.println(e);
            /*     */        }
        /* 119 */ return Busqueda_Producto;
        /*     */    }

    public JTable BuscarArticulo(JTable TablaArticulo, String busqueda, String categoria) {
        try {

            String sql = "SELECT * FROM productos WHERE " + categoria + " LIKE '" + busqueda + "%'";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaArticulo.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaArticulo;
    }

    public JTable BuscarPrecioServicio(JTable TablaArticulo, String busqueda, String categoria) {
        try {

            String sql = "SELECT * FROM servicios WHERE " + categoria + " LIKE '" + busqueda + "%'";
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaArticulo.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        return TablaArticulo;
    }

    public DRegistros ConsultarRegistros(DRegistros prov) {
        try {
            String sql = "SELECT * FROM registros WHERE Numero_De_Servicio=" + prov.getNumero_De_Servicio();
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.next()) {
                prov.setNumero_De_Servicio(rs.getInt("Numero_De_Servicio"));
                prov.setNombre(rs.getString("Nombre"));
                prov.setTelefono(rs.getString("Telefono"));
                prov.setTipo(rs.getString("Tipo"));
                prov.setMarca(rs.getString("Marca"));
                prov.setModelo(rs.getString("Modelo"));
                prov.setEstado(rs.getString("Estado"));
                prov.setServicio(rs.getString("Servicio"));
                prov.setNota(rs.getString("Nota"));
                prov.setPrecio(rs.getFloat("Precio"));
                prov.setAnticipo(rs.getFloat("Anticipo"));
                prov.setTotal(rs.getFloat("Total"));
                prov.setFecha(rs.getString("Fecha"));
                prov.setStatus(rs.getString("Status"));

            } else {
                JOptionPane.showMessageDialog(null, "No encontrado", "Warning", 0);
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return prov;
    }

    public DProductos BuscarProducto(DProductos prov) {
        try {
            String sql = "SELECT * FROM productos WHERE Id=" + prov.getId();
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.next()) {
                prov.setDescripcion(rs.getString("Descripcion"));
                prov.setPrecio(rs.getFloat("Precio"));

            } else {
                JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return prov;
    }

    public void ActualizarRegistro(DRegistros pdto) {
        String sql = "UPDATE registros SET Numero_De_Servicio=?,Fecha=?,Nombre=?,Telefono=?,Tipo=?,Marca=?,Modelo=?,Estado=?,Servicio=?,Nota=?,Precio=?,Anticipo=?,Total=?, Status=? WHERE Numero_De_Servicio=?";
        try {

            this.con = new ConexionBD();
            PreparedStatement pst = this.con.Conectarse().prepareStatement(sql);
            pst.setInt(1, pdto.getNumero_De_Servicio());
            pst.setString(2, pdto.getFecha());
            pst.setString(3, pdto.getNombre());
            pst.setString(4, pdto.getTelefono());
            pst.setString(5, pdto.getTipo());
            pst.setString(6, pdto.getMarca());
            pst.setString(7, pdto.getModelo());
            pst.setString(8, pdto.getEstado());
            pst.setString(9, pdto.getServicio());
            pst.setString(10, pdto.getNota());
            pst.setFloat(11, pdto.getPrecio());
            pst.setFloat(12, pdto.getAnticipo());
            pst.setFloat(13, pdto.getTotal());
            pst.setString(14, pdto.getStatus());

            pst.setInt(15, pdto.getNumero_De_Servicio());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado", "Confirmacion", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public ComboBoxModel BuscarServicios(String Marca, String modelo) {
        JComboBox combo = null;
        combo = new JComboBox();
        combo.addItem("Servicio");
        combo.addItem("Centro de carga");
        try {

            String sql = "SELECT servicio FROM servicios Where marca='" + Marca + "' and modelo='" + modelo + "' Order by servicio";

            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            while (rs.next()) {

                combo.addItem(rs.getString("servicio"));
            }
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
        return combo.getModel();
    }

    public float ConsultarPrecioCC(String CentroC) {
        float precio = 0;
        try {
            String sql = "SELECT * FROM centrocarga WHERE Tipo='" + CentroC + "'";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.next()) {
                precio = (rs.getFloat("Precio"));

                JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return precio;
    }

    public float ConsultarPrecioOtro(String Marca, String Modelo,String Servicio) {
        float precio = 0;
        try {
            String sql = "SELECT * FROM servicios WHERE Marca='"+Marca+"' AND Modelo='"+Modelo+"' AND servicio='" + Servicio + "'";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            if (rs.next()) {
                precio = (rs.getFloat("Precio"));

                JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
            }
            this.sentenciaSQL.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
        }
        return precio;
    }
}
