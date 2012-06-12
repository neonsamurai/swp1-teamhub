package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.security.Timestamp;
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
    private Timestamp erstellDatum;
    /**
     * @attribute
     */
    private Timestamp aenderungsDatum;
    @OneToOne
    private Benutzer autor;

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
        hash = 67 * hash + (this.autor != null ? this.autor.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Kommentar{" + ", autor=" + autor+ "text=" + text + '}';
    }
     
     
}
