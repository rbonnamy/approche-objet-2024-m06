package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(15, "rue du Marché", 44000, "Nantes");
        AdressePostale a2 = new AdressePostale(1, "rue des Lilas", 34000, "Montpellier");

        Personne p1 = new Personne("Lee", "Bob");
        p1.adresse = a1;

        Personne p2 = new Personne("Lee", "Lea", a2);

        p1.afficher();
        p1.setNom("Lees");
        p1.afficher();

        AdressePostale a3 = new AdressePostale(10, "rue des Lilas", 34000, "Montpellier");
        p1.setAdresse(a3);

        Personne p3 = new Personne("Dupont", "Norbert");
        p3.setAdresse(a2);
    }
}
