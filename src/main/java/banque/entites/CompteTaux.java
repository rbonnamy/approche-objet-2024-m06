package banque.entites;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(String numero, double solde, double taux){
        super(numero, solde);
        this.taux=taux;
    }

    @Override
    public String toString(){
        String infosClasseMere = super.toString();
        return infosClasseMere+" "+taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
