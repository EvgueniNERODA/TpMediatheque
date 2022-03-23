package fr.evgueni.tpmediatheque.dao;

import fr.evgueni.tpmediatheque.bll.MembreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DAO{


    @Autowired
    @Qualifier("filmRepo")
    private IDAOFilm idaoFilm;

    @Autowired
    @Qualifier("membreRepo")
    private IDAOMembre idaoMembre;

       public IDAOFilm getIdaoFilm(){
           return idaoFilm;
       }


        public IDAOMembre getIDAOMembre() {
            return idaoMembre;
        }
}
