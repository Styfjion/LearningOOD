package interpreter.model.impl;

import interpreter.model.Expression;

public class LeftKeyDown implements Expression {
    @Override
    public void interpreter() {
        System.out.println("按下鼠标：左键");
    }
}
