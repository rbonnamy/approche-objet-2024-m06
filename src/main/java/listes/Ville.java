package listes;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabs;

    public Ville(String nom, int nbHabs) {
        this.nom = nom;
        this.nbHabs = nbHabs;
    }

    public int compareTo(Ville autre){
        if (this.nbHabs > autre.getNbHabs()){
            return 1;
        }
        else if (this.nbHabs < autre.getNbHabs()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nbHabs=" + nbHabs +
                ", nom='" + nom + '\'' +
                '}';
    }

    public int getNbHabs() {
        return nbHabs;
    }

    public void setNbHabs(int nbHabs) {
        this.nbHabs = nbHabs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
