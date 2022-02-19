package composite.model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    private final List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    public void tree(int space) {
        super.tree(space);
        space++; //循环子节点前，空格数要加1
        int finalSpace = space;
        childrenNodes.forEach(u -> u.tree(finalSpace));
    }
}
