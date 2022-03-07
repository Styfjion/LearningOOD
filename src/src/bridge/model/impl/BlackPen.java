package bridge.model.impl;

import bridge.model.Pen;
import bridge.model.Ruler;

public class BlackPen extends Pen {
    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        ruler.regularize();
    }
}
