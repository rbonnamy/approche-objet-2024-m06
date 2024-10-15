package strings;

import static strings.StringUtils.append;

public class TestStringBuilder {
    public static void main(String[] args) {
        int age = 15;
        String nom = "Lee";

        StringBuilder builder = new StringBuilder();
        builder.append("Bonjour M.").append(nom).append(". Vous avez ").append(age).append(" ans");
        String resultat = builder.toString();
        System.out.println(resultat);

        String resultat2 = append("Bonjour M.", nom, ". Vous avez ", age, " ans");
        System.out.println(resultat2);
    }
}
