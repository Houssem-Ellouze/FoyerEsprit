package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre getChambreById(Long idChambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long idChambre);
    List<Chambre> getAllChambre();
}
