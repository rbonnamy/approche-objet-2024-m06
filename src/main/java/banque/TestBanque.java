package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

import java.util.Arrays;

public class TestBanque {

    public static void main(String[] args) {
        Compte[] tabComptes = new Compte[2];
        tabComptes[0]=new Compte("A456", 1500.0);
        tabComptes[1]=new CompteTaux("B563", 2145.5, 0.6);

        for (int i=0; i<tabComptes.length; i++){
            System.out.println(tabComptes[i]);
        }

        System.out.println(Arrays.toString(tabComptes));

    }
}
