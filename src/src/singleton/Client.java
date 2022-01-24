package singleton;

import singleton.eager.Sun;
import singleton.laze.LazySun;

class GetSun implements Runnable {
    @Override
    public void run() {
        Sun sun = Sun.getInstance();
        System.out.println(sun.attr);
        LazySun lazySun = LazySun.getInstance();
        System.out.println(lazySun.attr);
    }
}

public class Client {
    public static void main(String[] args) {
        GetSun thread = new GetSun();
        for (int i = 0; i < 3; i++) {
            new Thread(thread).start();
        }
    }
}
