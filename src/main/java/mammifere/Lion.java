package mammifere;

import mammifere.comportements.Carnivore;

public class Lion extends Mammifere implements Carnivore {

    public Lion() {
        super("Lion", "Felidae", "Panthera");
    }

    @Override
    public void seNourrir() {
        System.out.println("Je suis carnivore.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en marchant ou en courant sur mes 4 pattes");
    }

    @Override
    public void chasser() {
        System.out.println("Dans la savane ce sont les femelles lionnes qui chassent. Le mâle ne chasse pas.");
    }
}
