/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Producto;
import java.sql.Connection;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Starman
 */
@Stateless
public class ProductoDao {

    @Inject
    private Connection con;

    @Inject
    private EntityManager em;

    public boolean insertJPA(Producto entity) {
        em.persist(entity);
        return true;
    }

    public boolean updateJPA(Producto entity) {
        em.merge(entity);
        return true;
    }

    public Producto readJPA(int id) {
        Producto pro = em.find(Producto.class, id);
        return pro;
    }

    public boolean deleteJPA(String id) {
        Producto p = em.find(Producto.class, id);
        em.remove(p);
        return true;
    }

    public List<Producto> getListaProductos() {
        String jpql = "SELECT v FROM Producto v";

        Query q = em.createQuery(jpql, Producto.class);

        List<Producto> listado = q.getResultList();

        return listado;
    }

}
