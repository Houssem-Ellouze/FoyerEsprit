package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Reservation;
import tn.esprit.foyeresprit.Repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService{

    private ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.getReferenceById ( id );
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById (idReservation);
    }

}
