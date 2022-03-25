package fr.evgueni.tpmediatheque.dao;

import fr.evgueni.tpmediatheque.bo.Acteur;
import fr.evgueni.tpmediatheque.bo.Membre;

import java.util.List;

public interface IDAOPersonne {


    List<Membre> selectAllMembres ();

    List<Acteur> getActeursFilm (long idFilm);
}
