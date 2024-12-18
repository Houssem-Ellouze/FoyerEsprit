package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Foyer;
import tn.esprit.foyeresprit.Repository.FoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImpl implements IFoyerService {

    private FoyerRepository foyerRepository;

    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public void deleteFoyer(Long id) {
        foyerRepository.deleteById ( String.valueOf ( id ) );
    }


    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    public Foyer getFoyerById(Long id) {
        return foyerRepository.getReferenceById ( String.valueOf ( id ) );
    }
}
