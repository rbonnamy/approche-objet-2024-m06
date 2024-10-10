package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> listeTotale = new ArrayList<String>();
        for (String elt: liste1){
            listeTotale.add(elt);
        }
        listeTotale.addAll(liste2);
        System.out.println(listeTotale);
    }
}
