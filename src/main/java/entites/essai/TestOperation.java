package entites.essai;

public class TestOperation {
    public static void main(String[] args) {

        // Obligé de créer une instance d'Operation
        int resultat = Operation.addition(8, 9);

        int resultat2 = Operation.mult(8, 15);
        System.out.println(resultat);
        System.out.println(resultat2);
    }
}
