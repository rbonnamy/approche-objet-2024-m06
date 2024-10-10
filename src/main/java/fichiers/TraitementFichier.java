package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TraitementFichier {
    public static void main(String[] args) throws IOException {

        // Création de l'ArrayList de Commune
        ArrayList<Commune> listeCommunes = new ArrayList<>();

        // Lecture fichier et stockage de son contenu dans une Liste de String
        Path cheminFichierRecensement = Paths.get("C:/Temp/recensement.csv");
        List<String> listeLignes = Files.readAllLines(cheminFichierRecensement);

        // Récupération de la ligne d'entête contenant les noms de colonnes
        String entete = listeLignes.get(0);

        // Parcours du contenu du fichier
        for (int i=1; i<listeLignes.size(); i++){
            String ligne = listeLignes.get(i);

            // Créer une instance de commune par ligne du fichier et on va stocker
            // chaque commune dans une liste de communes.

            // - Etape 1 : on découpe la ligne en tableau de String sur la base du car ;
            //             chaque tableau a une longueur de 10
            String[] elements = ligne.split(";");

            // - Etape 2 : récupération et traitement des données
            String nomCommune = elements[6];
            String nomRegion = elements[1];
            String codeDept = elements[2];
            int populationTotale = Integer.parseInt(elements[9].replaceAll(" ", ""));

            // - Etape 3 : création de la commune pour la ligne courante
            Commune commune = new Commune(nomCommune, codeDept, nomRegion, populationTotale);

            // - Etape 4 : ajout dans la liste de communes
            listeCommunes.add(commune);
        }
        System.out.println(listeLignes.getFirst());

        // Création du fichier de sortie et constitution de la liste de lignes de ce fichier
        ArrayList<String> lignesFichierSortie = new ArrayList<>();
        lignesFichierSortie.add("Nom commune;Code département;Nom région;Population totale;");

        for (Commune commune: listeCommunes){
            if (commune.getPopulation()>=25000){
                String ligneSortie = commune.getNom()+";"+commune.getCodeDepartement()+";"+commune.getNomRegion()+";"+commune.getPopulation();
                lignesFichierSortie.add(ligneSortie);
            }
        }

        // Ecriture des lignes dans le fichier de sortie
        Path cheminFichierSortie = Paths.get("C:/Temp/recensement_25k_2024_M06.csv");
        Files.write(cheminFichierSortie, lignesFichierSortie);

    }

}
