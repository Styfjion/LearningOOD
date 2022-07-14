package interpreter.model.impl;

import interpreter.model.Expression;

public class Repetition implements Expression {
    private int loopCount;

    private final Expression loopBodySequence;

    public Repetition(int loopCount, Expression loopBodySequence) {
        this.loopCount = loopCount;
        this.loopBodySequence = loopBodySequence;
    }

    @Override
    public void interpreter() {
        while (loopCount > 0) {
            loopBodySequence.interpreter();
            loopCount--;
        }
    }
}
