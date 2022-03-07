package bridge.model.impl;

import bridge.model.Pen;
import bridge.model.Ruler;

public class WhitePen extends Pen {
    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        ruler.regularize();
    }
}
