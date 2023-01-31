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
public class DRegistros {
    private int Numero_De_Servicio;
    private String Fecha;
    private String Nombre;
    private String Telefono;
    private String Tipo;
    private String Marca;
    private String Modelo;
    private String Estado;
    private String Servicio;
    private String Nota;
    private float Precio;
    private float Anticipo;
    private float Total;

    public int getNumero_De_Servicio() {
        return Numero_De_Servicio;
    }

    public void setNumero_De_Servicio(int Numero_De_Servicio) {
        this.Numero_De_Servicio = Numero_De_Servicio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public float getAnticipo() {
        return Anticipo;
    }

    public void setAnticipo(float Anticipo) {
        this.Anticipo = Anticipo;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DRegistros(int Numero_De_Servicio, String Fecha, String Nombre, String Telefono, String Tipo, String Marca, String Modelo, String Estado, String Servicio, String Nota, float Precio, float Anticipo, float Total, String Status) {
        this.Numero_De_Servicio = Numero_De_Servicio;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Estado = Estado;
        this.Servicio = Servicio;
        this.Nota = Nota;
        this.Precio = Precio;
        this.Anticipo = Anticipo;
        this.Total = Total;
        this.Status = Status;
    }

    public DRegistros() {
    }
    private String Status;
}