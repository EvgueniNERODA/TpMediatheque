package fr.evgueni.tpmediatheque.dao;

import fr.evgueni.tpmediatheque.bo.Membre;

import java.util.List;

public interface IDAOMembre {


    List<Membre> selectAllMembres ();
}
