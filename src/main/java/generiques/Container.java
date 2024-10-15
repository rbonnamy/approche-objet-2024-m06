package generiques;

public class Container<T extends Number, U> {
    private T id;
    private U code;

    public Container(T id, U code) {
        this.id = id;
        this.code = code;
    }

    public U getCode() {
        return code;
    }

    public void setCode(U code) {
        this.code = code;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
