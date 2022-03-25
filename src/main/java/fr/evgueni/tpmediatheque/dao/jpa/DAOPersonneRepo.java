package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Acteur;
import fr.evgueni.tpmediatheque.bo.Membre;
import fr.evgueni.tpmediatheque.dao.IDAOPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("personneRepo")
public class DAOPersonneRepo implements IDAOPersonne {

    @Autowired
    PersonneRepository personneRepository;

    @Autowired
    MembreRepository membreRepository;

    @Override
    public List<Membre> selectAllMembres() {
        return (List<Membre>) membreRepository.findAll();
    }

    @Override
    public List<Acteur> getActeursFilm(long idFilm) {
        return null;
    }
}
