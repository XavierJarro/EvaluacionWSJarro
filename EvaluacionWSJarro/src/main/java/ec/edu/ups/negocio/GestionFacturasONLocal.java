/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.service.Respuesta;
import javax.ejb.Local;

/**
 *
 * @author Starman
 */
@Local
public interface GestionFacturasONLocal {

    public boolean registrarCliente(Cliente cliente);

    public boolean registrarProducto(Producto producto);

    public Respuesta anadirProducto(int codigo, int cantidad);

    public Respuesta anadirCliente(String cedula, String nombre, String correo);

}
