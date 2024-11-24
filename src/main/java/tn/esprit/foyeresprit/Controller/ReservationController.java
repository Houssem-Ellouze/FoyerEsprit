package tn.esprit.foyeresprit.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.Entity.Reservation;
import tn.esprit.foyeresprit.Service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag ( name = "ReservationController")
@RequestMapping
public class ReservationController {

    IReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
    @GetMapping
    public Reservation getReservationById(Long id) {
        return reservationService.getReservationById ( id );
    }
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation ( reservation );
    }
    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation ( reservation );
    }
    @DeleteMapping
    public void deleteReservationById(Long id) {
        reservationService.deleteReservation ( id );
    }

}
