package equals;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestEquals {
    public static void main(String[] args) {
        Ville v1 = new Ville("Nice", 343000);
        Ville v2 = new Ville("Nice", 343000);
        System.out.println("Avec equals="+v1.equals(v2));
        System.out.println("Avec double égal ="+(v1==v2));

        // Test 2
        Ville v3 = new Ville("Nice ", 343000);
        System.out.println("Avec equals="+v1.equals(v3));
        System.out.println("Avec double égal ="+(v1==v3));

        // Test 3
        Ville v4 = new Ville("Nice", 343001);
        System.out.println("Avec equals="+v1.equals(v4));
        System.out.println("Avec double égal ="+(v1==v4));

        // Test 4
        Ville v5 = v1; // pas de new donc v5 est une référence vers le même objet que v1
        System.out.println("Avec equals="+v1.equals(v5));
        System.out.println("Avec double égal ="+(v1==v5));

        // LE PETIT PLUS : Recherche d'une Ville dans une liste
        ArrayList<Ville> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));

        Ville villeRech = new Ville("Narbonne", 53400);

        // Première technique pour voir si la ville villeRech est dans la liste
        boolean existe = false;
        for (Ville v: listeVilles){
            if (v.equals(villeRech)){
                existe = true;
            }
        }
        System.out.println("Est-ce que la ville villeRech existe ? :"+existe);

        // Seconde technique : méthode contains !!!
        boolean existe2 = listeVilles.contains(villeRech);
        System.out.println("Est-ce que la ville villeRech existe ? :"+existe);

        // Seconde technique : méthode indexOf (qui retourne -1 si elle ne trouve pas)
        int indexDansLaListe = listeVilles.indexOf(villeRech);
        System.out.println("Est-ce que la ville villeRech existe ? Index = "+indexDansLaListe);
    }
}
