package tn.esprit.foyeresprit.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.Entity.Bloc;
import tn.esprit.foyeresprit.Service.IBlocService;

import java.util.List;

@Tag ( name = "BlocController" )
@AllArgsConstructor
@RestController
@RequestMapping
public class BlocController {

    IBlocService blocService;

    @GetMapping
    public List<Bloc> getAll() {
        return blocService.getAllBloc ();
    }
    @GetMapping
    public Bloc getById(Long id) {
        return blocService.getBlocById ( id );
    }
    @PostMapping
    public Bloc create(Bloc bloc) {
        return blocService.addBloc ( bloc );
    }
    @PutMapping
    public Bloc update(Bloc bloc) {
        return blocService.updateBloc ( bloc );
    }
    @DeleteMapping
    public void deleteById(Long id) {
        blocService.deleteBloc ( id );
    }

}
