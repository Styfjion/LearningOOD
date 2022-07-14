package visitor.visitor.impl;

import visitor.model.impl.Candy;
import visitor.model.impl.Fruit;
import visitor.model.impl.Wine;
import visitor.visitor.Visitor;

import java.text.NumberFormat;
import java.time.LocalDate;

public class DiscountVisitor implements Visitor{
    private final LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
    }

    @Override
    public void visit(Candy candy) {
        System.out.println("====糖果【" + candy.getName() + "】打折后的价格====");
        float rate = 0;
        var days = billDate.toEpochDay() - candy.getProduceDate().toEpochDay();
        if (days > 180) {
            System.out.println("超过半年的糖果，请勿食用！");
        } else {
            rate = 0.9f;
        }
        float discountPrice = candy.getPrice() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("====酒【" + wine.getName() + "】无折扣价格====");
        System.out.println(NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("====水果【" + fruit.getName() + "】打折后的价格====");
        float rate = 0;
        var days = billDate.toEpochDay() - fruit.getProduceDate().toEpochDay();
        if (days > 7) {
            System.out.println("超过7天的水果，请勿食用！");
        } else if (days > 3){
            rate = 0.5f;
        } else {
            rate = 1;
        }
        float discountPrice = fruit.getPrice() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));
    }
}
