package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre getChambre(Long id);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    List<Chambre> getAllChambre();
}
