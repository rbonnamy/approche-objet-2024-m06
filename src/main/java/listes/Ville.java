package listes;

/**
 * Cette classe représente le concept de <strong>Ville</strong> dans le projet<br>
 * Elle implémente la classe Comparable.
 */
public class Ville implements Comparable<Ville> {

    /** Nom de la ville */
    private String nom;

    /** Nombre d'habitants */
    private int nbHabs;

    /**
     * Constructeur
     * @param nom nom de ville
     * @param nbHabs nombre d'habitants
     */
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

    /**
     * Getter pour nbHabs
     * @return int
     */
    public int getNbHabs() {
        return nbHabs;
    }

    /**
     * Setter pour nbHabs
     */
    public void setNbHabs(int nbHabs) {
        this.nbHabs = nbHabs;
    }

    /**
     * Getter pour nom
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
