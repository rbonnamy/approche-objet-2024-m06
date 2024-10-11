package animaux.mammiferes;

import animaux.comportements.Herbivore;

public class Koala extends Mammifere implements Herbivore {

    public Koala() {
        super("Koala", "Phascolarctidae", "Phascolarctos");
    }

    @Override
    public void seNourrir() {

        System.out.println("Je suis herbivore.");
    }

    @Override
    public void seDeplacer() {

        System.out.println("Je me déplace dans les arbres principalement");
    }

    @Override
    public void mangerPlantes() {

        System.out.println("Je mange des feuilles d'Eucalyptus.");
    }
}
