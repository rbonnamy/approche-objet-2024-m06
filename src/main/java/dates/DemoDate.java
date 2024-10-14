package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DemoDate {
    public static void main(String[] args) throws Exception {
        Date d = new Date(124, 9, 14); // 14/10/2024 et oui !!!!
        System.out.println(d);

        Date sysDate = new Date(); // seul constructeur non déprécié
        System.out.println(sysDate);

        // Avec Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2005);
        System.out.println(cal.getTime());

        // Parser une chaine de caractères
        String dateNaissanceStr = "12/07/2001";
        SimpleDateFormat toto = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);

        System.out.println(toto.format(sysDate));
    }
}
