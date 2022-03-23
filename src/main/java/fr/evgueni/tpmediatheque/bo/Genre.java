package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;

    /* Associations */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "genre")
    private List<Film> filmGenreList;

    public Genre(long id, String libelle, List<Film> filmGenreList) {
        this.id = id;
        this.libelle = libelle;
        this.filmGenreList = filmGenreList;
    }

    public Genre() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Film> getFilmGenreList() {
        return filmGenreList;
    }

    public void setFilmGenreList(List<Film> filmGenreList) {
        this.filmGenreList = filmGenreList;
    }
}
