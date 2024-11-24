package tn.esprit.foyeresprit.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomET;
    private String prenomET;
    private Long cin;
    private String ecole;
    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiant")
    private List<Reservation> reservations;


}
