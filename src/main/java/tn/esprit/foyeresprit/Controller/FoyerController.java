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
@RequestMapping("/foyer")
public class FoyerController {

    IFoyerService foyerService;

    @GetMapping("/Get_All")
    public List<Foyer> getAllFoyer(){
        return foyerService.getAllFoyers ();
    }
    @GetMapping("/Get_By_Id")
    public Foyer getFoyerById(Long id){
        return foyerService.getFoyerById ( id );
    }
    @PostMapping("/add")
    public Foyer addFoyer(Foyer foyer){
        return foyerService.addFoyer ( foyer );
    }
    @PutMapping("/update")
    public Foyer updateFoyer(Foyer foyer){
        return foyerService.updateFoyer ( foyer );
    }
    @DeleteMapping("/delete")
    public void deleteFoyer(Long id){
        foyerService.deleteFoyer ( id );
    }

}
