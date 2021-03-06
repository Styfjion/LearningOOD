package visitor.model.impl;

import visitor.model.Product;
import visitor.visitor.Acceptable;
import visitor.visitor.Visitor;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable {

    private float weight;

    public Fruit(String name, LocalDate produceDate, float price, float weight) {
        super(name, produceDate, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
