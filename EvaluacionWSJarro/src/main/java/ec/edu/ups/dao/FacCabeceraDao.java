/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.FacCabecera;
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
public class FacCabeceraDao {

    @Inject
    private Connection con;

    @Inject
    private EntityManager em;

    public boolean insertJPA(FacCabecera entity) {
        em.persist(entity);
        return true;
    }

    public boolean updateJPA(FacCabecera entity) {
        em.merge(entity);
        return true;
    }

    public FacCabecera readJPA(int id) {
        FacCabecera facC = em.find(FacCabecera.class, id);
        return facC;
    }

    public boolean deleteJPA(String id) {
        FacCabecera p = em.find(FacCabecera.class, id);
        em.remove(p);
        return true;
    }

    public List<FacCabecera> getListaFacturas() {
        String jpql = "SELECT v FROM FacCabecera v";

        Query q = em.createQuery(jpql, FacCabecera.class);

        List<FacCabecera> listado = q.getResultList();

        return listado;
    }

}
