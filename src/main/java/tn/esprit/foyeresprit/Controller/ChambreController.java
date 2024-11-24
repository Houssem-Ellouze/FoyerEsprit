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
@RequestMapping("/chambre")
public class ChambreController {

    private IChambreService chambreService;

    @GetMapping("/Get_All")
    public List<Chambre> chambre() {
        return chambreService.getAllChambre ();
    }
    @GetMapping("/Get_By_Id")
    public Chambre chambreById(Long id) {
        return chambreService.getChambreById ( id );
    }
    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre ( chambre );
    }
    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre ( chambre );
    }
    @DeleteMapping("/delete")
    public void deleteChambre(Long id) {
        chambreService.deleteChambre ( id );
    }
}
