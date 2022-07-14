package observer.model;

public abstract class Buyer {
    protected final String name;

    public Buyer(String name) {
        this.name = name;
    }

    public abstract void inform(String product);
}
