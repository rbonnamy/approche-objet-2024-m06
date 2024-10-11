package immobilier;

public class TestMaison {
    public static void main(String[] args) {
        Maison maMaison = new Maison(); // liste de pièces est vide
        maMaison.addPiece(new Chambre(0, 10.5));
        maMaison.addPiece(new Chambre(1, 9.8));
        maMaison.addPiece(new Chambre(1, 12.7));
        maMaison.addPiece(new Salon(0, 10.5));
        maMaison.addPiece(new Cuisine(0, 7.6));

        double superficie = maMaison.getSuperficie();
        System.out.println(superficie);

        Maison m2 = new Maison();


    }
}
