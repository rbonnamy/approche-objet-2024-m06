package aeroport;

public abstract class Vehicule {

    protected String fabricant;
    protected String modele;

    public Vehicule(String fabricant, String modele){
        this.fabricant=fabricant;
        this.modele=modele;
    }

    public abstract void seDeplacer();

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getFabricant() {
        return fabricant;
    }
}
