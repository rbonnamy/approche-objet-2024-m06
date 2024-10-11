package immobilier;

import java.util.ArrayList;

public class Maison {

    private ArrayList<Piece> listePieces = new ArrayList<>();

    public Maison() {
    }

    // En paramètre de cette méthode je passe une variable
    // de type Piece
    // donc on peut passer une chambre, une cuisine, un salon, etc.
    public void addPiece(Piece piece){
        this.listePieces.add(piece);
    }

    public double getSuperficie(){
        double sup = 0.0;

        // calcul ici
        for (Piece p : listePieces){
            sup+=p.getSuperficie();
        }

        return sup;
    }
}
