package mammifere;

import mammifere.comportements.Carnivore;

public class Dauphin extends Mammifere implements Carnivore {

    public Dauphin() {
        super("Dauphin", "Delphinidae", "Lagenorhynchus");
    }

    @Override
    public void seNourrir() {

        System.out.println("Je suis carnivore.");
    }

    @Override
    public void seDeplacer() {

        System.out.println("Je me déplace en nageant principalement dans les océans et les mers");
    }

    @Override
    public void chasser() {

        System.out.println("Je chasse en groupe des bancs de poissons.");
    }
}
