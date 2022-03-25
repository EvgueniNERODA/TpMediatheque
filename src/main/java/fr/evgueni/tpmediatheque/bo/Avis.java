package fr.evgueni.tpmediatheque.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "avis")
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int note;
    private String commentaire;

    /* Associations */
    /*
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Film avisFilm;

     */

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "avis")
    private List<Membre> listeAvisMembres;

    public Avis(long id, int note, String commentaire, List<Membre> listeAvisMembres) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
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


    public List<Membre> getListeAvisMembres() {
        return listeAvisMembres;
    }

    public void setListeAvisMembres(List<Membre> listeAvisMembres) {
        this.listeAvisMembres = listeAvisMembres;
    }
}
