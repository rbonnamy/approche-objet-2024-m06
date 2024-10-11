package conway;

public class Grille {

    private int[][] cellules = new int[20][5];

    public int getNbVoisins(int i, int j){
        int nbVoisins = 0;

        for (int indexI = i-1; indexI <= i+1; indexI++) {
            for (int indexJ = j - 1; indexJ <= j + 1; indexJ++) {
                if (existe(indexI, indexJ)) {
                    if (cellules[indexI][indexJ]=='X'){
                        nbVoisins++;
                    }
                }
            }
        }
        return nbVoisins;
    }

    // A revoir
    public boolean existe(int indexI, int indexJ){
        if (indexI<0 || indexI>5){
            return false;
        }
        if (indexJ<0 || indexJ>20){
            return false;
        }
        return true;
    }

}
