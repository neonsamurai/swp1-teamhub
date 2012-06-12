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
     * @return the projektAufgaben
     */
    public Collection getProjektAufgaben() {
        return projektAugaben;
    }

    /**
     * @param projektAugaben the projektAugaben to set
     */
    public void setProjektAufgaben(Collection projektAugaben) {
        this.projektAugaben = projektAugaben;
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
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Projekt) {
            Projekt ob = (Projekt) obj;
            if (ob.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 59 * hash + (this.titel != null ? this.titel.hashCode() : 0);
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.beschreibung != null ? this.beschreibung.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Projekt{" + "titel=" + titel + ", beschreibung=" + beschreibung + '}';
    }
    
    
}
