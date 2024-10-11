package generiques;

public class TestBox {
    /**
     * Le chemin d'accès au fichier etc..
     * @param args
     */
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(12, "Hello");
        box.setContent("Hello");
        int id = box.getId();
    }
}
