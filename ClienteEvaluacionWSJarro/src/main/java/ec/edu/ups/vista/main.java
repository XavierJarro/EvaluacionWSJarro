/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Respuesta;

/**
 *
 * @author Starman
 */
public class main {

    public static void main(String args[]) {

        CarritoCli carritoCli = new CarritoCli();

        String resultado = carritoCli.anadirProducto(1, 2);
        System.out.println(resultado);
        resultado = carritoCli.anadirProducto(2, 1);
        System.out.println(resultado);
        
        String resultadocli = carritoCli.realizarCompra("0104796230","Xavier Jarro","xavier@correo.com");
        System.out.println(resultadocli);
    }
}
