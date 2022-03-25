package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "realisateur")
public class Realisateur extends Personne{
    /*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true )
    @JoinColumn(name = "realisateur_id")
    private List<Film> realisateurFilmList;

     */

    public Realisateur() {
    }

    public Realisateur(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

}
