package tn.esprit.foyeresprit.Service;

import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.Entity.Bloc;
import tn.esprit.foyeresprit.Repository.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService{

    private BlocRepository blocRepository;

    public Bloc getBlocById(Long idBloc) {
        return blocRepository.getReferenceById (idBloc);
    }

    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById (idBloc);
    }

    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }
}
