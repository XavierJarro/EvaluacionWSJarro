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
import ec.edu.ups.service.Respuesta;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Starman
 */
@Stateless
public class GestionFacturasON implements GestionFacturasONRemoto, GestionFacturasONLocal {

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

    public boolean registrarProducto(Producto producto) {
        productoDao.insertJPA(producto);
        return true;
    }

    public Respuesta anadirProducto(int codigo, int cantidad) {
        Respuesta respuesta = new Respuesta();
        Producto producto = productoDao.readJPA(codigo);
        try {
            if (producto == null) {
                respuesta.setCodigo(1);
                respuesta.setDescripcion("producto no existe");
            } else {
                respuesta.setCodigo(2);
                respuesta.setDescripcion(producto.getDescripcion());
            }
        } catch (Exception e) {
            respuesta.setCodigo(3);
            respuesta.setDescripcion(e.getMessage());
        }
        return respuesta;
    }

    public Respuesta anadirCliente(String cedula, String nombre, String correo) {
        Respuesta respuesta = new Respuesta();
        Cliente cli = clienteDao.readJPA(cedula);
        try {
            if (cli == null) {
                respuesta.setCodigo(1);
                respuesta.setDescripcion("cliente no existe");
            } else {

                List<Producto> productos = productoDao.getListaProductos();
                double total = 0.0;
                for (Producto pro : productos) {
                    total += pro.getPrecio()*pro.getCantidad();
                    System.out.println(pro.getCantidad());
                }
                

                respuesta.setCodigo(2);
                respuesta.setDescripcion(String.valueOf(total));
            }
        } catch (Exception e) {
            respuesta.setCodigo(3);
            respuesta.setDescripcion(e.getMessage());
        }
        return respuesta;
    }

}
