package prototype;

import java.util.Optional;

public class EnemyPlaneFactory {
    private static final EnemyPlane ENEMY_PLANE = new EnemyPlane(200, new Bullet(100, BulletType.BOMB));

    public static Optional<EnemyPlane> getInstance(int x, int power, BulletType bulletType) {
        try {
            EnemyPlane clone = ENEMY_PLANE.clone();
            clone.setX(x);
            Bullet bullet = clone.getBullet();
            bullet.setPower(power);
            bullet.setBulletType(bulletType);
            return Optional.of(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
