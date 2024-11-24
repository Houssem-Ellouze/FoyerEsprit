package tn.esprit.foyeresprit.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    private String idReservation;
    private Long numeroChambre;
    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;
    @ManyToMany(mappedBy = "reservation")
    private List<Etudiant> etudiants;
}
