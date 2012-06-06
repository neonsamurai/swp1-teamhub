package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Aufgabe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
     * @attribute
     */
    private String beschreibung;
    /**
     * @attribute
     */
    private String titel;
   
    /**
     * @attribute
     */
    private Timestamp erstellDatum;
    /**
     * @attribute
     */
    private Timestamp faelligkeitsDatum;
    /**
     * @attribute
     */
    private Timestamp aenderungsDatum;
    private Prioritaet prioritaet;
    private AufgabenStatus status;
    /**
     * @associates <{uml.Projekt}>
     */
    @ManyToOne
    private Projekt elternProjekt;

    void aufgabeAnhalten() {
    }

    void aufgabeFortsetzen() {
    }

    public void aufgabeSchliessen() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
     * @return the erstellDatum
     */
    public Timestamp getErstellDatum() {
        return erstellDatum;
    }

    /**
     * @param erstellDatum the erstellDatum to set
     */
    public void setErstellDatum(Timestamp erstellDatum) {
        this.erstellDatum = erstellDatum;
    }

    /**
     * @return the faelligkeitsDatum
     */
    public Timestamp getFaelligkeitsDatum() {
        return faelligkeitsDatum;
    }

    /**
     * @param faelligkeitsDatum the faelligkeitsDatum to set
     */
    public void setFaelligkeitsDatum(Timestamp faelligkeitsDatum) {
        this.faelligkeitsDatum = faelligkeitsDatum;
    }

    /**
     * @return the aenderungsDatum
     */
    public Timestamp getAenderungsDatum() {
        return aenderungsDatum;
    }

    /**
     * @param aenderungsDatum the aenderungsDatum to set
     */
    public void setAenderungsDatum(Timestamp aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }

    /**
     * @return the prioritaet
     */
    public Prioritaet getPrioritaet() {
        return prioritaet;
    }

    /**
     * @param prioritaet the prioritaet to set
     */
    public void setPrioritaet(Prioritaet prioritaet) {
        this.prioritaet = prioritaet;
    }

    /**
     * @return the status
     */
    public AufgabenStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(AufgabenStatus status) {
        this.status = status;
    }

    /**
     * @return the elternProjekt
     */
    public Projekt getElternProjekt() {
        return elternProjekt;
    }

    /**
     * @param elternProjekt the elternProjekt to set
     */
    public void setElternProjekt(Projekt elternProjekt) {
        this.elternProjekt = elternProjekt;
    }
}
