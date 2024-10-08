package aeroport;

public class Camion extends Vehicule {

    private int capaciteEmportTonnes;

    public Camion(String fabricant, String modele, int capaciteEmportTonnes){
        super(fabricant, modele);
        this.capaciteEmportTonnes=capaciteEmportTonnes;
    }

    @Override
    public void seDeplacer(){
        System.out.println("Je me déplace en roulant sur les routes");
    }
}
