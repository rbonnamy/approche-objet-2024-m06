package strings;

import listes.Ville;

public class TestString {
    public static void main(String[] args) {
        // les String sont immutables
        String s1 = "Hello World";
        s1 = s1.concat(" les amis");

        String nom = "rochard";
        String nomMaj = StringUtils.premiereLettreMaj(nom);

        System.out.println(nomMaj);

        //

        StringBuilder builder = new StringBuilder("Bonjour");
        builder.append(" les amis.").append(25).append(" renouvellements de remerciements.").append(new Ville("Pau", 9700));
        System.out.println(builder.toString());

    }
}
