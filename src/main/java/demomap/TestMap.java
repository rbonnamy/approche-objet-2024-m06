package demomap;

import listes.Ville;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        // Les HashMap ne préservent pas l'ordre d'insertion
        // Stockage dans la HashMap via la valeur de hachage de la clé de stockage
        HashMap<String, Ville> map = new HashMap<>();
        map.put("qsdlkj", new Ville("Nantes", 343000));
        map.put("zeczce", new Ville("Pau", 9700));
        map.put("sdfgd", new Ville("Toulouse", 600000));
        map.put("uiluli", new Ville("Montpellier", 312544));
        map.put("qscqsc", new Ville("Montpellier", 312544));

        // Affichage de toutes les clés et des valeurs en une seule boucle
        Set<String> cles = map.keySet();
        for (String cle: cles){
            Ville v = map.get(cle);
            System.out.println(cle + "==>" + v);
        }

        // Affichage de toutes les "valeurs" i.e. les villes
        Collection<Ville> villes = map.values();
        for (Ville v: villes){
            System.out.println(v);
        }
    }

}
