package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Universite universite);
    Universite getUniversite(Long id);
    List<Universite> getUniversites();
}
