/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Tour {
    //Atributos encapsulados
    private String nombre;
    private String destino;
    private int precio;
    
    //Constructores 
    public Tour() {
    }

    public Tour(String nombre, String destino, int precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }
    
    
    //Metodo accesores y mutadores.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour{" + "nombre=" + nombre + ", destino=" + destino + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
