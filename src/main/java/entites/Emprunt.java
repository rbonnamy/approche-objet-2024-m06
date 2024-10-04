package entites;

public class Emprunt {

    String type;
    int annee;

    public Emprunt(){
        type = "Immobilier";
        annee = 2024;
    }

    public Emprunt(String type, int annee){
        this.type = type;
        this.annee = annee;
    }
}
