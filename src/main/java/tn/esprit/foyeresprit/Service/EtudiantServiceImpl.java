package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Etudiant;
import tn.esprit.foyeresprit.Repository.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;

    public Etudiant getEtudiantbyId(Long idEtudiant) {
        return etudiantRepository.getReferenceById ( idEtudiant );
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

    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById ( idEtudiant );
    }

    public Etudiant getEtudiantById(Long idEtudiant) {
        return null;
    }
}
