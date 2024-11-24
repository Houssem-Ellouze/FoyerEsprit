package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Universite;
import tn.esprit.foyeresprit.Repository.UniversiteRepository;

import java.util.List;

public class UniversiteServiceImpl implements IUniversiteService{

    private UniversiteRepository universiteRepository;

    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public void deleteUniversite(Universite universite) {
        universiteRepository.delete(universite);
    }

    public Universite getUniversite(Long idUniversite) {
        return universiteRepository.getReferenceById ( idUniversite );
    }

    public List<Universite> getUniversites() {
        return universiteRepository.findAll();
    }
}
