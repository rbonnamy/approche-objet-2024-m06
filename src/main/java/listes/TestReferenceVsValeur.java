package listes;

import banque.entites.Debit;

public class TestReferenceVsValeur {
    public static void main(String[] args) {

        String ch1 = "Coucou";
        String ch2 = ch1; // copie de ch1 bien que String soit une classe

        Debit debit1 = new Debit("01/10/2024", 150.0);
        Debit debit2 = debit1; // on n'a pas fait une copie. En fait debit 2 référence le même objet en mémoire.

        debit1.setDate("02/10/2024");

        System.out.println(debit1);
        System.out.println(debit2);


       // Ce mécanisme ne fonctionne pas pour les types primitifs, et les String, Integer, Long, Double, Float
    }

}
