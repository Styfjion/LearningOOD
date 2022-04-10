package strategy.calculator.model.impl;

import strategy.calculator.model.Strategy;

public class Addition implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
