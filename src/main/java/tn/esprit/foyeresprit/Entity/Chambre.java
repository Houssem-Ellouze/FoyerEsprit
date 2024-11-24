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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idChambre;
    private Long numeroChambre;
    private typec TypeChambre;
    @ManyToOne
    private Bloc bloc;
    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;
}
