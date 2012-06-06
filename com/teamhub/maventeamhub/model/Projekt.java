package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Projekt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
     * @attribute
     */
    private String titel;
    /**
     * @associates <{uml.Aufgabe}>
     */
    @OneToMany
    private Collection<Aufgabe> projektAugaben;
    private String name;
    /**
     * @attribute
     */
    private String beschreibung;
    private ProjektStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return the elternProjekt
     */
    public Collection getElternProjekt() {
        return projektAugaben;
    }

    /**
     * @param elternProjekt the elternProjekt to set
     */
    public void setElternProjekt(Collection elternProjekt) {
        this.projektAugaben = elternProjekt;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * @return the status
     */
    public ProjektStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ProjektStatus status) {
        this.status = status;
    }
}
