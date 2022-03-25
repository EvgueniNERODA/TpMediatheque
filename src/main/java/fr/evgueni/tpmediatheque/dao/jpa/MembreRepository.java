package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Membre;
import org.springframework.data.repository.CrudRepository;

public interface MembreRepository extends CrudRepository<Membre, Long> {
}
