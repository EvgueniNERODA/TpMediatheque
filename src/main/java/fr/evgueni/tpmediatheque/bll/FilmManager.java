package fr.evgueni.tpmediatheque.bll;

import fr.evgueni.tpmediatheque.bo.Film;
import fr.evgueni.tpmediatheque.bo.Genre;
import fr.evgueni.tpmediatheque.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilmManager {

    @Autowired
    DAO dao;

    public List<Film> selectAllFilm() {
        return dao.getIdaoFilm().setlectAllFilms();
    }

    public Film getFilmById(long id) {
        return dao.getIdaoFilm().getFilmById(id);
    }

    public Film addFilm (Film film) {
        return dao.getIdaoFilm().addFilm(film);
    }


    public List<Genre> selectAllGenres() { return dao.getIdaoFilm().selectAllGenres();
    }
}
