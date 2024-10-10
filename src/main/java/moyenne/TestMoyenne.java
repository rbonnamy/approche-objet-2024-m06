package moyenne;

import banque.entites.Compte;
import banque.entites.Debit;

public class TestMoyenne {
    public static void main(String[] args) {
        String chaine = "coucou"; // variable de type String

        Compte compte = new Compte("AB456", 1.5);

        Debit debit = new Debit("01/10/2015", 15.25);

        double[] tab = {15.5, 25.0};
//        CalculMoyenne calc = new CalculMoyenne(tab);
//        double moyenne = calc.calcul();
//        System.out.println(moyenne);

        int a = 15;
    }
}
