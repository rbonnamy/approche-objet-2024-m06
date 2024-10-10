package fichiers;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class TestWriteFichier {
    // On ajoute le mot clé throws Exception dans le main pour "traiter" les exceptions de manière brutale.
    // Si une exception se produit, on plante l'application.
    public static void main(String[] args) throws Exception {

        List<String> lignesOrigine = Files.readAllLines(Paths.get("C:/Temp/recensement.csv"));

        ArrayList<String> lignesSortie = new ArrayList<>(); // Elle est vide
        for (int i=0; i<lignesOrigine.size(); i++){
            if (i%2 == 0){
                lignesSortie.add(lignesOrigine.get(i));
            }
        }
        Path pathCible = Paths.get("C:/Temp/recensement_out.csv");

        Files.write(pathCible, lignesSortie);
        System.out.println("L'opération s'est bien passée");
    }
}
