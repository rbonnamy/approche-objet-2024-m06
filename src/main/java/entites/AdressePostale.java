package entites;

import listes.Ville;

/**
 * Classe adresse postale
 */
public class AdressePostale {

    // Variable d'instances
    // Elles ont une valeur par défaut
    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    // Variable de classe = partagée
    static int compteur = 0;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
        compteur++;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AdressePostale)) {
            return false;
        }
        AdressePostale autre = (AdressePostale) obj;
        return     this.libelleRue.equals(autre.libelleRue)
                && this.numeroRue==autre.numeroRue
                && this.ville.equals(autre.ville)
                && this.codePostal==autre.codePostal;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "codePostal=" + codePostal +
                ", numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }


    /** Getter
     * @return int
     */
    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
