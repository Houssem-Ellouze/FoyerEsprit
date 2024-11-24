package tn.esprit.foyeresprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import tn.esprit.foyeresprit.Entity.Universite;
import tn.esprit.foyeresprit.Service.IUniversiteService;

import java.util.List;

@Tag(name = "UniversiteController")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    IUniversiteService universiteService;

    @GetMapping("Get_All")
    public List<Universite> getAll() {
        return universiteService.getUniversites ();
    }
    @GetMapping("Get_By_Id")
    public Universite getById(@PathVariable Long idUniversite) {
        return universiteService.getUniversiteById (idUniversite);
    }
    @PostMapping("/add")
    public Universite create(@RequestBody Universite universite) {
        return universiteService.addUniversite ( universite );
    }
    @PutMapping("/update")
    public Universite update(@RequestBody Universite universite) {
        return universiteService.updateUniversite ( universite );
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable Long idUniversite) {
        universiteService.deleteUniversite ( idUniversite );
    }

}
