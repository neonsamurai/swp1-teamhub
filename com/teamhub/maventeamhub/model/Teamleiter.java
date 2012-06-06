package com.teamhub.maventeamhub.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Teamleiter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    /**
     * @associates <{uml.Benutzer}>
     */
    @OneToMany
    private Collection<Benutzer> teamleiterListe;

    void projektAendern(Projekt projekt, String titel, String beschreibung) {
    }

    void projektSchliessen(Projekt projekt) {
    }

    void benutzerPwdZuruecksetzen(Benutzer benutzer) {
    }

    void benutzerAendern(Benutzer benutzer, String name, String passwort) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the teamleiterListe
     */
    public Collection getTeamleiterListe() {
        return teamleiterListe;
    }

    /**
     * @param teamleiterListe the teamleiterListe to set
     */
    public void setTeamleiterListe(Collection teamleiterListe) {
        this.teamleiterListe = teamleiterListe;
    }
}
