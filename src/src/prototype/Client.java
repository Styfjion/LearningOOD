package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        List<EnemyPlane> enemyPlaneList = new ArrayList<>();
        var enumValues = BulletType.values();
        for (int i = 0; i < 500; i++) {
            Optional<EnemyPlane> enemyPlane = EnemyPlaneFactory.getInstance(new Random().nextInt(200),
                    new Random().nextInt(100), enumValues[i % enumValues.length]);
            enemyPlane.ifPresent(enemyPlaneList::add);
        }
        System.out.println(enemyPlaneList.size());
    }
}
