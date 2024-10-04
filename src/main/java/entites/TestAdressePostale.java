package entites;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale(15, "rue du Marché", 44000, "Nantes");
        AdressePostale a2 = new AdressePostale(1, "rue des Lilas", 34000, "Montpellier");

        System.out.println(a1);
    }
}
