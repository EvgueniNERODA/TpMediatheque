package fr.evgueni.tpmediatheque.dao;

import fr.evgueni.tpmediatheque.bo.Film;
import fr.evgueni.tpmediatheque.bo.Membre;

import java.util.List;

public interface IDAOFilm {

    Film getFilmById(long id);

    List<Film> setlectAllFilms();

    Film addFilm (Film film);

}
