package interpreter.model.impl;

import interpreter.model.Expression;

public class LeftKeyClick implements Expression {
    private final LeftKeyDown leftKeyDown;

    private final LeftKeyUp leftKeyUp;

    public LeftKeyClick() {
        leftKeyDown = new LeftKeyDown();
        leftKeyUp = new LeftKeyUp();
    }

    @Override
    public void interpreter() {
        leftKeyDown.interpreter();
        leftKeyUp.interpreter();
    }
}
