/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamhub.maventeamhub.dao;

import com.teamhub.maventeamhub.model.Aufgabe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tim
 */
@Stateless
public class AufgabeFacade extends AbstractFacade<Aufgabe> {
    @PersistenceContext(unitName = "com.teamhub_mavenTeamHub_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AufgabeFacade() {
        super(Aufgabe.class);
    }
    
}
