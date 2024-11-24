package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Chambre;
import tn.esprit.foyeresprit.Repository.ChambreRepository;

import java.util.List;

public class ChambreServiceImpl implements IChambreService{

    private ChambreRepository chambreRepository;

    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public Chambre getChambre(Long idChambre) {
        return chambreRepository.getReferenceById ( idChambre );
    }

    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void deleteChambre(Chambre chambre) {
        chambreRepository.delete (chambre);
    }

    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll ();
    }
}
