/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Starman
 */
public class FacDetalle implements Serializable {

    private int numeroDetalle;
    private Producto producto;
    private double subtotal;

    public int getNumeroDetalle() {
        return numeroDetalle;
    }

    public void setNumeroDetalle(int numeroDetalle) {
        this.numeroDetalle = numeroDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
