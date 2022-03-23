package fr.evgueni.tpmediatheque.bo;

import java.util.List;

public class Genre {

    private long id;
    private String libelle;
    private List<Film> filmGenreList;

    public Genre(long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
        this.filmGenreList = filmGenreList;
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
