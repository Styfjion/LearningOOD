package bridge.model.impl;

import bridge.model.Ruler;

public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("○");
    }
}
