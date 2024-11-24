package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc getBlocById(Long idBloc);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    List<Bloc> getAllBloc();
}
