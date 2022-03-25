package fr.evgueni.tpmediatheque.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BLLManager {

    @Autowired
    private FilmManager filmManager;

    @Autowired
    private PersonneManager personneManager;

    public FilmManager getFilmManager(){
        return filmManager;
    }

    public PersonneManager getMmembreManager(){
        return personneManager;
    }
}
