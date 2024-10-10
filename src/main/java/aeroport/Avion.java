package aeroport;

public class Avion  extends Vehicule implements ObjetVolant {

    // variable d'instance
    private String immatriculation;
    private int nbPassagers;

    public Avion(String fabricant, String modele, String immatriculation){
        super(fabricant, modele);
        this.immatriculation=immatriculation;
    }

    @Override
    public void decoller(){

    }

    @Override
    public void atterir(){

    }

    public String toString(){
        return fabricant+" "+modele+" "+immatriculation;
    }

    @Override
    public void seDeplacer(){
        System.out.println("Après une phase de roulage, les avions décollent et volent dans les airs.");
    }

    public int getNbPassagers(){
        return this.nbPassagers;
    }

    public void setNbPassagers(int nb){
        this.nbPassagers=nb;
    }

    // get immatriculation
    public String getImmatriculation(){
        return this.immatriculation;
    }
}
