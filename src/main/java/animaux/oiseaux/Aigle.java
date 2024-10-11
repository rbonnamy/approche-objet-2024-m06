package animaux.oiseaux;

import animaux.comportements.Carnivore;

public class Aigle extends Oiseau implements Carnivore {
    @Override
    public void seNourrir() {
        System.out.println("Je chasse des petits mammifères mais également des oiseaux.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en volant.");
    }

    @Override
    public void chasser() {
        System.out.println("Je chasse depuis les airs. Dès que j'ai repéré ma proie je fonds dessus.");
    }
}
