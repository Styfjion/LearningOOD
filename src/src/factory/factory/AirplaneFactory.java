package factory.factory;

import factory.product.Airplane;
import factory.product.Enemy;

import java.util.Random;

public class AirplaneFactory implements Factory{

    @Override
    public Enemy creat(int screenWidth) {
        Random random = new Random();
        return new Airplane(random.nextInt(screenWidth), 0);
    }
}
