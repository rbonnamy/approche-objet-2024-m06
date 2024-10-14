package chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        // Chronométrage avec +
        long depart = System.currentTimeMillis();
        String chaine ="";
        for (int i = 0; i < 1000; i++) {
            chaine=chaine+i;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Durée d'exécution="+(stop-depart));

        // Chronométrage avec StringBuilder
        long depart2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("Durée d'exécution="+(stop2-depart2));

        // Vérification que les chaines sont identiques
        System.out.println(chaine);
        System.out.println(builder);
    }

}
