package animaux.mammiferes;

import animaux.comportements.Herbivore;

public class Boeuf extends Mammifere implements Herbivore {

    public Boeuf() {
        super("Boeuf", "Bovidae", "Bos");
    }

    @Override
    public void seNourrir() {

        System.out.println("Je suis herbivore.");
    }

    @Override
    public void seDeplacer() {

        System.out.println("Je me déplace sur mes 4 pattes");
    }

    @Override
    public void mangerPlantes() {

        System.out.println("Je mange des herbes dans les prairies.");
    }
}
