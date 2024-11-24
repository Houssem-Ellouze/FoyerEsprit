package tn.esprit.foyeresprit.Controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.Entity.Foyer;
import tn.esprit.foyeresprit.Service.IFoyerService;

import java.util.List;

@Tag ( name = "FoyerController")
@RestController
@AllArgsConstructor
@RequestMapping
public class FoyerController {

    IFoyerService foyerService;

    @GetMapping
    public List<Foyer> getAllFoyer(){
        return foyerService.getAllFoyers ();
    }
    @GetMapping
    public Foyer getFoyerById(Long id){
        return foyerService.getFoyerById ( id );
    }
    @PostMapping
    public Foyer addFoyer(Foyer foyer){
        return foyerService.addFoyer ( foyer );
    }

    @PutMapping
    public Foyer updateFoyer(Foyer foyer){
        return foyerService.updateFoyer ( foyer );
    }
    @DeleteMapping
    public void deleteFoyer(Long id){
        foyerService.deleteFoyer ( id );
    }

}
