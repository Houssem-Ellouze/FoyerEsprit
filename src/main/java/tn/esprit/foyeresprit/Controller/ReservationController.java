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
@RequestMapping("/reservation")
public class ReservationController {

    IReservationService reservationService;

    @GetMapping("/Get_All")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
    @GetMapping("/Get_By_Id")
    public Reservation getReservationById(Long id) {
        return reservationService.getReservationById ( id );
    }
    @PostMapping("/add")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation ( reservation );
    }
    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation ( reservation );
    }
    @DeleteMapping("/delete")
    public void deleteReservationById(Long id) {
        reservationService.deleteReservation ( id );
    }

}
