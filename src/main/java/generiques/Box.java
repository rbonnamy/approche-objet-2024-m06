package generiques;

public class Box<T, U> {

    private T id;
    private U content;

    public Box(T id, U content) {
        this.id = id;
        this.content = content;
    }

    public T getId() {
        return id;
    }
    public U getContent() {
        return content;
    }


    public void setContent(U content) {
        this.content = content;
    }

    public void setId(T id) {
        this.id = id;
    }

}
