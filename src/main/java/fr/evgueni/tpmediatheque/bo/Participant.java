package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;


    private long id;
    private String nom;
    private String prenom;

    /* Associations */
    /*
    @ManyToMany(mappedBy = "acteurs")
    private List<Film> acteursFilmList;

     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true )
    @JoinColumn(name = "realisateur_id")
    private List<Film> realisateurFilmList;


    public Participant() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public List<Film> getRealisateurFilmList() {
        return realisateurFilmList;
    }

    public void setRealisateurFilmList(List<Film> realisateurFilmList) {
        this.realisateurFilmList = realisateurFilmList;
    }
}
