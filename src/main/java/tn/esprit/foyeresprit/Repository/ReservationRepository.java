package tn.esprit.foyeresprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyeresprit.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
