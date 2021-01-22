/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
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
public class ClienteDao {

    @Inject
    private Connection con;

    @Inject
    private EntityManager em;

    public boolean insertJPA(Cliente entity) {
        em.persist(entity);
        return true;
    }

    public boolean updateJPA(Cliente entity) {
        em.merge(entity);
        return true;
    }

    public Cliente readJPA(int id) {
        Cliente cliente = em.find(Cliente.class, id);
        return cliente;
    }

    public boolean deleteJPA(String id) {
        Cliente t = em.find(Cliente.class, id);
        em.remove(t);
        return true;
    }
    
    public List<Cliente> getListaClientes() {
        String jpql = "SELECT v FROM Cliente v";

        Query q = em.createQuery(jpql, Cliente.class);

        List<Cliente> listado = q.getResultList();

        return listado;
    }

}
