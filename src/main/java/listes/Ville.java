package listes;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabs;

    public Ville(String nom, int nbHabs) {
        this.nom = nom;
        this.nbHabs = nbHabs;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville)){
            return false;
        }
        Ville autre = (Ville)obj;
        return this.nom.equals(autre.nom) && this.nbHabs==autre.nbHabs;
    }

    @Override
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
