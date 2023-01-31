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
public class DProductos {
    private int Id;
    private String Descripcion;
    private float Precio;
    private String CodBarras;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.CodBarras = CodBarras;
    }

    public DProductos(int Id, String Descripcion, float Precio, String CodBarras) {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.CodBarras = CodBarras;
    }

    public DProductos() {
    }
}