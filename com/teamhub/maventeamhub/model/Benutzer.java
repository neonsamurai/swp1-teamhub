package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Benutzer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
     * @attribute
     */
    private String benutzerName;
    /**
     * @attribute
     */
    private String passwort;
    /**
     * @associates <{uml.Kommentar}>
     */
    @OneToMany
    private Collection<Kommentar> meineKommentare;
    /**
     * @associates <{uml.Aufgabe}>
     */
    @OneToMany
    private Collection<Aufgabe> meineAufgaben;
    /**
     * @associates <{uml.Projekt}>
     */
    @OneToMany
    private Collection<Projekt> meineProjekte;

    void aufgabeAendern(Aufgabe aufgabe, String titel, String beschreibung, Timestamp aenderungsDatum) {
    }

    void aufgabeZuweisen(Benutzer benutzer, Aufgabe aufgabe) {
    }

    void kommentarAendern(Kommentar kommentar, String text) {
    }

    void prioritaetAendern(Aufgabe aufgabe, Prioritaet prioritaet) {
    }

    void passwortAendern(String neuesPasswort) {
    }

    void abmelden() {
    }

    void anmelden(String name, String passwort) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the benutzerName
     */
    public String getBenutzerName() {
        return benutzerName;
    }

    /**
     * @param benutzerName the benutzerName to set
     */
    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }

    /**
     * @return the passwort
     */
    public String getPasswort() {
        return passwort;
    }

    /**
     * @param passwort the passwort to set
     */
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    /**
     * @return the autor
     */
    public Collection getAutor() {
        return meineKommentare;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Collection autor) {
        this.meineKommentare = autor;
    }

    /**
     * @return the ersteller
     */
    public Collection getErsteller() {
        return meineAufgaben;
    }

    /**
     * @param ersteller the ersteller to set
     */
    public void setErsteller(Collection ersteller) {
        this.meineAufgaben = ersteller;
    }

    /**
     * @return the besitzer
     */
    public Collection getBesitzer() {
        return meineProjekte;
    }

    /**
     * @param besitzer the besitzer to set
     */
    public void setBesitzer(Collection besitzer) {
        this.meineProjekte = besitzer;
    }
}
