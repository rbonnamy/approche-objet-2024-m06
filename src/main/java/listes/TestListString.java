package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListString {
    public static void main(String[] args) {

        ArrayList<String> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        // Recherche ville avec le + de lettres
        String villeMax="";
        for (String ville: listeVilles){
            if (ville.length()>villeMax.length()){
                villeMax=ville;
            }
        }
        System.out.println(villeMax);

        Iterator<String> iterVilles = listeVilles.iterator();
        while (iterVilles.hasNext()){
            String ville = iterVilles.next();
            if (ville.startsWith("N")){
                iterVilles.remove();
            }
        }
        System.out.println(listeVilles);

        // Mettre en MAJ
        for (int i = 0; i < listeVilles.size(); i++) {
            String ville = listeVilles.get(i);
            listeVilles.set(i, ville.toUpperCase());
        }
        System.out.println(listeVilles);
    }

}
