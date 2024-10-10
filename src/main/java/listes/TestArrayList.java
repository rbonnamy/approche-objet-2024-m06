package listes;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {

        // Bonne pratique : on  fait des listes homogènes
        // Notation diamant <T>
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Coucou");
        liste.add("Bonjour");
        liste.add("Salut");
        System.out.println(liste.size());

        liste.remove(1);
        System.out.println(liste.size());

        if (liste.isEmpty()){
            System.out.println("La liste est vide");
        }
        else {
            System.out.println("La liste n'est pas vide");
        }

        ArrayList<Operation> operations1 = new ArrayList<Operation>();
        operations1.add(new Debit("01/02/2024", 10.0));
        operations1.add(new Credit("02/02/2024", 25.0));
        operations1.add(new Debit("03/02/2024", -15.25));
        operations1.add(new Debit("03/02/2024", 15.25));

        ArrayList<Operation> operations2 = new ArrayList<Operation>();
        operations2.add(new Debit("03/02/2024", -15.25));
        operations2.add(new Credit("03/02/2024", 125.25));
        operations2.add(new Debit("03/02/2024", -15.25));
        operations2.add(new Credit("03/02/2024", 18.75));

        ArrayList<Operation> toutes = new ArrayList<Operation>();
        toutes.addAll(operations1);
        toutes.addAll(operations2);

        Iterator<Operation> iterOperation = operations1.iterator();
        while (iterOperation.hasNext()){
            Operation ope = iterOperation.next();
            if (ope.getMontant()<0){
                iterOperation.remove();
            }
        }

        for (Operation ope: operations1){
            System.out.println(ope);
        }


//
//        ArrayList<Integer> listeEntiers = new ArrayList<Integer>();
//        listeEntiers.add(1);
//        listeEntiers.add(-15);
//        listeEntiers.add(38);
//
//        ArrayList<Character> listeCars = new ArrayList<Character>();
//        listeCars.add('1');
//        listeCars.add('a');
//        listeCars.add('*');


    }

}
