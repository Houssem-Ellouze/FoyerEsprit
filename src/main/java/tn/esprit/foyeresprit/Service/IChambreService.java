package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre getChambre(int id);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(int id);
    List<Chambre> getAllChambre();
}
