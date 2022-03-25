package fr.evgueni.tpmediatheque.bo;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;


    /* Associations */
    @LazyCollection(LazyCollectionOption.FALSE) //pour éviter MultipleBagFetchException enlever (fetch = FetchType.EAGER) et ajouter @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "film_acteur", joinColumns = {@JoinColumn(name = "film_pkey")}, inverseJoinColumns = {@JoinColumn(name = "acteur_pkey")})
    private List<Acteur> acteurs;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Realisateur realisateur;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Genre genre;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Avis> avisList;


    public Film(long id, String titre, int annee, int duree, String synopsis, List<Acteur> acteurs, Genre genre, List<Avis> avisList) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.acteurs = acteurs;
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

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Avis> getAvisList() {
        return avisList;
    }

    public void setAvisList(List<Avis> avisList) {
        this.avisList = avisList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }
}
