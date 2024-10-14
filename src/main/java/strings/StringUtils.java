package strings;

public class StringUtils {

    public static String premiereLettreMaj(String nom){
        return nom.substring(0, 1).toUpperCase()+nom.substring(1);
    }
}
