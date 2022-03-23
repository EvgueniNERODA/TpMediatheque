package fr.evgueni.tpmediatheque.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BLLManager {

    @Autowired
    private FilmManager filmManager;

    @Autowired
    private MembreManager membreManager;

    public FilmManager getFilmManager(){
        return filmManager;
    }

    public MembreManager getMmembreManager(){
        return membreManager;
    }
}
