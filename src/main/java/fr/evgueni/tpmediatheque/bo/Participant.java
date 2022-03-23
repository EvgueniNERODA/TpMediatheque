package fr.evgueni.tpmediatheque.bo;

import java.util.List;

public class Participant {
    private long id;
    private String nom;
    private String prenom;
    private List<Film> filmList;

    public Participant(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.filmList = filmList;
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

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
}
