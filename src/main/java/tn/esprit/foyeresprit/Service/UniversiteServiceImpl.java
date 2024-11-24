package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Universite;
import tn.esprit.foyeresprit.Repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversiteService{

    private UniversiteRepository universiteRepository;

    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById (  idUniversite );
    }

    public Universite getUniversite(Long idUniversite) {
        return universiteRepository.getReferenceById ( idUniversite );
    }

    public List<Universite> getUniversites() {
        return universiteRepository.findAll();
    }

    public Universite getUniversiteById(Long idUniversite) {
        return universiteRepository.getReferenceById ( idUniversite );
    }

}
