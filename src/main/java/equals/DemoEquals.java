package equals;

import listes.Ville;

import java.util.Date;

public class DemoEquals {
    public static void main(String[] args) {
        String a = "Bonjour";   // création d'une chaine avec l'opérateur guillemet. "Bonjour" dans le string pool ???
                                // Réponse : non => ranger Bonjour dans la String pool avec une adresse mémoire X
        String b = "Bonjour";   // création d'une chaine avec l'opérateur guillemet. "Bonjour" dans le string pool ???
                                // Réponse : oui => b est une référence avec la chaine "Bonjour" à l'adresse mémoire X
        String c = new String("Bonjour"); // new utilisé => pas d'utilisation du string pool
                                          // Bonjour est rangé à sa propre adresse Y

        if (a.equals(b)){
            System.out.println("ok");
        }
        else {
            System.out.println("ko");
        }

        Integer u1 = 128; // Integer pool jusqu'à 127
        Integer u2 = 128;
        if (u1.equals(u2)){
            System.out.println("ok");
        }
        else {
            System.out.println("ko");
        }

        Ville v1 = new Ville("Pau", 17000); // new réserve une adresse mem libre L1 et v1 référence cette adresse
        Ville v2 = new Ville("Pau", 17000); // new réserve une adresse mem libre L2 et v2 référence cette adresse
        Ville v3 = v2; // new n'a pas été utilisé pour créer v3 donc v3==v2 retourne true

        // NE FONCTIONNE PAS car == compare les adresses mémoires pour les objets
        if (v1 == v2) {
            System.out.println("villes identiques");
        }
        else {
            System.out.println("villes diff");
        }

        // NE FONCTIONNE PAS par défaut car la méthode equals de la classe Object compare les adresses mémoires
        if (v1.equals(v2)) {
            System.out.println("villes identiques");
        }
        else {
            System.out.println("villes diff");
        }

        if (v1.equals(new Date())) {
            System.out.println("villes identiques");
        }
        else {
            System.out.println("villes diff");
        }

    }
}
