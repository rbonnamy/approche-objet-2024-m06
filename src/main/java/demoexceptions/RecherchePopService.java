package demoexceptions;

import demoexceptions.exceptions.CodeException;
import listes.Ville;

import java.util.List;

public class RecherchePopService {

    // Seules les méthodes peuvent jeter des exceptions
    public List<Ville> rechercher(String codeDept) throws CodeException {

        AccesBaseDeDonnees dao = new AccesBaseDeDonnees();
        // code spécifique ici
        List<Ville> villes = dao.extraireVilles(codeDept);
        for (Ville v: villes) {
            if (v.getNbHabs() > 100_000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }
        return villes;
    }
}
