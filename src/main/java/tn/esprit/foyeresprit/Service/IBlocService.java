package tn.esprit.foyeresprit.Service;

import tn.esprit.foyeresprit.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc getBlocById(Long id);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Bloc bloc);
    List<Bloc> getAllBloc();
}
