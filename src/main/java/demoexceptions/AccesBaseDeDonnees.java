package demoexceptions;

import demoexceptions.exceptions.CodeException;
import listes.Ville;

import java.util.ArrayList;
import java.util.List;

public class AccesBaseDeDonnees {

    public List<Ville> extraireVilles(String codeDept) throws CodeException {

        if (codeDept==null){
            throw new CodeException("Le code département ne peut pas être null.");
        }
        if (codeDept.equals("")){
            throw new CodeException("Le code département ne peut pas être vide.");
        }

        // Accès base de données
        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Pau", 17000));
        return listeVilles;
    }
}
