package factory;

import factory.factory.*;

public class Client {

    private static void testSimpleFactory() {
        System.out.println("游戏开始");
        SimpleFactory simpleFactory = new SimpleFactory(100);
        simpleFactory.create("AirPlane").show();
        simpleFactory.create("Tank").show();
    }

    private static void testFactory() {
        int screenWidth = 100;
        System.out.println("游戏开始");
        Factory factory = new TankFactory();

        for (int i = 0; i < 5; i++) {
            factory.creat(screenWidth).show();
        }

        factory = new AirplaneFactory();
        for (int i = 0; i < 5; i++) {
            factory.creat(screenWidth).show();
        }

        System.out.println("抵达关底");
        factory = new BossFactory();
        factory.creat(screenWidth).show();
    }

    public static void main(String[] args) {
        System.out.println("简单工厂测试");
        testSimpleFactory();
        System.out.println("--------------------------------------");
        System.out.println("工厂模式测试");
        testFactory();
    }
}
