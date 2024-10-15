package varargs;

public class Operation {

    public static double moyenne(double... valeurs){
        // valeurs est considéré comme un tableau.
        double somme = 0.0;
        for (double val: valeurs){
            somme+=val;
        }
        return somme/valeurs.length;
    }
}
