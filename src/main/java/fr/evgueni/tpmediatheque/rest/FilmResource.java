package fr.evgueni.tpmediatheque.rest;

import fr.evgueni.tpmediatheque.bll.BLLManager;
import fr.evgueni.tpmediatheque.bo.Film;
import fr.evgueni.tpmediatheque.bo.Genre;
import fr.evgueni.tpmediatheque.bo.Membre;
import org.apache.tomcat.util.descriptor.web.ResourceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class FilmResource extends ResourceBase {

    @Autowired
    BLLManager bllManager;

    @GetMapping(value = "/api/films")
    public List<Film> getCatalog() {

        return bllManager.getFilmManager().selectAllFilm();
    }

    @GetMapping(value = "/api/detailFilm/{id}")
    @ResponseBody
    public Film getFilmById(@PathVariable Long id) {

        return bllManager.getFilmManager().getFilmById(id);
    }

    @GetMapping(value = "/membres")
    public List<Membre> selectAllMembres() {

        return bllManager.getMmembreManager().selectAllMembres();
    }

    @GetMapping(value = "/api/genres")
    public List<Genre> selectAllGenres (){
        return bllManager.getFilmManager().selectAllGenres();
    }

    @PostMapping(value = "/api/addFilm")
    public Film addFilm(Film film) {

        return bllManager.getFilmManager().addFilm(film);
    }



}
