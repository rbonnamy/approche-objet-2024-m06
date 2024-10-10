package mammifere;

import mammifere.comportements.Carnivore;

public class Chat extends Mammifere implements Carnivore {

    public Chat() {
        super("Chat", "Felidae", "Felis");
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
        System.out.println("Je chasse des petits rongeurs et des oiseaux.");
    }
}
