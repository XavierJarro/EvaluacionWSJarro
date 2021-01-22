/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.FacCabeceraDao;
import ec.edu.ups.dao.FacDetalleDao;
import ec.edu.ups.dao.ProductoDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Starman
 */
@Stateless
public class GestionFacturasON implements GestionFacturasONLocal {

    @Inject
    private ClienteDao clienteDao;

    @Inject
    private ProductoDao productoDao;

    @Inject
    private FacCabeceraDao facCabeceraDao;

    @Inject
    private FacDetalleDao facDetalleDao;

    public boolean registrarCliente(Cliente cliente) {
        clienteDao.insertJPA(cliente);
        return true;
    }
    
    public boolean registrarProducto(Producto producto){
        productoDao.insertJPA(producto);
        return true;
    }

}
