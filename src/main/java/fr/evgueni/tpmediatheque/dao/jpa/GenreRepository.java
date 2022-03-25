package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
