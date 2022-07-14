package interpreter.model.impl;

import interpreter.model.Expression;

public class RightKeyDown implements Expression {
    @Override
    public void interpreter() {
        System.out.println("按下鼠标：右键");
    }
}
