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
@Setter
@Getter
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private List<Foyer> foyers;
}
