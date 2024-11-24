package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Etudiant;
import tn.esprit.foyeresprit.Repository.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;

    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.getReferenceById ( id );
    }

    public List<Etudiant> getEtudiants() {
        return etudiantRepository.findAll ();
    }

    public Etudiant addEtudiant(Etudiant et) {
        return etudiantRepository.save(et);
    }

    public Etudiant updateEtudiant(Etudiant et) {
        return etudiantRepository.save(et);
    }

    public void deleteEtudiant(Etudiant et) {
            etudiantRepository.delete ( et );
    }
}
