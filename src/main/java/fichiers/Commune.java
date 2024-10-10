package fichiers;

public class Commune {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
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
