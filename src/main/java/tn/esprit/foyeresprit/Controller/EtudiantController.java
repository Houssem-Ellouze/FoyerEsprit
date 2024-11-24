package tn.esprit.foyeresprit.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.Entity.Etudiant;
import tn.esprit.foyeresprit.Service.IEtudiantService;

import java.util.List;

@Tag ( name = "EtudiantController" )
@RestController
@AllArgsConstructor
@RequestMapping
public class EtudiantController {

    IEtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getAllEtudiant(){
        return etudiantService.getEtudiants ();
    }
    @GetMapping
    public Etudiant getEtudiantById(Long id){
        return etudiantService.getEtudiantById ( id );
    }
    @PostMapping
    public Etudiant addEtudiant(Etudiant etudiant){
        return etudiantService.addEtudiant ( etudiant );
    }
    @PutMapping
    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantService.updateEtudiant ( etudiant );
    }
    @DeleteMapping
    public void deleteEtudiantById(Long id){
        etudiantService.deleteEtudiant ( id );
    }

}