package factory.factory;

import factory.product.Boss;
import factory.product.Enemy;

public class BossFactory implements Factory{

    @Override
    public Enemy creat(int screenWidth) {
        return new Boss(screenWidth / 2, 0);
    }
}
