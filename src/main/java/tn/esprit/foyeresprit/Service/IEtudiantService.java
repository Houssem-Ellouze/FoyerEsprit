package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> getEtudiants();
    Etudiant addEtudiant(Etudiant et);
    Etudiant updateEtudiant(Etudiant et);
    void deleteEtudiant(Long idEtudiant);
    Etudiant getEtudiantById(Long idEtudiant);
}
