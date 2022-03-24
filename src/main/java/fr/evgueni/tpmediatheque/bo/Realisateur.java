package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "realisateur")
public class Realisateur extends Personne{

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true )
    @JoinColumn(name = "realisateur_id")
    private List<Film> realisateurFilmList;

    public Realisateur(List<Film> realisateurFilmList) {
        this.realisateurFilmList = realisateurFilmList;
    }

    public Realisateur(long id, String nom, String prenom, List<Film> realisateurFilmList) {
        super(id, nom, prenom);
        this.realisateurFilmList = realisateurFilmList;
    }

    public Realisateur() {

    }

    public List<Film> getRealisateurFilmList() {
        return realisateurFilmList;
    }

    public void setRealisateurFilmList(List<Film> realisateurFilmList) {
        this.realisateurFilmList = realisateurFilmList;
    }
}
