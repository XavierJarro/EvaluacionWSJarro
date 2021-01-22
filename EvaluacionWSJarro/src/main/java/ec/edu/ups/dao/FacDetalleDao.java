/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.FacDetalle;
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
public class FacDetalleDao {

    @Inject
    private Connection con;

    @Inject
    private EntityManager em;

    public boolean insertJPA(FacDetalle entity) {
        em.persist(entity);
        return true;
    }

    public boolean updateJPA(FacDetalle entity) {
        em.merge(entity);
        return true;
    }

    public FacDetalle readJPA(int id) {
        FacDetalle facC = em.find(FacDetalle.class, id);
        return facC;
    }

    public boolean deleteJPA(String id) {
        FacDetalle p = em.find(FacDetalle.class, id);
        em.remove(p);
        return true;
    }

    public List<FacDetalle> getListaFacturasDetalle() {
        String jpql = "SELECT v FROM FacDetalle v";

        Query q = em.createQuery(jpql, FacDetalle.class);

        List<FacDetalle> listado = q.getResultList();

        return listado;
    }
}
