package fr.evgueni.tpmediatheque.dao.jpa;

import fr.evgueni.tpmediatheque.bo.Membre;
import fr.evgueni.tpmediatheque.dao.IDAOMembre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("membreRepo")
public class DAOMembreRepo implements IDAOMembre {

    @Autowired
    MembreRepository membreRepository;

    @Override
    public List<Membre> selectAllMembres() {
        return (List<Membre>) membreRepository.findAll();
    }
}
