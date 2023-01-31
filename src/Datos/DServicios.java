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
public class DServicios {
    private String Marca;
    private String Modelo;
    private String Servicio;
    private float Precio;

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

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public DServicios(String Marca, String Modelo, String Servicio, float Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Servicio = Servicio;
        this.Precio = Precio;
    }

    public DServicios() {
    }
}
