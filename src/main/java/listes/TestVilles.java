package listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));

        Collections.sort(listeVilles);
        for (Ville v: listeVilles){
            System.out.println(v);
        }
    }
}