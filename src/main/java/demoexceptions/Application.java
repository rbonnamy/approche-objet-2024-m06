package demoexceptions;

import demoexceptions.exceptions.CodeException;
import listes.Ville;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        RecherchePopService service = new RecherchePopService();

        // Traitement de l'exception
        try {
            List<Ville> villes = service.rechercher("");
            for (Ville v: villes){
                System.out.println(v);
            }
            System.out.println("l'application s'est terminée avec succès.");

        } catch (CodeException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }
}
