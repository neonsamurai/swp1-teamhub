/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamhub.maventeamhub.dao;

import com.teamhub.maventeamhub.model.Projekt;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tim
 */
@Stateless
public class ProjektFacade extends AbstractFacade<Projekt> {
    @PersistenceContext(unitName = "com.teamhub_mavenTeamHub_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjektFacade() {
        super(Projekt.class);
    }
    
}
