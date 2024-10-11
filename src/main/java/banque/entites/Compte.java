package banque.entites;

import enumerations.Getter;

public class Compte {

    private String numero;
    private double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString(){
        return numero+" "+solde;
    }

    @Getter
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Getter
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
