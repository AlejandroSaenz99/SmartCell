/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author AlejandroSaenz
 */
public class DVentas {
    private int Folio;
    private int Id_Producto;
    private String Descripcion;
    private float precio;

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public DVentas() {
    }

    public DVentas(int Folio, int Id_Producto, String Descripcion, float precio) {
        this.Folio = Folio;
        this.Id_Producto = Id_Producto;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }
}
