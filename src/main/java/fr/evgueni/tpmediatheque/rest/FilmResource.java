package fr.evgueni.tpmediatheque.rest;

import fr.evgueni.tpmediatheque.bll.BLLManager;
import fr.evgueni.tpmediatheque.bo.Film;
import fr.evgueni.tpmediatheque.bo.Membre;
import org.apache.tomcat.util.descriptor.web.ResourceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FilmResource extends ResourceBase {

    @Autowired
    BLLManager bllManager;

    @GetMapping(value = "/api/films") public List<Film> getCatalog() {return bllManager.getFilmManager().selectAllFilm();}

    @GetMapping(value = "/membres") public List<Membre> selectAllMembres(){return bllManager.getMmembreManager().selectAllMembres();}

}
