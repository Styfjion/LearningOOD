package interpreter;

import interpreter.model.Expression;
import interpreter.model.impl.*;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Expression sequence = new Sequence(Arrays.asList(
           new Move(500, 600),
           new Repetition(5, new Sequence(Arrays.asList(
                   new LeftKeyClick(),
                   new Delay(1),
                   new RightKeyClick()
           )))
        ));
        sequence.interpreter();
    }
}
