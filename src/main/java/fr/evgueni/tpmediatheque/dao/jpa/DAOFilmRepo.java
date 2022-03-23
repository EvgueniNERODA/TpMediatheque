package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Film;
import fr.evgueni.tpmediatheque.bo.Membre;
import fr.evgueni.tpmediatheque.dao.IDAOFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("filmRepo")
public class DAOFilmRepo implements IDAOFilm {

    @Autowired
    FilmRepository filmRepository;

    @Override
    public Film getFilmById(long id) {
        return filmRepository.findById(id).orElse(null);
    }

    @Override
    public List<Film> setlectAllFilms() {
        return (List<Film>) filmRepository.findAll();
    }

    @Override
    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }


}
