package entites;

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
    public String toString() {
        return "AdressePostale{" +
                "codePostal=" + codePostal +
                ", numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
