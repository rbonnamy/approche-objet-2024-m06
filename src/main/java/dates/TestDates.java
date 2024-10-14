package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        /*
        o Créez une instance de la classe java.util.Date à la date du jour en utilisant un de
          ses constructeurs
        o Affichez l’instance ainsi créée au format suivant :
            ▪ jour/mois/année (sans la partie heure)
        o Créez une instance de la classe Date à la date du 19/05/2016 à 23:59:30
          secondes
        o Affichez l’instance ainsi créée au format suivant :
            ▪ année/mois/jour heure:minute:seconde
        o Créez une instance de Date contenant la date/heure système et affichez-la au
          même format que ci-dessus.
         */

        Date dateJour = new Date();
        SimpleDateFormat formateurJour = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateurJour.format(dateJour));

        Date dateMai2016 = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat formateurJourHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateurJourHeure.format(dateMai2016));
        System.out.println(formateurJourHeure.format(new Date()));
    }
}
