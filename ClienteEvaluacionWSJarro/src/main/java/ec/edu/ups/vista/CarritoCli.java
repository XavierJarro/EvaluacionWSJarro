/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import ec.edu.ups.modelo.Producto;

/**
 *
 * @author Starman
 */
public class CarritoCli {

    private String WS_SAVE_PRODUCTO = "http://localhost:8083/EvaluacionWSJarro/rs/factura/producto";
    private String WS_SAVE_CLIENTE = "http://localhost:8083/EvaluacionWSJarro/rs/factura/cliente";

    public String anadirProducto(int codigo, int cantidad) {

        Producto pro = new Producto();

        pro.setCodigo(codigo);
        pro.setCantidad(cantidad);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_PRODUCTO);
        String respuesta = target.request().post(Entity.json(pro), String.class);

        return respuesta;
    }
    
    public String realizarCompra(String cedula, String nombre, String correo) {

        Cliente cli = new Cliente();
        
        cli.setCedula(cedula);
        cli.setCorreo(correo);
        cli.setNombre(nombre);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_CLIENTE);
        String respuesta = target.request().post(Entity.json(cli), String.class);

        return respuesta;
    }

}
