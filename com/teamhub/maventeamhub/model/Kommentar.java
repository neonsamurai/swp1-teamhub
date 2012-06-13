package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Kommentar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
     * @attribute
     */
    private String text;
    /**
     * @attribute
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date erstellDatum;
    /**
     * @attribute
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date aenderungsDatum;
    @ManyToOne
    private Benutzer autor;
    
    @ManyToOne
    private Aufgabe elternAufgabe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the erstellDatum
     */
    public Date getErstellDatum() {
        return erstellDatum;
    }

    /**
     * @param erstellDatum the erstellDatum to set
     */
    public void setErstellDatum(Date erstellDatum) {
        this.erstellDatum = erstellDatum;
    }

    /**
     * @return the aenderungsDatum
     */
    public Date getAenderungsDatum() {
        return aenderungsDatum;
    }

    /**
     * @param aenderungsDatum the aenderungsDatum to set
     */
    public void setAenderungsDatum(Date aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kommentar) {
            Kommentar ob = (Kommentar) obj;
            if (ob.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 67 * hash + (this.text != null ? this.text.hashCode() : 0);
        hash = 67 * hash + (this.erstellDatum != null ? this.erstellDatum.hashCode() : 0);
        hash = 67 * hash + (this.getAutor() != null ? this.getAutor().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return text;
    }

    /**
     * @return the autor
     */
    public Benutzer getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Benutzer autor) {
        this.autor = autor;
    }

    /**
     * @return the elternAufgabe
     */
    public Aufgabe getElternAufgabe() {
        return elternAufgabe;
    }

    /**
     * @param elternAufgabe the elternAufgabe to set
     */
    public void setElternAufgabe(Aufgabe elternAufgabe) {
        this.elternAufgabe = elternAufgabe;
    }
     
     
}
