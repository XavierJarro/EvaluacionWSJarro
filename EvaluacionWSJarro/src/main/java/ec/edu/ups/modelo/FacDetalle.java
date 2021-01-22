/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Starman
 */
@Entity
public class FacDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int numeroDetalle;
    private List<Producto> producto;
    private double subtotal;

    public int getNumeroDetalle() {
        return numeroDetalle;
    }

    public void setNumeroDetalle(int numeroDetalle) {
        this.numeroDetalle = numeroDetalle;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "FacDetalle{" + "numeroDetalle=" + numeroDetalle + ", producto=" + producto + ", subtotal=" + subtotal + '}';
    }

}
