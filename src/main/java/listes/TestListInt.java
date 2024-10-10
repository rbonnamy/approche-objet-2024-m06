package listes;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        for (Integer nb: liste){
            System.out.print(nb+" ");
        }
        System.out.println("\n------------");
        System.out.println("Taille de la liste ="+liste.size());
        System.out.println("\n------------");

        int max = Integer.MIN_VALUE; // initialisé à -2147483648;
        int min = Integer.MAX_VALUE;
        for (Integer nb: liste){
            if (nb > max){
                max = nb;
            }
            if (nb < min){
                min = nb;
            }
        }
        System.out.println("Le nombre max ="+max);
        System.out.println("Le nombre min ="+min);

        // Remove !!!!
        // nécessite de convertir le int en Integer pour appeler la méthode remove(Object o) et non remove(int index)
        liste.remove(Integer.valueOf(min));
        System.out.println("\n------------");
        for (Integer nb: liste){
            System.out.print(nb+" ");
        }
        System.out.println("\n------------");
        // Modifier les négatifs en positifs
        for (int i = 0; i < liste.size(); i++) {
            int valeur = liste.get(i);
            if (valeur<0){
                liste.set(i, Math.abs(valeur));
            }
        }
        System.out.println(liste);
    }

}
