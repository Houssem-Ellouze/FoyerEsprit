package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Long id);
    List<Foyer> getAllFoyers();
    Foyer getFoyerById(Long id);
}
