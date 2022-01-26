package factory.factory;

import factory.product.Airplane;
import factory.product.Enemy;
import factory.product.Tank;

import java.util.Random;

public class SimpleFactory {
    private final int screenWidth;
    private final Random random;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type) {
        int x = random.nextInt(screenWidth);
        return switch (type) {
            case "AirPlane" -> new Airplane(x, 0);
            case "Tank" -> new Tank(x, 0);
            default -> null;
        };
    }
}
