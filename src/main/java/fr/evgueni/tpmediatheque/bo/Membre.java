package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;

@Entity
@Table(name = "membre")
public class Membre extends Personne{

    private String login;
    private String motDePasse;
    private boolean isAdmmin;

    /* Associations */
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Avis avis;


    public Membre(String login, String motDePasse, boolean isAdmmin, Avis avis) {
        this.login = login;
        this.motDePasse = motDePasse;
        this.isAdmmin = isAdmmin;
        this.avis = avis;
    }

    public Membre(long id, String nom, String prenom, String login, String motDePasse, boolean isAdmmin, Avis avis) {
        super(id, nom, prenom);
        this.login = login;
        this.motDePasse = motDePasse;
        this.isAdmmin = isAdmmin;
        this.avis = avis;
    }

    public Membre() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isAdmmin() {
        return isAdmmin;
    }

    public void setAdmmin(boolean admmin) {
        isAdmmin = admmin;
    }

    public Avis getAvis() {
        return avis;
    }

    public void setAvis(Avis avis) {
        this.avis = avis;
    }
}
