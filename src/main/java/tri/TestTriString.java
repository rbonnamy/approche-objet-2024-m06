package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestTriString {
    public static void main(String[] args) {

        ArrayList<String> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        // Les String sont triables !!!
        // Pour trier on utilise la classe utilitaire Collections
        Collections.sort(listeVilles);

        System.out.println(listeVilles);

        // La méthode sort utilise une méthode de la classe String appelée compareTo

        String ch1 = "Bonjour";
        String ch2 = "Bonjour";

        int valeur = ch2.compareTo(ch1); // retourne un nb positif, égal à 0, ou négatif
        System.out.println(valeur);
    }

}
