package entites.essai;

// Classe stateless : sans état
// Classes qui n'ont pas de variables d'instance
public class Operation {


    // PAS DE VARIABLE d'instance ???
    // Méthode d'instance
    // donc je créé une instance pour l'invoquer
    public static int addition(int a, int b){
        return a+b;
    }

    public static int mult(int a, int b){
        return a*b;
    }
}
