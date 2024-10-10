package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TraitementFichierCompact {
    public static void main(String[] args) throws IOException {

        // Lecture fichier et stockage de son contenu dans une Liste de String
        Path cheminFichierRecensement = Paths.get("C:/Temp/recensement.csv");
        List<String> listeLignes = Files.readAllLines(cheminFichierRecensement);

        ArrayList<String> lignesFichierSortie = new ArrayList<>();
        lignesFichierSortie.add("Nom commune;Code département;Nom région;Population totale;");

        // Parcours du contenu du fichier d'origine et constitutation du fichier de sortie
        for (int i=1; i<listeLignes.size(); i++) {
            String[] elements = listeLignes.get(i).split(";");
            Commune commune = new Commune(elements[6], elements[2], elements[1], Integer.parseInt(elements[9].replaceAll(" ", "")));

            if (commune.getPopulation() > 25000) {
                lignesFichierSortie.add(commune.getNom() + ";" + commune.getCodeDepartement() + ";" + commune.getNomRegion() + ";" + commune.getPopulation());
            }
        }

        Path cheminFichierSortie = Paths.get("C:/Temp/recensement_25k_2024_M06.csv");
        Files.write(cheminFichierSortie, lignesFichierSortie);

    }

}
