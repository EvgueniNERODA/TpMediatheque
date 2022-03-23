package fr.evgueni.tpmediatheque.dao.mock;

import fr.evgueni.tpmediatheque.bo.*;
import fr.evgueni.tpmediatheque.dao.IDAOFilm;
import fr.evgueni.tpmediatheque.dao.IDAOMembre;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/*
@Component
@Qualifier("filmMock")
public class DAOFilmMock implements IDAOFilm, IDAOMembre {

    List <Film> listeFilms = new ArrayList<>();
    Film nouveauFilm;


    @Override
    public Film getFilmById(long id) {
        Film film = new Film(id, "Batman",1986,120,"blabla", new Participant(1, "BALE", "Christian"),new Genre(1,"Action") );
        return film;
    }

    @Override
    public List<Film> setlectAllFilms() {
        nouveauFilm = new Film(1, "Batman",1986,120,"blabla", new Participant(1, "BALE", "Christian"),new Genre(1,"Action") );

        listeFilms.add(nouveauFilm);
        return listeFilms;
    }

    @Override
    public Film addFilm(Film film) {
        nouveauFilm = new Film(film.getId(), film.getTitre(), film.getDuree(), film.getDuree(), film.getSynopsis(), film.getRealisateur(), film.getGenre());
        listeFilms.add(nouveauFilm);
        return nouveauFilm;
    }

    @Override
    public List<Membre> selectAllMembres() {

        Membre membre1 = new Membre(1, "Dupond", "Jack", "JP", "111", false);
        Membre membre2 = new Membre(2, "CRUISE", "Tom", "CT", "111", false);
        List <Membre> membreList = new ArrayList<>();
        membreList.add(membre1);
        membreList.add(membre2);
        return membreList;
    }


}

 */
