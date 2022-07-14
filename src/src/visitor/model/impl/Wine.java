package visitor.model.impl;

import visitor.model.Product;
import visitor.visitor.Acceptable;
import visitor.visitor.Visitor;

import java.time.LocalDate;

public class Wine extends Product implements Acceptable {
    public Wine(String name, LocalDate produceDate, float price) {
        super(name, produceDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
