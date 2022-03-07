package bridge.model.impl;

import bridge.model.Ruler;

public class TriangleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("△");
    }
}
