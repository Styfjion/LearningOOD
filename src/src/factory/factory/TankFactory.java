package factory.factory;

import factory.product.Enemy;
import factory.product.Tank;

import java.util.Random;

public class TankFactory implements Factory{

    @Override
    public Enemy creat(int screenWidth) {
        Random random = new Random();
        return new Tank(random.nextInt(screenWidth), 0);
    }
}
