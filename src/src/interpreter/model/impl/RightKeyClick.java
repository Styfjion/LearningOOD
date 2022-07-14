package interpreter.model.impl;

import interpreter.model.Expression;

public class RightKeyClick implements Expression {
    private final RightKeyDown leftKeyDown;

    private final RightKeyUp leftKeyUp;

    public RightKeyClick() {
        leftKeyDown = new RightKeyDown();
        leftKeyUp = new RightKeyUp();
    }

    @Override
    public void interpreter() {
        leftKeyDown.interpreter();
        leftKeyUp.interpreter();
    }
}
