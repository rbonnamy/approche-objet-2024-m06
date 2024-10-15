package listes.comparators;

import listes.Ville;

import java.util.Comparator;

public class VilleComparator implements Comparator<Ville> {

    private int type;

    public static final int TRI_NOM_ASCENDANT = 0;
    public static final int TRI_NOM_DESCENDANT = 1;

    public VilleComparator(int type) {
        this.type = type;
    }

    @Override
    public int compare(Ville o1, Ville o2) {
        if (type==TRI_NOM_ASCENDANT) {
            if (o1.getNbHabs() > o2.getNbHabs()) {
                return 1;
            } else if (o1.getNbHabs() < o2.getNbHabs()) {
                return -1;
            }
        }
        else if (type==TRI_NOM_DESCENDANT){
            if (o1.getNbHabs() > o2.getNbHabs()) {
                return -1;
            } else if (o1.getNbHabs() < o2.getNbHabs()) {
                return 1;
            }
        }
        return 0;
    }
}
