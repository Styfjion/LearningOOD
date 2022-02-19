package composite.model;

public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract void add(Node child);

    public void tree(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(name);
    }

    public void tree() {
        tree(0);
    }
}
