package entites.essai;

public class TestOperation {
    public static void main(String[] args) {

        Operation ope = new Operation(); // instance
        int resultat = ope.add(8, 9);
        int resultat2 = ope.mult(8, 15);
        System.out.println(resultat);
        System.out.println(resultat2);
    }
}
