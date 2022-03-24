package fr.evgueni.tpmediatheque.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "acteur")
public class Acteur extends Personne{

    /* Associations */
    /*
    @ManyToMany(mappedBy = "acteurs")
    private List<Film> acteursFilmList;

     */

    public Acteur() {
    }

    public Acteur(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }



}
