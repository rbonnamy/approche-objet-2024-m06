package animaux.mammiferes;

import animaux.Animal;

public abstract class Mammifere extends Animal {

    private String nom;
    private String famille;
    private String genre;

    public Mammifere(String nom, String famille, String genre) {
        this.nom = nom;
        this.famille = famille;
        this.genre = genre;
    }

    public final void allaiter(){
        System.out.println("Tous les mammifères allaitent leurs petits.");
    }

    public final void seReproduire(){
        System.out.println("Tous les mammifères, sans exception, ont une reproduction sexuée.");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
