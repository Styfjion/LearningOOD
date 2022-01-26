package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.AlineFactory;
import abstract_factory.factory.HumanFactory;
import abstract_factory.product.Unit;

public class Client {
    public static void main(String[] args) {
        System.out.println("游戏开始......");
        System.out.println("双方挖矿攒钱......");

        System.out.println("工人建造人类族工厂......");
        AbstractFactory factory = new HumanFactory(10, 10);

        Unit marine = factory.creatLowClass();
        marine.show();

        Unit tank = factory.creatMidClass();
        tank.show();

        Unit ship = factory.creatHighClass();
        ship.show();

        System.out.println("工蜂建造外星怪兽族工厂......");
        factory = new AlineFactory(200, 200);

        Unit roach = factory.creatLowClass();
        roach.show();

        Unit poison = factory.creatMidClass();
        poison.show();

        Unit mammoth = factory.creatHighClass();
        mammoth.show();

        System.out.println("两族开始大混战......");

        marine.attack();
        tank.attack();
        ship.attack();
        roach.attack();
        poison.attack();
        mammoth.attack();
    }
}
