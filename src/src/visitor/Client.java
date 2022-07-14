package visitor;

import visitor.model.Product;
import visitor.model.impl.Candy;
import visitor.model.impl.Fruit;
import visitor.model.impl.Wine;
import visitor.visitor.Acceptable;
import visitor.visitor.Visitor;
import visitor.visitor.impl.DiscountVisitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Acceptable> products = Arrays.asList(
                new Candy("小兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("老猫白酒", LocalDate.of(2017, 1, 1), 100.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f, 2.5f)
        );
        Visitor visitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
        for(var product : products) {
            product.accept(visitor);
        }
    }
}
