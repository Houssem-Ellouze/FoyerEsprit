package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant getEtudiant(Long id);
    List<Etudiant> getEtudiants();
    Etudiant addEtudiant(Etudiant et);
    Etudiant updateEtudiant(Etudiant et);
    void deleteEtudiant(Long id);
}
