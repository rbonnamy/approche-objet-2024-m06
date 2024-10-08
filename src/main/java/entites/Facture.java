package entites;

public class Facture {
    private double consommationKwh;
    private double montant;
    static double prixKwh=0.15;

    public Facture(double conso){
        this.consommationKwh=conso;
        this.montant=conso*prixKwh;
    }

    public void modifierConsommation(double conso){
        this.consommationKwh=conso;
        this.montant=conso*prixKwh;
    }

    public double getConsommationKwh() {
        return consommationKwh;
    }

    public double getMontant() {
        return montant;
    }
}
