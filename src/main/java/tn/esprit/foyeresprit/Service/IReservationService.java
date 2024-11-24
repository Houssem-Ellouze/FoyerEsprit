package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long id);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
}
