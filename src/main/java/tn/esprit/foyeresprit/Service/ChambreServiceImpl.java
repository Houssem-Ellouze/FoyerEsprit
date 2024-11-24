package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Chambre;
import tn.esprit.foyeresprit.Repository.ChambreRepository;

import java.util.List;

@Service

public class ChambreServiceImpl implements IChambreService{

    private ChambreRepository chambreRepository;

    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public Chambre getChambreById(Long idChambre) {
        return chambreRepository.getReferenceById ( idChambre );
    }


    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById (idChambre);
    }



    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll ();
    }
}
