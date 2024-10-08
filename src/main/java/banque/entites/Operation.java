package banque.entites;

/**
 * La classe Operation va être une classe abstraite avec 2 classes filles :
 * - la classe Credit qui correspond à une opération créditrice sur un compte bancaire
 * - la classe Debit qui correspond à une opération débitrice sur un compte bancaire
 * 1) Créez la classe Operation en respectant les consignes suivantes:
 * a. Elle doit être abstraite
 * b. Elle a 2 attributs
 * i. la date de l’opération (au format String pour l’instant)
 * ii. le montant de l’opération.
 * c. Elle a un constructeur avec 2 arguments : date et montant
 * 2) Créez la classe Credit :
 * a. Elle hérite de Operation
 * 3) Créez la classe Debit :
 * a. Elle hérite de Operation
 * 4) Créez une classe TestOperation exécutable :
 * a. créez un tableau d’opérations avec au moins 4 opérations de crédits et de débits
 * dans le tableau.
 * 2
 * b. Faites une boucle sur le tableau d’opérations pour afficher les informations
 * suivantes :
 * i. la date de l’opération
 * ii. le montant de l’opération
 * 5) Dans la classe Operation, ajoutez la méthode abstraite suivante : String getType()
 * a. Redéfinissez cette méthode dans la classe Credit pour qu’elle retourne « CREDIT »
 * b. Redéfinissez cette méthode dans la classe Debit pour qu’elle retourne « DEBIT »
 * 6) Modifiez la boucle précédente et affichez également le type des opérations.
 * 7) Calculez enfin le montant global de toutes les opérations :
 * a. si c’est une opération au débit utilisez l’opérateur « – » pour le calcul.
 * b. si c’est une opération au crédit, utilisez l’opérateur « + » pour le calcul.
 */
public abstract class Operation {
    private String date;
    protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType();

    public abstract double calculTotal(double somme);

    @Override
    public String toString(){
        return getType()+"\t: "+date+" "+montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
