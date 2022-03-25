package fr.evgueni.tpmediatheque.bll;

import fr.evgueni.tpmediatheque.bo.Acteur;
import fr.evgueni.tpmediatheque.bo.Membre;
import fr.evgueni.tpmediatheque.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonneManager {

    @Autowired
    DAO dao;

    public List<Membre> selectAllMembres (){
        return dao.getIDAOPersonne().selectAllMembres();
    }

    public List<Acteur> getActeursFilm (long idFilm) {
        return dao.getIDAOPersonne().getActeursFilm(idFilm);
    }
}
