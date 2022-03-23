package fr.evgueni.tpmediatheque.bo;

import java.util.List;

public class Avis {

    private long id;
    private int note;
    private String commentaire;
    private Film avisFilm;
    private List<Membre> listeAvisMembres;

    public Avis(long id, int note, String commentaire, Film avisFilm, List<Membre> listeAvisMembres) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
        this.avisFilm = avisFilm;
        this.listeAvisMembres = listeAvisMembres;
    }

    public Avis (){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Film getAvisFilm() {
        return avisFilm;
    }

    public void setAvisFilm(Film avisFilm) {
        this.avisFilm = avisFilm;
    }

    public List<Membre> getListeAvisMembres() {
        return listeAvisMembres;
    }

    public void setListeAvisMembres(List<Membre> listeAvisMembres) {
        this.listeAvisMembres = listeAvisMembres;
    }
}
