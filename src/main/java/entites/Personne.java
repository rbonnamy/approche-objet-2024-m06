package entites;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void afficher(){
        System.out.println(prenom+" "+nom.toUpperCase());
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setAdresse(AdressePostale adr){
        this.adresse = adr;
    }

    public AdressePostale getAdresse(){
        return adresse;
    }

}
