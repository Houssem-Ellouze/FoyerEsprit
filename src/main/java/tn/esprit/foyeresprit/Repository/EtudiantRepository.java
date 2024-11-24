package tn.esprit.foyeresprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyeresprit.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
