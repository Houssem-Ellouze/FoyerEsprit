package tn.esprit.foyeresprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyeresprit.Entity.Chambre;

public interface ChambreRepository  extends JpaRepository<Chambre, Long> {
}
