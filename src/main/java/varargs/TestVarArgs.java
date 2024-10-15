package varargs;

public class TestVarArgs {
    public static void main(String[] args) {

        double resultat1 = Operation.moyenne(15.2, 2.7, 2.6);
        System.out.println(resultat1);

        double resultat2 = Operation.moyenne(15.2, 2.7, 2.6, 16.4, 8.5, 2.3);
        System.out.println(resultat2);

        double resultat3 = Operation.moyenne();
        System.out.println(resultat3);

        double[] array = {14.6, 12.3, -25.6};
        double resultat4 = Operation.moyenne(array);
        System.out.println(resultat4);
    }
}
