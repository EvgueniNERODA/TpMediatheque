package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Personne;
import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<Personne, Long> {
}
