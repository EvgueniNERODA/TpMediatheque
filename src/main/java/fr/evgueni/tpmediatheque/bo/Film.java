package fr.evgueni.tpmediatheque.bo;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;


    /* Associations */
    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "film_participant", joinColumns = {@JoinColumn(name = "film_pkey")}, inverseJoinColumns = {@JoinColumn(name = "participant_pkey")})
    private List<Participant> acteurs;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Participant realisateur;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Genre genre;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "avisFilm")
    private List<Avis> avisList;

    public Film(long id, String titre, int annee, int duree, String synopsis, List<Participant> acteurs, Participant realisateur, Genre genre, List<Avis> avisList) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.acteurs = acteurs;
        this.realisateur = realisateur;
        this.genre = genre;
        this.avisList = avisList;
    }

    public Film(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Avis> getAvisList() {
        return avisList;
    }

    public void setAvisList(List<Avis> avisList) {
        this.avisList = avisList;
    }
}
