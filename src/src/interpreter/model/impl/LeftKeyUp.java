package interpreter.model.impl;

import interpreter.model.Expression;

public class LeftKeyUp implements Expression {
    @Override
    public void interpreter() {
        System.out.println("松开鼠标：左键");
    }
}
