/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.service;

import ec.edu.ups.negocio.GestionFacturasONLocal;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Starman
 */
@Path("/factura")
public class ServicioCarritoREST {

    @Inject
    private GestionFacturasONLocal on;

    @POST
    @Path("/producto")
    @Produces("application/json")
    @Consumes("application/json")
    public Respuesta realizarTransaccionBancaria(ProductoRest productoRest) {
        return on.anadirProducto(productoRest.getCodigo(), productoRest.getCantidad());
    }

    @POST
    @Path("/cliente")
    @Produces("application/json")
    @Consumes("application/json")
    public Respuesta realizarTransaccionBancaria(ClienteRest clienteRest) {
        return on.anadirCliente(clienteRest.getCedula(), clienteRest.getNombre(), clienteRest.getCorreo());
    }

}
