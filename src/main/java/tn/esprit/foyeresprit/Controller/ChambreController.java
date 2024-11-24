package tn.esprit.foyeresprit.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.Entity.Chambre;
import tn.esprit.foyeresprit.Service.IChambreService;

import java.util.List;

@Tag ( name = "ChambreController" )
@AllArgsConstructor
@RestController
@RequestMapping
public class ChambreController {

    private IChambreService chambreService;

    @GetMapping
    public List<Chambre> chambre() {
        return chambreService.getAllChambre ();
    }
    @GetMapping
    public Chambre chambreById(Long id) {
        return chambreService.getChambreById ( id );
    }
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre ( chambre );
    }
    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre ( chambre );
    }
    @DeleteMapping
    public void deleteChambre(Long id) {
        chambreService.deleteChambre ( id );
    }
}
