package varargs;

public class TestStackOverflow {
    public static void main(String[] args) {

        appel(null);
    }

    public static void appel(String code) {
        if (code == null) { // quand on compare à null un objet, seul cas où on utilise le double =

        }
        System.out.println(code.length());
    }

}
