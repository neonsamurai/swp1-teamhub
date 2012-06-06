/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamhub.maventeamhub.dao;

import com.teamhub.maventeamhub.model.Kommentar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tim
 */
@Stateless
public class KommentarFacade extends AbstractFacade<Kommentar> {
    @PersistenceContext(unitName = "com.teamhub_mavenTeamHub_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KommentarFacade() {
        super(Kommentar.class);
    }
    
}
