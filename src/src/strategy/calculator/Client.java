package strategy.calculator;

import strategy.calculator.model.Calculator;
import strategy.calculator.model.impl.Addition;
import strategy.calculator.model.impl.Substraction;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Addition());
        System.out.println(calculator.getResult(1, 1));

        calculator.setStrategy(new Substraction());
        System.out.println(calculator.getResult(1, 1));
    }
}
