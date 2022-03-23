package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
