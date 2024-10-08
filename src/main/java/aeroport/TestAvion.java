package aeroport;

public class TestAvion {

    private Avion immatriculation;

    public static final int NB_AEROPORTS = 120;

    public static void main(String[] args) {

        // av1 est une instance de la classe Avion
        Avion av1 = new Avion("Airbus", "A320", "AB123456");
        av1.seDeplacer();

        System.out.println(av1.getImmatriculation());
        System.out.println(av1.getNbPassagers());

    }
}
