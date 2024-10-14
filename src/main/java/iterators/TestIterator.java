package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();

        Iterator<Integer> iterEntiers = liste.iterator();

        while (iterEntiers.hasNext()){
            Integer i = iterEntiers.next();
            System.out.println(i);
        }

        iterEntiers = liste.iterator(); // réinitialisation de l'iterator.
        while (iterEntiers.hasNext()){
            Integer i = iterEntiers.next();
            System.out.println(i);
        }

    }
}
