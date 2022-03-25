package fr.evgueni.tpmediatheque.dao;

import fr.evgueni.tpmediatheque.bll.PersonneManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DAO{


    @Autowired
    @Qualifier("filmRepo")
    private IDAOFilm idaoFilm;

    @Autowired
    @Qualifier("personneRepo")
    private IDAOPersonne idaoPersonne;

       public IDAOFilm getIdaoFilm(){
           return idaoFilm;
       }


       public IDAOPersonne getIDAOPersonne() {
            return idaoPersonne;
        }
}
