/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Starman
 */
public class FacCabecera implements Serializable{

   
    private int codigoFac;
    private Date fecha;
    private double total;
    private Cliente cliente;
    private List<FacDetalle> facDetalle;

    public int getCodigoFac() {
        return codigoFac;
    }

    public void setCodigoFac(int codigoFac) {
        this.codigoFac = codigoFac;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FacDetalle> getFacDetalle() {
        return facDetalle;
    }

    public void setFacDetalle(List<FacDetalle> facDetalle) {
        this.facDetalle = facDetalle;
    }

    @Override
    public String toString() {
        return "FacCabecera{" + "codigoFac=" + codigoFac + ", fecha=" + fecha + ", total=" + total + ", cliente=" + cliente + ", facDetalle=" + facDetalle + '}';
    }

}
