package tn.esprit.foyeresprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyeresprit.Entity.Foyer;

public interface FoyerRepository  extends JpaRepository<Foyer,String> {
}
