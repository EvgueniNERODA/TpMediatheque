package fr.evgueni.tpmediatheque.bll;

import fr.evgueni.tpmediatheque.bo.Membre;
import fr.evgueni.tpmediatheque.dao.DAO;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MembreManager {

    @Autowired
    DAO dao;

    public List<Membre> selectAllMembres (){
        return dao.getIDAOMembre().selectAllMembres();
    }
}
