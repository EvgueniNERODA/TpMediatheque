package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "participant")
public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;

    /* Associations */
    @ManyToMany(mappedBy = "acteurs")
    private List<Film> acteursFilmList;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "realisateur")
    private List<Film> realisateurFilmList;

    public Participant(long id, String nom, String prenom, List<Film> acteursFilmList, List<Film> realisateurFilmList) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.acteursFilmList = acteursFilmList;
        this.realisateurFilmList = realisateurFilmList;
    }

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

    public List<Film> getActeursFilmList() {
        return acteursFilmList;
    }

    public void setActeursFilmList(List<Film> acteursFilmList) {
        this.acteursFilmList = acteursFilmList;
    }

    public List<Film> getRealisateurFilmList() {
        return realisateurFilmList;
    }

    public void setRealisateurFilmList(List<Film> realisateurFilmList) {
        this.realisateurFilmList = realisateurFilmList;
    }
}
