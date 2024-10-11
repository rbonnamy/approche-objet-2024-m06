package animaux;

import animaux.comportements.Carnivore;
import animaux.mammiferes.Boeuf;
import animaux.mammiferes.Dauphin;
import animaux.mammiferes.Lion;
import animaux.mammiferes.Mammifere;
import animaux.oiseaux.Aigle;
import animaux.oiseaux.Oiseau;

public class TestAnimal {
    public static void main(String[] args) {

        // Je peux invoquer la méthode traiterAnimal avec n'importe quelle instance de classe
        // qui hérite d'Animal. Exemple :
        traiterAnimal(new Boeuf());
        traiterAnimal(new Aigle());

        // Je peux invoquer la méthode traiterMammifere avec n'importe quelle instance de classe
        // qui hérite de Mammifere. Exemple :
        traiterMammifere(new Dauphin());
        traiterMammifere(new Lion());

        // Je peux invoquer la méthode traiterOiseau avec n'importe quelle instance de classe
        // qui hérite de Oiseau. Exemple :
        traiterOiseau(new Aigle());

        // Je peux invoquer la méthode traiterCarnivore avec n'importe quelle instance de classe
        // qui implémente Carnivore. Exemple :
        traiterCarnivore(new Lion());
        traiterCarnivore(new Aigle());
    }

    public static void traiterAnimal(Animal animal){
        // Code ici concernant l'animal
    }

    public static void traiterMammifere(Mammifere mammifere){
        // Code ici concernant le mammifère
    }

    public static void traiterOiseau(Oiseau oiseau){
        // Code ici concernant l'oiseau
    }

    public static void traiterCarnivore(Carnivore carnivore){
        // Code ici concernant le carnivore
    }
}
