package bridge.model;

public abstract class Pen {
    final public Ruler ruler;

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }

    public abstract void draw();
}
