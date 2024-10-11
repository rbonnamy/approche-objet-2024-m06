package fichiers;

import enumerations.ToString;

public class Commune {

    @ToString(separateur = "-", upperCase = true)
    private String nom;

    @ToString(separateur = "-", upperCase = true)
    private String codeDepartement;

    @ToString(separateur = "-")
    private String nomRegion;

    @ToString
    private int population;

    public Commune(String nom, String codeDepartement, String nomRegion, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNom() {
        return nom;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }
}
